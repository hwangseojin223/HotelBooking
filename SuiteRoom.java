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

    public int getPeopleNo(){
        return peopleNo;
    }

    public void setPeopleNo(){
        this.peopleNo = peopleNo;
    }
}
