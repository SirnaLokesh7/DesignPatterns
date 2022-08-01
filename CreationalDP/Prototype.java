public class Prototype implements Cloneable{
    private String id;
    private int cost;
    private String name;
    

    public Prototype() {
    }
    public Prototype(Prototype pro){
        this.id=pro.id;
        this.cost=pro.cost;
        this.name=pro.name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    protected Prototype clone() throws CloneNotSupportedException{
        return (Prototype)super.clone();
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cost='" + getCost() + "'" +
            ", name='" + getName() + "'" +
            ", obj='" + getObj() + "'" +
            "}";
    }

}

class PrototypeEx{
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype obj1=new Prototype();
        obj1.setCost(1000);
        obj1.setId("id");
        obj1.setName("name");
       
        Prototype obj2=obj1.clone();
        Prototype obj3=new Prototype(obj1);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}