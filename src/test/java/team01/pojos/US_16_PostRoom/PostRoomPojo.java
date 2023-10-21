package team01.pojos.US_16_PostRoom;

import java.io.Serializable;

public class PostRoomPojo implements Serializable {
	private String createdBy;
	private String createdDate;
	private String description;
	private int price;
	private int roomNumber;
	private String roomType;
	private boolean status;

	public PostRoomPojo(String createdBy, String createdDate, String description, int price, int roomNumber, String roomType, boolean status) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.description = description;
		this.price = price;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.status = status;
	}

	public PostRoomPojo() {
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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber(){
		return roomNumber;
	}

	public void setRoomType(String roomType){
		this.roomType = roomType;
	}

	public String getRoomType(){
		return roomType;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PostRoomPojo{" + 
			"createdBy = '" + createdBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",description = '" + description + '\'' + 
			",price = '" + price + '\'' + 
			",roomNumber = '" + roomNumber + '\'' + 
			",roomType = '" + roomType + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}