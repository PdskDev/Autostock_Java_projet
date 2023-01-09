package fr.eni.autostock.bo;

import java.util.List;

public class Car {
	
	private long id;
	private String brand;
	private String model;
	private String energy;
	private List<Option> options;
	
	public Car() {
		super();
	}
	
	
	public Car(String brand, String model, String energy, List<Option> options) {
		super();
		this.brand = brand;
		this.model = model;
		this.energy = energy;
		this.options = options;
	}
	
	
	public Car(long id, String brand, String model, String energy, List<Option> options) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.energy = energy;
		this.options = options;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getEnergy() {
		return energy;
	}


	public void setEnergy(String energy) {
		this.energy = energy;
	}


	public List<Option> getOptions() {
		return options;
	}


	public void setOptions(List<Option> options) {
		this.options = options;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [id=");
		builder.append(id);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", model=");
		builder.append(model);
		builder.append(", energy=");
		builder.append(energy);
		builder.append(", options=");
		builder.append(options);
		builder.append("]");
		return builder.toString();
	}

}
