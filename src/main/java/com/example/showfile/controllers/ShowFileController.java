package com.example.showfile.controllers;

import com.example.showfile.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ShowFileController {

    @Autowired
    FileStorageService fileStorageService;

    @ResponseBody
    @GetMapping("/showfile")
    public void showFile2(HttpServletResponse response) throws IOException {
        System.out.println("Start showFile");
        byte[] file = fileStorageService.getFile();
        response.getOutputStream().write(file);
        response.flushBuffer();
    }

}
