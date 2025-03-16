public class Customer {
	private String name;
	private String phoneNumber;
	private String roomType;
	private int roomNumber;
	private int day;
	private int personNumber;
	
	
	public Customer() {}

	public Customer(String name, String phoneNumber, String roomType, int roomNumber, int day, int personNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.day = day;
		this.personNumber = personNumber;	
	}

	public void show(){
		System.out.println("***예약 내용***");
		System.out.println("예약자 이름: " + getName());
		System.out.println("예약자 전화번호: " + getPhoneNumber());
		System.out.println("예약한 방 타입: " + getRoomType());
		System.out.println("예약한 날짜: " + getDay());
		System.out.println("예약 인원: " + getPersonNumber());
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

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getPersonNumber() {
		return personNumber;
	}
	
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

}
