package fr.eni.autostock.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cities")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@NotNull
	private String name;
	
	@NotBlank
	@NotNull
	private String codePostal;
	
	public City() {
		super();
	}
	
	public City(String name, String codePostal) {
		super();
		this.name = name;
		this.codePostal = codePostal;
	}
	
	public City(long id, String name, String codePostal) {
		super();
		this.id = id;
		this.name = name;
		this.codePostal= codePostal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append("]");
		return builder.toString();
	}
	
}
