package com.vendor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vendor.entity.Vendor;

public interface VendorRepository extends MongoRepository<Vendor, String> {

}
