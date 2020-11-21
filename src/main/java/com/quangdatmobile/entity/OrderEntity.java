package com.quangdatmobile.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orderphone")
public class OrderEntity extends BaseEntity {

	@Column(name = "fullname", length = 50, nullable = false)
	private String fullName;
	
	@Column(name = "phonenumber")
	private Integer phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "note", columnDefinition = "TEXT")
	private String note;
	
//	status = 1 == pending. status = 2 == complete. status = 3 == cancel
	@Column(name = "status")
	private Integer status;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "orderphone_item", joinColumns = @JoinColumn(name = "orderid"),
									inverseJoinColumns = @JoinColumn(name = "itemid"))
	private List<ItemEntity> items = new ArrayList<>();
	
	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
