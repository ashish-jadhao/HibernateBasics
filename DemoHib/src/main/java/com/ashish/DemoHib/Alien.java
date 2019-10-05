package com.ashish.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {			// POJO

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", color=" + color + "]";
	}
	@Id
	private int aid;
	private String aName;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
