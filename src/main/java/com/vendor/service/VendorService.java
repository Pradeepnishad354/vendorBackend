package com.vendor.service;

import com.vendor.entity.Vendor;
import java.util.*;
public interface VendorService {
	
	
	public Vendor onboardVendor(Vendor vendor);
	
	public Vendor getVendorById(String vendorId);
	
	
	public Vendor updateVendor(String vendorId,Vendor vendor);
	
	public void deleteVendor(String vendorId);
	
	public List<Vendor> findAllVendor( );

}
