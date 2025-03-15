package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorService {

    @Autowired
    private CloudVendorRepository vendorRepository;

    // Get vendor by ID
    public CloudVendor getVendorById(Integer vendorId) {
        Optional<CloudVendor> vendor = vendorRepository.findById(vendorId);
        return vendor.orElseThrow(() -> new RuntimeException("Vendor not found with ID: " + vendorId));
    }

    // Get list of all vendors
    public List<CloudVendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    // Create a new vendor
    public CloudVendor createVendor(CloudVendor cloudVendor) {
        return vendorRepository.save(cloudVendor);
    }

    // Update an existing vendor
    public CloudVendor updateVendor(CloudVendor cloudVendor) {
        if (!vendorRepository.existsById(cloudVendor.getVendorId())) {
            throw new RuntimeException("Vendor not found with ID: " + cloudVendor.getVendorId());
        }
        return vendorRepository.save(cloudVendor);
    }

    // Delete a vendor
    public String deleteVendor(Integer vendorId) {
        if (!vendorRepository.existsById(vendorId)) {
            throw new RuntimeException("Vendor not found with ID: " + vendorId);
        }
        vendorRepository.deleteById(vendorId);
        return "Vendor deleted successfully";
    }
}

