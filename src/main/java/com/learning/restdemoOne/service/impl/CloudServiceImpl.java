package com.learning.restdemoOne.service.impl;

import com.learning.restdemoOne.model.CloudVendor;
import com.learning.restdemoOne.repository.CloudVendorRepository;
import com.learning.restdemoOne.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }



    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);

        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return null;
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {

        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {

        return cloudVendorRepository.findAll();
    }
}
