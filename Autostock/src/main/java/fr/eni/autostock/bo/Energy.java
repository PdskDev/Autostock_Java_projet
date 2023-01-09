package fr.eni.autostock.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "energies")
public class Energy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@NotNull
	private String label;
	
	public Energy() {
		super();
	}
	
	
	public Energy(String label) {
		super();
		this.label = label;
	}
	
	
	public Energy(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Energy [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}

}
