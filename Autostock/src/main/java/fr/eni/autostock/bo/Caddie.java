package fr.eni.autostock.bo;

import java.util.Date;
import java.util.List;

public class Caddie {
	
	private long id;
	private Date date;
	private long user_id;
	private List<CaddieItem> lisItems;
	
	public Caddie() {
		super();
	}

	public Caddie(Date date, long user_id, List<CaddieItem> lisItems) {
		super();
		this.date = date;
		this.user_id = user_id;
		this.lisItems = lisItems;
	}

	public Caddie(long id, Date date, long user_id, List<CaddieItem> lisItems) {
		super();
		this.id = id;
		this.date = date;
		this.user_id = user_id;
		this.lisItems = lisItems;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public List<CaddieItem> getLisItems() {
		return lisItems;
		
	}

	public void setLisItems(List<CaddieItem> lisItems) {
		this.lisItems = lisItems;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caddie [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", user_id=");
		builder.append(user_id);
		builder.append("]");
		return builder.toString();
	}
}
