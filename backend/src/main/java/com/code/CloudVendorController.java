package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
@CrossOrigin(origins = "*")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    // Get all vendors
    @GetMapping
    public List<CloudVendor> getAllVendors() {
        return cloudVendorService.getAllVendors();
    }

    // Get a single vendor by ID
    @GetMapping("/{vendorId}")
    public CloudVendor getVendorById(@PathVariable Integer vendorId) {
        return cloudVendorService.getVendorById(vendorId);
    }

    // Create a new vendor
    @PostMapping
    public CloudVendor createVendor(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createVendor(cloudVendor);
    }

    // Update an existing vendor
    @PutMapping("/{vendorId}")
    public CloudVendor updateVendor(@PathVariable Integer vendorId, @RequestBody CloudVendor cloudVendor) {
        cloudVendor.setVendorId(vendorId);
        return cloudVendorService.updateVendor(cloudVendor);
    }

    // Delete a vendor
    @DeleteMapping("/{vendorId}")
    public String deleteVendor(@PathVariable Integer vendorId) {
        return cloudVendorService.deleteVendor(vendorId);
    }
}

