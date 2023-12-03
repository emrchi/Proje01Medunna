package team01.pojos.US_15_GetPatient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CstateResponse implements Serializable {
	private int id;
	private String name;
	private CountryResponse country;

	public CstateResponse(int id, String name, CountryResponse country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public CstateResponse() {
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCountry(CountryResponse country){
		this.country = country;
	}

	public CountryResponse getCountry(){
		return country;
	}

	@Override
 	public String toString(){
		return 
			"CstateResponse{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",country = '" + country + '\'' + 
			"}";
		}
}