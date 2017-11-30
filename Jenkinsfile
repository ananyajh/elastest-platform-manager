node('docker'){
    stage "Container Prep"

    echo("the node is up")
    def mycontainer = docker.image('elastest/ci-docker-siblings:latest')
    mycontainer.pull() // make sure we have the latest available from Docker Hub

    mycontainer.inside("-u jenkins -v /var/run/docker.sock:/var/run/docker.sock:rw") {

        git 'https://github.com/elastest/elastest-platform-manager'

        stage "Unit tests"
            echo ("Starting unit tests...")
            sh './gradlew test jacocoTestReport'
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])

        //stage "Upload test coverage"
        //    echo ("Upload reports to Codecov")
        //    sh './gradlew jacocoTestReport'
        //    def codecovArgs = '-K '
        //    if (env.GITHUB_PR_NUMBER != '') {
        //      // This is a PR
        //      codecovArgs += "-B ${env.GITHUB_PR_TARGET_BRANCH} " +
        //          "-C ${env.GITHUB_PR_HEAD_SHA} " +
        //          "-P ${env.GITHUB_PR_NUMBER} "
        //    } else {
        //      // Not a PR
        //      codecovArgs += "-B ${env.GIT_BRANCH} " +
        //          "-C ${env.GIT_COMMIT} "
        //    }
        //    sh "curl -s https://codecov.io/bash | bash -s - ${codecovArgs} -t ${COB_EPM_TOKEN} || echo 'Codecov did not collect coverage reports'"
        
        stage "Package"
            echo ("Compiling EPM ...")
            sh './gradlew build -x test'

        stage "Build image - Package"
            echo ("Building docker image...")
            sh 'cp build/libs/elastest-platform-manager-*.jar docker/elastest-platform-manager/epm.jar'
            def myimage = docker.build("elastest/epm","./docker/elastest-platform-manager")

        stage "Run image"
            echo "Run the image..."
            myimage.run()

        stage "Integration tests"
            echo ("Starting integration tests...")
            echo ("No integration tests yet")

        stage "Publish"
            echo ("Publishing as all tests succeeded...")
            //this is work arround as withDockerRegistry is not working properly
            withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'elastestci-dockerhub',
                              usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
                sh 'docker login -u "$USERNAME" -p "$PASSWORD"'
                myimage.push()
        }
    }
}
