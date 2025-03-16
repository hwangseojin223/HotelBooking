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
}
