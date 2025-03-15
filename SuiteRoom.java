public class SuiteRoom extends Room{
    private int suitePrice;
    private int peopleNo;

    public SuiteRoom(){}

    public SuiteRoom(Customer customer){
        super(customer);
        this.peopleNo = Integer.parseInt(customer.getpersonNumber());
    }

    @Override
    public void showPrice(){
        suitePrice = peopleNo * 200000;
        System.out.println("SuiteRoom price : " + suitePrice);
    }
}
