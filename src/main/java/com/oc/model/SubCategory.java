package com.oc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SubCategory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4482243023032183410L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subCateId;
	private String subCateName = "";
	private Date createdDate;
	private Date lastEdit;
	private Integer status=0;
	

	
	@ManyToOne
	private Category cate;


	public Long getSubCateId() {
		return subCateId;
	}
	public void setSubCateId(Long subCateId) {
		this.subCateId = subCateId;
	}
	public String getSubCateName() {
		return subCateName;
	}
	public void setSubCateName(String subCateName) {
		this.subCateName = subCateName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastEdit() {
		return lastEdit;
	}
	public void setLastEdit(Date lastEdit) {
		this.lastEdit = lastEdit;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Category getCate() {
		return cate;
	}
	public void setCate(Category cate) {
		this.cate = cate;
	}
	
	
	
}
