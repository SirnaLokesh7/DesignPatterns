// public class FlyWeight1 {
//     public static void main(String[] args) {
//         PaintApp app=new PaintApp();
//         app.render(10);
//     }
// }

// interface Shape{
//     public void draw();
// }

// class Circle implements Shape{
//     public String label;
//     private int radius;
//     private String fillColor;
//     private String borderColor;

//     Circle(String label){
//         this.label=label;
//     }

//     public int getRadius() {
//         return this.radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public String getFillColor() {
//         return this.fillColor;
//     }

//     public void setFillColor(String fillColor) {
//         this.fillColor = fillColor;
//     }

//     public String getBorderColor() {
//         return this.borderColor;
//     }

//     public void setBorderColor(String borderColor) {
//         this.borderColor = borderColor;
//     }

//     public void draw(){
//         System.out.println("Drawing a :"+label+" with radius: "+radius+" with a color: "+fillColor+" and border: "+borderColor);
//     }
    
// }

// class Rectangle implements Shape{
//     public String label;
//     private int length;
//     private int breadth;
//     private String fillStyle;

//     Rectangle(String label){
//         this.label=label;
//     }

//     public int getLength() {
//         return this.length;
//     }

//     public void setLength(int length) {
//         this.length = length;
//     }

//     public int getBreadth() {
//         return this.breadth;
//     }

//     public void setBreadth(int breadth) {
//         this.breadth = breadth;
//     }

//     public String getFillStyle() {
//         return this.fillStyle;
//     }

//     public void setFillStyle(String fillStyle) {
//         this.fillStyle = fillStyle;
//     }

//     public void draw(){
//         System.out.println("Drawing a :"+label+" with length: "+length+" and with breadth: "+breadth+"  with  fill style of: "+fillStyle);
//     }

// }

// class PaintApp{
//     public void render(int noOfShapes){
//         Shape[] shapes=new Shape[noOfShapes+1];
//         for(int i=1;i<=noOfShapes;i++){
//             if(i%2==0){
//                 shapes[i]=new Circle("circle");
//                 ((Circle)shapes[i]).setRadius(2);
//                 ((Circle)shapes[i]).setFillColor("blue");
//                 ((Circle)shapes[i]).setBorderColor("black");
//                 ((Circle)shapes[i]).draw();
//             }
//             else{
//                 shapes[i]=new Rectangle("rectangle");
//                 ((Rectangle)shapes[i]).setLength(1);
//                 ((Rectangle)shapes[i]).setBreadth(4);
//                 ((Rectangle)shapes[i]).setFillStyle("fillStyle");
//                 ((Rectangle)shapes[i]).draw();
//             }
//         }
//     }
// }