package com.learning.restdemoOne.service;

import com.learning.restdemoOne.model.CloudVendor;

import java.util.List;

public interface CloudVendorService  {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId );
    public  CloudVendor getCloudVendor(String cloudVendorId);

    public List<CloudVendor> getAllCloudVendors();



}
