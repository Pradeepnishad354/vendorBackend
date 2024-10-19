package com.vendor.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	
	  @Id
	    private String id;
	    private String username;
	    private String role;  
	    @DBRef
	    private List<Interaction> interactions;

	    @DBRef
	    private List<Vendor> vendors;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public List<Interaction> getInteractions() {
			return interactions;
		}

		public void setInteractions(List<Interaction> interactions) {
			this.interactions = interactions;
		}

		public List<Vendor> getVendors() {
			return vendors;
		}

		public User(String id, String username, String role, List<Interaction> interactions, List<Vendor> vendors) {
			super();
			this.id = id;
			this.username = username;
			this.role = role;
			this.interactions = interactions;
			this.vendors = vendors;
		}

		public void setVendors(List<Vendor> vendors) {
			this.vendors = vendors;
		}
	    
	    
}
