public class Facade {
    public static void main(String[] args) {
        // OrderProcessor op=new OrderProcessor();
        // if(op.checkStock("name")==true){
        //     String id=op.placeOrder("name", 2);
        //     op.shipOrder(id);
        // }
        FacadeClass obj=new FacadeClass();
        obj.handleOrder("name", 2);
    }
}

class OrderProcessor{
    public boolean checkStock(String name){
        System.out.println("Checking Stock");
        return true;
    }
    public String placeOrder(String name,int quantity){
        System.out.println("Order placed");
        return "abd123";
    }
    public void shipOrder(String id){
        System.out.println("Ordered Shipped\n"+ " ID: "+id);
    }
}

class FacadeClass{
    public void handleOrder(String name,int quantity){
        OrderProcessor op=new OrderProcessor();
        if(op.checkStock(name)==true){
            String id=op.placeOrder(name, quantity);
            op.shipOrder(id);
        }
    }
}