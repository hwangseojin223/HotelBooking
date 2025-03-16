public class StandardRoom extends Room {
    private int standardPrice;
    private int peopleNo;

    public StandardRoom() {
    }

    public StandardRoom(Customer customer) {
        super(customer);
        this.peopleNo  = customer.getPersonNumber();
    }

    @Override
    public void showPrice(){
        standardPrice = peopleNo * 100000;
        System.out.println("StandardRoom price : " + standardPrice);
    }
}
