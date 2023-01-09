package fr.eni.autostock.bo;

import java.util.List;

public class User {
	
	private long id;
	private String gender;
	private String lastName;
	private String firstName;
	private String adresse;
	private String codePostal;
	private String city;
	private String phone;
	private String email;
	private String login;
	private String password;
	private List<Caddie> listCaddies;
	
	
	public User() {
		super();
	}


	public User(String gender, String lastName, String firstName, String adresse, String codePostal, String city,
			String phone, String email, String login, String password, List<Caddie> listCaddies) {
		super();
		this.gender = gender;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.login = login;
		this.password = password;
		this.listCaddies = listCaddies;
	}


	public User(long id, String gender, String lastName, String firstName, String adresse, String codePostal,
			String city, String phone, String email, String login, String password, List<Caddie> listCaddies) {
		super();
		this.id = id;
		this.gender = gender;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.login = login;
		this.password = password;
		this.listCaddies = listCaddies;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Caddie> getListCaddies() {
		return listCaddies;
	}


	public void setListCaddies(List<Caddie> listCaddies) {
		this.listCaddies = listCaddies;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", city=");
		builder.append(city);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", listCaddies=");
		builder.append(listCaddies);
		builder.append("]");
		return builder.toString();
	}

}
