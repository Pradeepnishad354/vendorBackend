package com.vendor.entity;

import java.util.Date;
import java.util.List;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "vendors")
public class Vendor {

	    
	    @Id
	 
	    private String vendorId;
	    private String name;
	    private String email;
	    private String phone;
	    private String category;
	    private double performanceScore;
	    private String address;
	    private String fileId;
	    private String fileName;
	    private String fileType;
	    private String fileUrl;
	    
	    @DBRef
	    private List<Contract> contracts;

	    @DBRef
	    private List<Interaction> interactions;

	    @DBRef
	    private PerformanceScore performance;
	    
	    
	    
	    public String getFileUrl() {
			return fileUrl;
		}





		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}





		public String getFileId() {
			return fileId;
		}





		public void setFileId(String fileId) {
			this.fileId = fileId;
		}





		public String getFileName() {
			return fileName;
		}





		public void setFileName(String fileName) {
			this.fileName = fileName;
		}





		public String getFileType() {
			return fileType;
		}





		public void setFileType(String fileType) {
			this.fileType = fileType;
		}





		private Date createdAt;
	    private Date updatedAt;
	    
	    public Vendor() {
	        this.createdAt = new Date();
	        this.updatedAt = new Date();
	    }

		

		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public double getPerformanceScore() {
			return performanceScore;
		}

		public void setPerformanceScore(double performanceScore) {
			this.performanceScore = performanceScore;
		}

		public List<Contract> getContracts() {
			return contracts;
		}

		public void setContracts(List<Contract> contracts) {
			this.contracts = contracts;
		}

		public List<Interaction> getInteractions() {
			return interactions;
		}

		public void setInteractions(List<Interaction> interactions) {
			this.interactions = interactions;
		}

		public PerformanceScore getPerformance() {
			return performance;
		}

		public void setPerformance(PerformanceScore performance) {
			this.performance = performance;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}





		public String getVendorId() {
			return vendorId;
		}





		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}





		public Vendor(String vendorId, String name, String email, String phone, String category,
				double performanceScore, List<Contract> contracts, List<Interaction> interactions,
				PerformanceScore performance, Date createdAt, Date updatedAt) {
			super();
			this.vendorId = vendorId;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.category = category;
			this.performanceScore = performanceScore;
			this.contracts = contracts;
			this.interactions = interactions;
			this.performance = performance;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}





		public String getAddress() {
			return address;
		}





		public void setAddress(String address) {
			this.address = address;
		}

		
	    
	   
	    
	    

}
