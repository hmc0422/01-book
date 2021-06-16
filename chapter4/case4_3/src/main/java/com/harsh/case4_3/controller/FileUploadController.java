package com.harsh.case4_3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request) {
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(folder, newName));
            return new StringBuilder()
                    .append(request.getScheme())
                    .append("://")
                    .append(request.getServerName())
                    .append(":")
                    .append(request.getServerPort())
                    .append("/uploadFile/")
                    .append(format)
                    .append(newName).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }


    @PostMapping("/uploads")
    public String uploads(MultipartFile[] uploadFiles, HttpServletRequest request) {
        for (MultipartFile uploadFile : uploadFiles) {
            String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
            String format = sdf.format(new Date());
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
            try {
                uploadFile.transferTo(new File(folder, newName));
                return new StringBuilder()
                        .append(request.getScheme())
                        .append("://")
                        .append(request.getServerName())
                        .append(":")
                        .append(request.getServerPort())
                        .append("/uploadFile/")
                        .append(format)
                        .append(newName).toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "上传失败";
    }

}
