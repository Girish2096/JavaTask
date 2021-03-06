package com.girish.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long newid;
	private long id;
	private double price;
	private double qty;
	private double quoteQty;
	private long time;
	private boolean isBuyerMaker;
	private boolean isBestMatch;
	
	
	public long getNewid() {
		return newid;
	}
	public void setNewid(long newid) {
		this.newid = newid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getQuoteQty() {
		return quoteQty;
	}
	public void setQuoteQty(double quoteQty) {
		this.quoteQty = quoteQty;
	}

	public long getTime() {
		return time;
	}
	
	public boolean isBuyerMaker() {
		return isBuyerMaker;
	}
	public void setisBuyerMaker(boolean isBuyerMaker) {
		this.isBuyerMaker = isBuyerMaker;
	}
	public boolean isBestMatch() {
		return isBestMatch;
	}
	public void setisBestMatch(boolean isBestMatch) {
		this.isBestMatch = isBestMatch;
	}
	@Override
	public String toString() {
		return "Coin [newid=" + newid + ", id=" + id + ", price=" + price + ", qty=" + qty + ", quoteQty=" + quoteQty
				+ ", time=" + time + ", isBuyerMaker=" + isBuyerMaker + ", isBestMatch=" + isBestMatch + "]";
	}
	

	
	
	
	
}
