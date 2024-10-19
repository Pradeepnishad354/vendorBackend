package com.vendor.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.entity.Vendor;
import com.vendor.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Vendor onboardVendor(Vendor vendor) {
		Vendor vendor2 = this.vendorRepository.save(vendor);
		return vendor2;
	}

	@Override
	public Vendor getVendorById(String vendorId) {
		Optional<Vendor> vendor = this.vendorRepository.findById(vendorId);
		return vendor.orElseThrow(()->new RuntimeException("vendor not found"));
	}

	@Override
	public Vendor updateVendor(String vendorId, Vendor vendor) {
	Vendor existingVendor = getVendorById(vendorId);
	
	existingVendor.setName(vendor.getName());
	existingVendor.setEmail(vendor.getEmail());
	existingVendor.setPhone(vendor.getPhone());
	
	existingVendor.setCategory(vendor.getCategory());
	
	//existingVendor.setContracts(vendor.getContracts());
	//existingVendor.setInteractions(vendor.getInteractions());
	//existingVendor.setPerformance(vendor.getPerformance());
	existingVendor.setPerformanceScore(vendor.getPerformanceScore());
	 existingVendor.setUpdatedAt(new Date());
	 existingVendor.setAddress(vendor.getAddress());;
		return vendorRepository.save(existingVendor);
	}

	@Override
	public void deleteVendor(String vendorId) {
		
		vendorRepository.deleteById(vendorId);
		
	}

	@Override
	public List<Vendor> findAllVendor() {
		List<Vendor> all = vendorRepository.findAll();
		return all;
	}

}
