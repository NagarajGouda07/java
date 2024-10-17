package com.xworkz.MallDto;


public class MallDto {

	private int id;
	private String name;
	private Location location;
	private String owner;
	double landDimension;
	
	public MallDto(int id, String name, Location location, String owner, double landDimension) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.landDimension = landDimension;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getLandDimension() {
		return landDimension;
	}

	public void setLandDimension(double landDimension) {
		this.landDimension = landDimension;
	}

	@Override
	public String toString() {
		return "MallDto [id=" + id + ", name=" + name + ", location=" + location + ", owner=" + owner
				+ ", landDimension=" + landDimension + "]";
	}
	
	
	

}
