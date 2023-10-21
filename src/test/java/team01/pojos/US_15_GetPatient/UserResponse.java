package team01.pojos.US_15_GetPatient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse implements Serializable {
	private String createdBy;
	private Object createdDate;
	private int id;
	private String login;
	private String firstName;
	private String lastName;
	private String email;
	private boolean activated;
	private String langKey;
	private String imageUrl;
	private Object resetDate;
	private String ssn;

	public UserResponse() {
	}

	public UserResponse(String createdBy, Object createdDate, int id, String login, String firstName, String lastName, String email, boolean activated, String langKey, String imageUrl, Object resetDate, String ssn) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.id = id;
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.activated = activated;
		this.langKey = langKey;
		this.imageUrl = imageUrl;
		this.resetDate = resetDate;
		this.ssn = ssn;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setCreatedDate(Object createdDate){
		this.createdDate = createdDate;
	}

	public Object getCreatedDate(){
		return createdDate;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getLogin(){
		return login;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setActivated(boolean activated){
		this.activated = activated;
	}

	public boolean isActivated(){
		return activated;
	}

	public void setLangKey(String langKey){
		this.langKey = langKey;
	}

	public String getLangKey(){
		return langKey;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setResetDate(Object resetDate){
		this.resetDate = resetDate;
	}

	public Object getResetDate(){
		return resetDate;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	@Override
 	public String toString(){
		return 
			"UserResponse{" + 
			"createdBy = '" + createdBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",id = '" + id + '\'' + 
			",login = '" + login + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",email = '" + email + '\'' + 
			",activated = '" + activated + '\'' + 
			",langKey = '" + langKey + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",resetDate = '" + resetDate + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}