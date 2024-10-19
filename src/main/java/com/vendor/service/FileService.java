package com.vendor.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.mongodb.client.gridfs.model.GridFSFile;

 public interface FileService {
	
	 public String storeFile(MultipartFile file) throws IOException ;
	 public GridFSFile getFileById(String id) ;
	 public InputStream getFileStreamById(String id);
}
