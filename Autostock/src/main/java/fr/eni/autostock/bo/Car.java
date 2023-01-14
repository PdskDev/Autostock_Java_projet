package fr.eni.autostock.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Merci de sélectionner une marque")
	@NotNull
	private String brand;
	
	@NotBlank(message = "Merci d'indiquer le modèle")
	@NotNull
	private String model;
	
	@NotBlank(message = "Merci d'indiquer le type de carburant")
	@NotNull
	private String energy;
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(
			name = "cars_options",
			joinColumns = @JoinColumn(name = "car_id"),
			inverseJoinColumns = @JoinColumn(name="option_id")
			)
	private List<Option> options = new ArrayList<>();
	
	private double price;
	
	private String picture;
	
	private int optionOpt;
	
	public Car() {
		super();
	}
	
	
	public Car(String brand, String model, String energy, List<Option> options, double price, String picture) {
		super();
		this.brand = brand;
		this.model = model;
		this.energy = energy;
		this.options = options;
		this.price = price;
		this.picture = picture;
	}
	
	
	public Car(long id, String brand, String model, String energy, List<Option> options, double price, String picture) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.energy = energy;
		this.options = options;
		this.price = price;
		this.picture = picture;
	}
	
	
	public Car(String brand, String model, String energy, List<Option> options, int option, double price, String picture) {
		super();
		this.brand = brand;
		this.model = model;
		this.energy = energy;
		this.options = options;
		this.optionOpt = option;
		this.price = price;
		this.picture = picture;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBrand() {
		return brand.toUpperCase();
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model.toUpperCase();
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getEnergy() {
		return energy.toUpperCase();
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public int getOptionOpt() {
		return optionOpt;
	}

	public void setOptionOpt(int option) {
		this.optionOpt = option;
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
		builder.append(", price=");
		builder.append(price);
		builder.append(", picture=");
		builder.append(picture);
		builder.append("]");
		return builder.toString();
	}
	
}
