public class Customer {
	private String name;
	private String phoneNumber;
	private String roomType;
	private int roomNumber;
	private String day;
	
	public Customer() {}

	public Customer(String name, String phoneNumber, String roomType, int roomNumber, String day) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.day = day;
		
	} 

	public String getName() {
		return roomType;
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

}
