package com.code;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {

}
