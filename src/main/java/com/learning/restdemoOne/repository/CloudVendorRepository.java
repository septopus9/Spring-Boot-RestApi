package com.learning.restdemoOne.repository;

import com.learning.restdemoOne.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor ,String>{
}
