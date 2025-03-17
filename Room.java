import java.io.Serializable;

public class  Room implements Serializable {
    public int price;
    public Customer customer; 
    
    public Room(){}

    public Room(Customer customer) {
        this.customer = customer;
    }
    
    public void showPrice(){};

    public void show(){};
    
}
