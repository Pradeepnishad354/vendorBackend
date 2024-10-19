package com.vendor.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.autoconfigure.mongo.MongoConnectionDetails.GridFs;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "contracts")

public class Contract {
	
	   @Id
	    private String cId;
	    private String details;
	    private LocalDate startDate;
	    private LocalDate endDate;

	    @DBRef
	    private Vendor vendor;

	    @DBRef
	    private List<GridFs> contractFiles;

		public String getcId() {
			return cId;
		}

		public void setcId(String cId) {
			this.cId = cId;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public Vendor getVendor() {
			return vendor;
		}

		public void setVendor(Vendor vendor) {
			this.vendor = vendor;
		}

		public List<GridFs> getContractFiles() {
			return contractFiles;
		}

		public void setContractFiles(List<GridFs> contractFiles) {
			this.contractFiles = contractFiles;
		}

		public Contract(String cId, String details, LocalDate startDate, LocalDate endDate, Vendor vendor,
				List<GridFs> contractFiles) {
			super();
			this.cId = cId;
			this.details = details;
			this.startDate = startDate;
			this.endDate = endDate;
			this.vendor = vendor;
			this.contractFiles = contractFiles;
		}
	    
	    

}
