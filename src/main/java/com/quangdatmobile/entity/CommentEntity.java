package com.quangdatmobile.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity {

	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "content", columnDefinition = "TEXT")
	private String content;
	
	@OneToMany(mappedBy = "comment")
	private Set<ItemEntity> items;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<ItemEntity> getItems() {
		return items;
	}

	public void setItems(Set<ItemEntity> items) {
		this.items = items;
	}
}
