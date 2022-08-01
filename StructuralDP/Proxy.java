import java.util.ArrayList;
import java.util.List;

public class Proxy {
    public static void main(String[] args) {
        // CustomerImpl obj = new CustomerImpl();
        //  System.out.println(obj.getId());
        //  System.out.println(obj.getOrders());
        Customer obj=new CustomerProxyImpl();
        System.out.println(obj.getID());
        List<Order> list=obj.getorders();
        for(Order a: list){
            System.out.println(a);
        }

    }
}

interface Customer{
    public int getID();
    public List<Order> getorders();
}

class Order{

    private int id;
    private String product_name;
    private int quantitiy;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuantitiy() {
        return this.quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", product_name='" + getProduct_name() + "'" +
            ", quantitiy='" + getQuantitiy() + "'" +
            "}";
    }


}

class CustomerImpl implements Customer{
    private int id;
    private List<Order> orders;

    CustomerImpl(){
        this.id=123;
    }
    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int getID() {
        return this.id;
        
    }
    @Override
    public List<Order> getorders() {
        
        return null;
    } 
}

class CustomerProxyImpl implements Customer{
    CustomerImpl customer=new CustomerImpl();

    @Override
    public int getID() {
        return customer.getID(); 
    }

    @Override
    public List<Order> getorders() {
        ArrayList<Order> list=new ArrayList<>();
        Order order1=new Order();
        order1.setId(1);
        order1.setProduct_name("Phone");
        order1.setQuantitiy(2);
        list.add(order1);

        Order order2=new Order();
        order2.setId(2);
        order2.setProduct_name("TV");
        order2.setQuantitiy(1);
        list.add(order2);

        return list;
    }
    
}