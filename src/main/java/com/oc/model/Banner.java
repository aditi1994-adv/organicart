package com.oc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Banner implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8571197582715932631L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bannerId;

}
