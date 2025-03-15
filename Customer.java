public class Customer {
  private String name;
  private String phoneNumber;
  private String roomType;
  private int roomNumber;
  
  public Customer() {}

public Customer(String name, String phoneNumber, String roomType) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.roomType = roomType;
	
} 
public String getRoomType() {
	return roomType;
}

public void setRoomType(String roomType) {
	this.roomType = roomType;
}

public int getRoomNumber() {
	return roomNumber;
}

public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
}

