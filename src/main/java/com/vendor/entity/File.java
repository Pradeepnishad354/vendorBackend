package com.vendor.entity;

import org.springframework.data.mongodb.gridfs.GridFsResource;

public class File {
	
	 private String fId;
	 private  GridFsResource  file;
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public GridFsResource getFile() {
		return file;
	}
	public void setFile(GridFsResource file) {
		this.file = file;
	}
	public File(String fId, GridFsResource file) {
		super();
		this.fId = fId;
		this.file = file;
	}
	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 

}
