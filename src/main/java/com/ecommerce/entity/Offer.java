package com.ecommerce.entity;
// Generated 8 Aug, 2017 10:53:27 AM by Hibernate Tools 5.2.3.Final


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


/**
 * Offer generated by hbm2java
 */
@Entity
@Table(name = "offer", catalog = "e_commerce_1")
@Component
public class Offer implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private long offerId;
	private Product product;
	private String offerDescription;

	public Offer() {
	}

	@Id
	@Column(name = "offerId", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public long getOfferId() {
		return this.offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "productId", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "offerDescription", length = 100)
	public String getOfferDescription() {
		return this.offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

}