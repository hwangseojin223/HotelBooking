  public class Customer {
  private String name;
  private String phoneNumber;
  private String roomType;
  private int roomNumber;
  private String day;
  private String personNumber;
  
  
  public Customer() {}

	public Customer(String name, String phoneNumber, String roomType, int roomNuber, String day, String personNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.day = day;
		this.personNumber = personNumber;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	  
	}
	public String getpersonNumber() {
		return personNumber;
	}
	
	public void setpersonNumber(String personNumber) {
		this.personNumber = personNumber;
}
}