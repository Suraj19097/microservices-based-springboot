package com.code;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CloudVendor_Table")
public class CloudVendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
     
}
