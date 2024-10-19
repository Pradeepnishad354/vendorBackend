package com.vendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;

import com.vendor.service.FileService;


@Controller
@RequestMapping("/files")
public class FileController {
	
	 @Autowired
	    private FileService fileService;

	    // Endpoint for file upload
	    @PostMapping("/upload")
	    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
	        String fileId = fileService.storeFile(file);
	        return ResponseEntity.ok("File uploaded successfully with ID: " + fileId);
	    }

	    // Endpoint for retrieving file by ID
	    @GetMapping("/view/{id}")
	    public ResponseEntity<InputStreamResource> viewFile(@PathVariable String id) {
	        InputStream fileStream = fileService.getFileStreamById(id);
	        if (fileStream == null) {
	            return ResponseEntity.notFound().build();
	        }
	        // Example for image file; change MediaType accordingly for other types
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.IMAGE_JPEG);
	        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(fileStream));
	    }

}
