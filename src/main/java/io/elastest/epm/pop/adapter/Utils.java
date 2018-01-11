package io.elastest.epm.pop.adapter;

import io.elastest.epm.model.*;
import io.elastest.epm.pop.generated.ResourceGroupProto;
import io.elastest.epm.repository.NetworkRepository;
import io.elastest.epm.repository.VduRepository;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.kamranzafar.jtar.TarEntry;
import org.kamranzafar.jtar.TarOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Utils {

  public static File convert(MultipartFile file) throws IOException {
    File convFile = new File(file.getOriginalFilename());
    convFile.createNewFile();
    FileOutputStream fos = new FileOutputStream(convFile);
    fos.write(file.getBytes());
    fos.close();
    return convFile;
  }

  public static File compressFileToTar(File file) throws IOException {
    File temp = File.createTempFile("archive", ".tar");
    temp.deleteOnExit();
    FileOutputStream fileOutputStream = new FileOutputStream(temp);
    TarOutputStream out = new TarOutputStream(new BufferedOutputStream(fileOutputStream));

    // Files to tar
    File[] filesToTar = new File[1];
    filesToTar[0] = file;

    for (File f : filesToTar) {
      out.putNextEntry(new TarEntry(f, f.getName()));
      BufferedInputStream origin = new BufferedInputStream(new FileInputStream(f));

      int count;
      byte data[] = new byte[2048];
      while ((count = origin.read(data)) != -1) {
        out.write(data, 0, count);
      }

      out.flush();
      origin.close();
    }

    out.close();
    fileOutputStream.close();
    return temp;
  }

  @Autowired private NetworkRepository networkRepository;

  @Autowired private VduRepository vduRepository;

  public ResourceGroup parseRGProto(ResourceGroupProto rg, PoP pop) {
    ResourceGroup resourceGroup = new ResourceGroup();
    resourceGroup.setName(rg.getName());

    for (ResourceGroupProto.Network networkCompose : rg.getNetworksList()) {
      Network network = new Network();
      network.setName(networkCompose.getName());
      network.setCidr(networkCompose.getCidr());
      network.setPoPName(pop.getName());
      network.setNetworkId(networkCompose.getNetworkId());
      networkRepository.save(network);
      resourceGroup.addNetworksItem(network);
    }

    for (ResourceGroupProto.VDU vduCompose : rg.getVdusList()) {

      VDU vdu = new VDU();
      vdu.setName(vduCompose.getName());
      vdu.setImageName(vduCompose.getImageName());
      vdu.setComputeId(vduCompose.getComputeId());
      vdu.setNetName(vduCompose.getNetName());
      vdu.setPoPName(pop.getName());
      vdu.setIp(vduCompose.getIp());
      for (ResourceGroupProto.MetadataEntry metadataEntryCompose : vduCompose.getMetadataList()) {
        KeyValuePair kvp =
            new KeyValuePair(metadataEntryCompose.getKey(), metadataEntryCompose.getValue());
        vdu.addMetadataItem(kvp);
      }
      vduRepository.save(vdu);
      resourceGroup.addVdusItem(vdu);
    }

    return resourceGroup;
  }
}
