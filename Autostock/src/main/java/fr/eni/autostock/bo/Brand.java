package fr.eni.autostock.bo;

public class Brand {
	
	private long id;
	private String name;
	
	public Brand() {
		super();
	}
	
	public Brand(String name) {
		super();
		this.name = name;
	}
	
	
	public Brand(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brand [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	

}
