package team01.pojos.US_17_CreateTestItems;

import java.io.Serializable;

public class TestItemsRequestPOJO implements Serializable {
	private int price;
	private String createdBy;
	private String createdDate;
	private String defaultValMax;
	private String defaultValMin;
	private String description;
	private Integer id;
	private String name;

	public TestItemsRequestPOJO() {
	}

	public TestItemsRequestPOJO(int price, String createdBy, String createdDate, String defaultValMax, String defaultValMin, String description,Integer id, String name) {
		this.price = price;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.defaultValMax = defaultValMax;
		this.defaultValMin = defaultValMin;
		this.description = description;
		this.id = id;
		this.name = name;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
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

	public void setDefaultValMax(String defaultValMax){
		this.defaultValMax = defaultValMax;
	}

	public String getDefaultValMax(){
		return defaultValMax;
	}

	public void setDefaultValMin(String defaultValMin){
		this.defaultValMin = defaultValMin;
	}

	public String getDefaultValMin(){
		return defaultValMin;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"TestItemsRequestPOJO{" + 
			"price = '" + price + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",defaultValMax = '" + defaultValMax + '\'' + 
			",defaultValMin = '" + defaultValMin + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}