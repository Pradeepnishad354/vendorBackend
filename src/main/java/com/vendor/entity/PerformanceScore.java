package com.vendor.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "performance_scores")
public class PerformanceScore {
	
	 @Id
	    private String pScoreid;
	    private double score;
	    private double deliveryKPI;
	    private double qualityKPI;
	    private double responseTimeKPI;

	    @DBRef
	    private Vendor vendor;

		

		public String getpScoreid() {
			return pScoreid;
		}



		public void setpScoreid(String pScoreid) {
			this.pScoreid = pScoreid;
		}



		public double getScore() {
			return score;
		}



		public void setScore(double score) {
			this.score = score;
		}



		public double getDeliveryKPI() {
			return deliveryKPI;
		}



		public void setDeliveryKPI(double deliveryKPI) {
			this.deliveryKPI = deliveryKPI;
		}



		public double getQualityKPI() {
			return qualityKPI;
		}



		public void setQualityKPI(double qualityKPI) {
			this.qualityKPI = qualityKPI;
		}



		public double getResponseTimeKPI() {
			return responseTimeKPI;
		}



		public void setResponseTimeKPI(double responseTimeKPI) {
			this.responseTimeKPI = responseTimeKPI;
		}



		public Vendor getVendor() {
			return vendor;
		}



		public void setVendor(Vendor vendor) {
			this.vendor = vendor;
		}



		public PerformanceScore(String pScoreid, double score, double deliveryKPI, double qualityKPI,
				double responseTimeKPI, Vendor vendor) {
			super();
			this.pScoreid = pScoreid;
			this.score = score;
			this.deliveryKPI = deliveryKPI;
			this.qualityKPI = qualityKPI;
			this.responseTimeKPI = responseTimeKPI;
			this.vendor = vendor;
		}



		public PerformanceScore() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
