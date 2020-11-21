package com.quangdatmobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class InfoEntity extends BaseEntity {
	
	@Column(name = "company", length = 20)
	private String company;
	
	@Column(name = "weight")
	private Integer weight;
	
	@Column(name = "romphone")
	private Integer romPhone;
	
	@Column(name = "ramphone")
	private Integer ramPhone;
	
	@Column(name = "screensize")
	private Integer screenSize;
	
	@Column(name = "systemversion", length = 20)
	private String systemVersion;
	
	@Column(name = "chipset", length = 40)
	private String chipset;
	
	@Column(name = "pinphone", length = 20)
	private String pinPhone;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getRomPhone() {
		return romPhone;
	}

	public void setRomPhone(Integer romPhone) {
		this.romPhone = romPhone;
	}

	public Integer getRamPhone() {
		return ramPhone;
	}

	public void setRamPhone(Integer ramPhone) {
		this.ramPhone = ramPhone;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getChipset() {
		return chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getPinPhone() {
		return pinPhone;
	}

	public void setPinPhone(String pinPhone) {
		this.pinPhone = pinPhone;
	}
}
