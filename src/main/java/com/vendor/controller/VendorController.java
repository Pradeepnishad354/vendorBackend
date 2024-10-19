package com.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vendor.entity.Vendor;
import com.vendor.service.VendorService;

@Controller
@CrossOrigin("*")
@RequestMapping("/vendor")

public class VendorController {

	
	@Autowired
	private VendorService vendorService;
	
	 @PostMapping("/onboard")
	    public ResponseEntity<Vendor> onboardVendor(@RequestBody Vendor vendor) {
	        Vendor newVendor = vendorService.onboardVendor(vendor);
	        return new ResponseEntity<>(newVendor, HttpStatus.CREATED);
	    }
	 
	 
	 @GetMapping("/get-all-vendor")
	 public ResponseEntity<List<Vendor>> getAllVendors() {

		    List<Vendor> allVendor = vendorService.findAllVendor();

		    return new ResponseEntity<>(allVendor, HttpStatus.OK);
		}
	 
	 @GetMapping("/{vendorId}")
	 public ResponseEntity<Vendor> getOneVendor(@PathVariable String vendorId){
		 
		 Vendor vendorById = vendorService.getVendorById(vendorId);
		 return new  ResponseEntity<Vendor>(vendorById,HttpStatus.OK);
	 }
	 
	 @PutMapping("/update/{vendorId}")
	 public ResponseEntity<Vendor> updateVendor(@PathVariable String vendorId,@RequestBody Vendor vendor){
		 
		 Vendor vendorById = vendorService.updateVendor(vendorId,vendor);
		 return new  ResponseEntity<Vendor>(vendorById,HttpStatus.OK);
	 }

	 @DeleteMapping("/{vendorId}")
	 public void  deleteVendor(@PathVariable String vendorId){
	   vendorService.deleteVendor(vendorId);
	 }
	 
}
