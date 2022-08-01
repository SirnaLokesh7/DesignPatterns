public class Decorator {
    public static void main(String[] args) {
        Pizzaa chickenPizzaa=new ChickenPizzaaDecorator(new NormalPizzaa());
        chickenPizzaa.bake();
    }
}

interface Pizzaa{
    public void bake();
}

class NormalPizzaa implements Pizzaa{
    public void bake(){
        System.out.println("Baking Normal Pizzaa");
    }
}

class PizzaaDecorator implements Pizzaa{
    private Pizzaa Pizzaa;
    PizzaaDecorator(Pizzaa Pizzaa){
        this.Pizzaa=Pizzaa;
    }
    public void bake(){
        Pizzaa.bake();
    }
}

class VegPizzaaDecorator extends PizzaaDecorator{

    VegPizzaaDecorator(Pizzaa Pizzaa) {
        super(Pizzaa);
    }
    @Override
    public void bake() {
       super.bake();
       System.out.println("Adding Veggie toppings");
    }
}

class ChickenPizzaaDecorator extends PizzaaDecorator{

    ChickenPizzaaDecorator(Pizzaa Pizzaa) {
        super(Pizzaa);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding Chicken toppings");
    }

}


