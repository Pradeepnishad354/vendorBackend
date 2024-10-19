package com.vendor.service;

import java.io.IOException;
import java.io.InputStream;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.gridfs.model.GridFSUploadOptions;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFSBucket gridFSBucket;

	  

	    // Store file
	    public String storeFile(MultipartFile file) throws IOException {
	        GridFSUploadOptions options = new GridFSUploadOptions()
	                .chunkSizeBytes(1024)
	                .metadata(null);

	        ObjectId fileId = gridFsTemplate.store(file.getInputStream(), file.getOriginalFilename(), file.getContentType(), options);
	        return fileId.toString();
	    }

	    // Retrieve file by ID
	    public GridFSFile getFileById(String id) {
	        return gridFsTemplate.findOne(new org.springframework.data.mongodb.core.query.Query(
	                org.springframework.data.mongodb.core.query.Criteria.where("_id").is(id)));
	    }

	    // Retrieve file as InputStream
	    public InputStream getFileStreamById(String id) {
	        GridFSFile gridFSFile = getFileById(id);
	        if (gridFSFile == null) {
	            return null;
	        }
	        GridFSDownloadStream downloadStream = gridFSBucket.openDownloadStream(gridFSFile.getObjectId());
	        return downloadStream;
	    }
}
