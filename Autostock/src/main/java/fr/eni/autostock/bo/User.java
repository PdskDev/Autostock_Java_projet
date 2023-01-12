package fr.eni.autostock.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Merci d'indiquer la civilité")
	@NotNull
	private String gender;
	
	@NotBlank(message = "Merci de saisir le nom de famille")
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Merci de saisir le prénom")
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank(message = "Merci de préciser l'adresse")
	@NotNull
	private String adresse;
	
	@NotBlank(message = "Le code postale n'a pas été renseigné")
	@NotNull
	private String codePostal;
	
	@NotBlank(message = "Le nom de la ville n'a pas été saisi")
	@NotNull
	private String city;
	
	@NotBlank(message = "Le numéro de téléphone est obligatoire")
	@NotNull
	private String phone;
	
	@NotBlank(message = "L'adresse email est obligatoire")
	@NotNull
	private String email;
	
	@NotBlank(message = "Vous devez saisir un mot de passe")
	@NotNull
	private String password;
	
	@OneToMany(orphanRemoval = true)
	private List<Caddie> listCaddies;
	
	
	public User() {
		super();
	}
	
	public User(String gender, String lastName, String firstName, String adresse, String codePostal, String city,
			String phone, String email, String password) {
		super();
		this.gender = gender;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}


	public User(String gender, String lastName, String firstName, String adresse, String codePostal, String city,
			String phone, String email, String password, List<Caddie> listCaddies) {
		super();
		this.gender = gender;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.listCaddies = listCaddies;
	}


	public User(long id, String gender, String lastName, String firstName, String adresse, String codePostal,
			String city, String phone, String email, String password, List<Caddie> listCaddies) {
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
		builder.append(", password=");
		builder.append(password);
		builder.append(", listCaddies=");
		builder.append(listCaddies);
		builder.append("]");
		return builder.toString();
	}

}
