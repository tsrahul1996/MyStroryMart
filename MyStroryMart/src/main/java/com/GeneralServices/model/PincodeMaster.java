package com.GeneralServices.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pincode_master_temp")
@NoArgsConstructor @Data
@IdClass(PincodeMaster.class)
public class PincodeMaster implements Serializable  {
	
	@Column(name ="country_code")
	private String countryCode; 
	
	@Id
	@Column(name ="pincode")
	private int pincode;
	
	@Column(name ="state_code")
	private String stateCode;
	
	@Column(name ="district_code")
	private DistrictMaster districtCode;
	
	/*
	 * @OneToMany(mappedBy="pincodeRecord", cascade = CascadeType.ALL) private
	 * List<DistrictMaster> districtRecord;
	 */
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "district_code",referencedColumnName="district_code")
	 * private DistrictMaster districtCode;
	 */
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public DistrictMaster getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(DistrictMaster districtCode) {
		this.districtCode = districtCode;
	}
	
}
