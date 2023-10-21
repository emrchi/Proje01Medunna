package team01.pojos.US_15_PostPatient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import team01.pojos.US_15_GetPatient.CountryResponse;
import team01.pojos.US_15_GetPatient.CstateResponse;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostPatientPojo implements Serializable {
	private String createdBy;
	private String createdDate;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String phone;
	private String gender;
	private String bloodGroup;
	private String adress;
	private String email;
	private String description;
	private UserPojo user;
	private Object appointments;
	private Object inPatients;
	private CountryResponse country;
	private CstateResponse cstate;

	public PostPatientPojo(String createdBy, String createdDate, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String email, String description, UserPojo user, Object appointments, Object inPatients, CountryResponse country, CstateResponse cstate) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.adress = adress;
		this.email = email;
		this.description = description;
		this.user = user;
		this.appointments = appointments;
		this.inPatients = inPatients;
		this.country = country;
		this.cstate = cstate;
	}

	public PostPatientPojo() {
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}

	public String getBloodGroup(){
		return bloodGroup;
	}

	public void setAdress(String adress){
		this.adress = adress;
	}

	public String getAdress(){
		return adress;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setUser(UserPojo user){
		this.user = user;
	}

	public UserPojo getUser(){
		return user;
	}

	public void setAppointments(Object appointments){
		this.appointments = appointments;
	}

	public Object getAppointments(){
		return appointments;
	}

	public void setInPatients(Object inPatients){
		this.inPatients = inPatients;
	}

	public Object getInPatients(){
		return inPatients;
	}

	public void setCountry(CountryResponse country){
		this.country = country;
	}

	public CountryResponse getCountry(){
		return country;
	}

	public void setCstate(CstateResponse cstate){
		this.cstate = cstate;
	}

	public CstateResponse getCstate(){
		return cstate;
	}

	@Override
 	public String toString(){
		return 
			"PostPatientPojo{" + 
			"createdBy = '" + createdBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",phone = '" + phone + '\'' + 
			",gender = '" + gender + '\'' + 
			",bloodGroup = '" + bloodGroup + '\'' + 
			",adress = '" + adress + '\'' + 
			",email = '" + email + '\'' + 
			",description = '" + description + '\'' + 
			",user = '" + user + '\'' + 
			",appointments = '" + appointments + '\'' + 
			",inPatients = '" + inPatients + '\'' + 
			",country = '" + country + '\'' + 
			",cstate = '" + cstate + '\'' + 
			"}";
		}
}