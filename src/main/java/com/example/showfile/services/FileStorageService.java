package com.example.showfile.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class FileStorageService {

  private final static String fileName = "/mir.pdf";

  public byte[] getFile() {
      InputStream inputStream = FileStorageService.class.getResourceAsStream(fileName);
      byte[] array;
      try {
          assert inputStream != null;
          array = inputStream.readAllBytes();
          inputStream.close();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
      return array;
  }

}
