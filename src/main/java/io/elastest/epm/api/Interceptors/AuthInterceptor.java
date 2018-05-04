package io.elastest.epm.api.Interceptors;

import io.elastest.epm.exception.UnauthorizedException;
import io.elastest.epm.properties.KeystoneProperties;
import org.openstack4j.api.OSClient.OSClientV3;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.openstack.OSFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Service
public class AuthInterceptor extends HandlerInterceptorAdapter{

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired private KeystoneProperties keystoneProperties;

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {


        Identifier ident = Identifier.byName(keystoneProperties.getDomain());
        OSClientV3 os = OSFactory.builderV3()
                    .endpoint(keystoneProperties.getEndpoint())
                    .credentials(keystoneProperties.getUsername(), keystoneProperties.getPassword(),
                            ident)
                    .authenticate();


        String authToken = request.getHeader("Authorization");
        //log.info("Token is " + authToken);
        if (authToken != null && os.identity().tokens().check(authToken).isSuccess()) {
            log.info("Token is valid. Grant request");
            return true;
        } else {
            log.info("Token is invalid. Request denied");
            throw new UnauthorizedException("Please use the valid keystone-token in order to authorize " +
                    "for a request");
            //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Please use the valid keystone-token in order to authorize for a request");
            //return false;
        }
    }


}
