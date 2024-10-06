package com.xworkz.collection.dto;

import java.io.Serializable;

public class MatchBoxDTO implements Serializable{
	
	Double cost;
	String brand;
	
	public MatchBoxDTO() {
		super();
	}

	public MatchBoxDTO(Double cost) {
		super();
		this.cost = cost;
	}
	
	public MatchBoxDTO(String brand) {
		super();
		this.brand = brand;
	}

	public MatchBoxDTO(Double cost, String brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "MatchBoxDTO [cost=" + cost + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchBoxDTO other = (MatchBoxDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		return true;
	}
}
