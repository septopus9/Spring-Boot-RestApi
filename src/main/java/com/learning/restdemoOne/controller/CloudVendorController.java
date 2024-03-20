package com.learning.restdemoOne.controller;

import com.learning.restdemoOne.model.CloudVendor;
import com.learning.restdemoOne.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



   //Read Specific cloud details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);

    }
    //Read All  cloud details
    @GetMapping
    public List <CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
       cloudVendorService.createCloudVendor(cloudVendor );
        return "Cloud vendor Created successfully";


    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor update successfully";


    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable ("vendorId")String vendorId){
       cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully";


    }








}
