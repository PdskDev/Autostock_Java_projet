package fr.eni.autostock.bo;

public class Energy {
	
	private long id;
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
