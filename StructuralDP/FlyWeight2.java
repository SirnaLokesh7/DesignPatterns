import java.util.HashMap;

public class FlyWeight2 {
    public static void main(String[] args) {
        PaintApp app=new PaintApp();
        app.render(10);
    }
}

abstract class Shape{
    public void draw(int radius,String fillColor, String borderColor){

    }
    public void draw(int length, int breadth, String fillStyle){

    }
}

class Circle extends Shape{
    public String label;
    Circle(String label){
        this.label=label;
    }
    public void draw(int radius,String fillColor, String borderColor){
        System.out.println("Drawing a :"+label+" with radius: "+radius+" with a color: "+fillColor+" and border: "+borderColor);
    }
}

class Rectangle1 extends Shape{
    public String label;
    Rectangle1(String label){
        this.label=label;
    }

    public void draw(int length, int breadth, String fillStyle){
        System.out.println("Drawing a :"+label+" with length: "+length+" and with breadth: "+breadth+"  with  fill style of: "+fillStyle);
    }
}

class ShapeFactory{
    private static HashMap<String,Shape> map=new HashMap<>();
    public static Shape getInstance(String type){
        Shape shape=null;
        if(map.get(type)==null){
            if(type.equals("circle")){
                shape=new Circle("circle");
            }
            else if(type.equals("rectangle1")){
                shape=new Rectangle1("recctangle");
            }
            map.put(type, shape);
        }
        else{
            shape=map.get(type);
        }
        return shape;
    }
}

class PaintApp{
    public void render(int noOfShapes){
        Shape[] shapes=new Shape[noOfShapes+1];
        for(int i=1;i<=noOfShapes;i++){
            if(i%2==0){
               shapes[i]=ShapeFactory.getInstance("circle");
               ((Circle)shapes[i]).draw(i,"blue","black");
            }
            else{
                shapes[i]=ShapeFactory.getInstance("rectangle1");
                ((Rectangle1)shapes[i]).draw(i,i+2,"dotted");
            }
        }
    }
}