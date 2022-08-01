interface Pizza{
    public void prepare();

}

class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }



}
class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }



}

class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza");
    }

}


class PizzaFactory{
    public static Pizza createPizza(String type){
        Pizza p=null;
        if(type.equals("cheese")){
            p=new CheesePizza();
        }
        else if(type.equals("chicken")){
            p=new ChickenPizza();
        }
        else if(type.equals("veg")){
            p=new VegPizza();
        }
        return p;
    }
}

public class Factory{
    public static void main(String[] args)
    {
        PizzaFactory store1=new PizzaFactory();
        Pizza p=store1.createPizza("cheese");
        p.prepare();
    }
}