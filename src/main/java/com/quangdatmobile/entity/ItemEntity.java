package com.quangdatmobile.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemEntity extends BaseEntity {

	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "name", length = 40)
	private String name;
	
	@Column(name = "shortdescription", columnDefinition = "TEXT")
	private String shortDescription;
	
	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@OneToOne
	@JoinColumn(name = "infoid", nullable = false)
	private InfoEntity info;
	
	@ManyToMany(mappedBy = "items")
	private List<OrderEntity> orders = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "companyid", nullable = false)
	private CompanyEntity company;
	
	@ManyToOne
	@JoinColumn(name = "commentid", nullable = false)
	private CommentEntity comment;

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

	public CommentEntity getComment() {
		return comment;
	}

	public void setComment(CommentEntity comment) {
		this.comment = comment;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public InfoEntity getInfo() {
		return info;
	}

	public void setInfo(InfoEntity info) {
		this.info = info;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
}
