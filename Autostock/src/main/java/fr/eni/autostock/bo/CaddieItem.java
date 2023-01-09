package fr.eni.autostock.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "caddie_items")
public class CaddieItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private long caddie_id;
	private long car_id;
	
	@NotNull
	private int qty;

	
	public CaddieItem() {
		super();
	}


	public CaddieItem(long id, long caddie_id, long car_id, int qty) {
		super();
		this.id = id;
		this.caddie_id = caddie_id;
		this.car_id = car_id;
		this.qty = qty;
	}

	public CaddieItem(long caddie_id, long car_id, int qty) {
		super();
		this.caddie_id = caddie_id;
		this.car_id = car_id;
		this.qty = qty;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getCaddie_id() {
		return caddie_id;
	}


	public void setCaddie_id(long caddie_id) {
		this.caddie_id = caddie_id;
	}


	public long getCar_id() {
		return car_id;
	}


	public void setCar_id(long car_id) {
		this.car_id = car_id;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaddieItem [id=");
		builder.append(id);
		builder.append(", caddie_id=");
		builder.append(caddie_id);
		builder.append(", car_id=");
		builder.append(car_id);
		builder.append(", qty=");
		builder.append(qty);
		builder.append("]");
		return builder.toString();
	}

}
