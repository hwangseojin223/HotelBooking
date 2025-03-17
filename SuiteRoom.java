public class SuiteRoom extends Room{
    private int peopleNo;

    public SuiteRoom(){
        this.peopleNo = 0;
        this.price = 100000;
    }

    public SuiteRoom(Customer customer){
        super(customer);
        this.peopleNo = customer.getPersonNumber();
        this.price = peopleNo * 200000;
    }

    @Override
    public void showPrice(){
        System.out.println("SuiteRoom price : " + price + "원");
    }

    @Override
    public void show() {
        System.out.println("예약자: " + customer.getName() + ", 전화번호: " + customer.getPhoneNumber() + ", 예약일자: " + customer.getDay() + "일, 인원수: " + customer.getPersonNumber());
    }

    public int getPeopleNo(){
        return peopleNo;
    }

    public void setPeopleNo(){
        this.peopleNo = peopleNo;
    }
}
