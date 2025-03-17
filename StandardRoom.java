public class StandardRoom extends Room {
    private int peopleNo;

    public StandardRoom() {
        this.peopleNo = 0;
        this.price = 100000;
    }

    public StandardRoom(Customer customer) {
        super(customer);
        this.peopleNo  = customer.getPersonNumber();
        this.price = this.peopleNo * 100000;
    }

    @Override
    public void showPrice(){
        System.out.println("StandardRoom price : " + price + "원");
    }
    @Override
    public void show() {
        System.out.println("예약자: " + customer.getName() + ", 전화번호: " + customer.getPhoneNumber() + ", 예약일자: " + customer.getDay() + "인원수: " + customer.getPersonNumber() + "객실타입: " + customer.getRoomType());
    }

    public int getPeopleNo(){
        return peopleNo;
    }

    public void setPeopleNo(){
        this.peopleNo = peopleNo;
    }
}
