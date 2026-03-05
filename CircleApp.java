public class CircleApp{
    public static void main(String[] args){
        Circle myCirc1 = new Circle(6,1,1); 
        Circle myCirc2 = new Circle(4); 
        Circle myCirc3 = new Circle(); 

        System.out.println("radius of circle 1:" + myCirc1.getRadius());
        myCirc1.setRadius(7);
        System.out.println("radius of circle 1:" + myCirc1.getRadius());

        System.out.println("originX of circle 2:" + myCirc2.getOriginX());
        System.out.println("originY of circle 2:" + myCirc2.getOriginY());
        myCirc2.setOriginX(1);
        myCirc2.setOriginY(1);
        System.out.println("originX of circle 2:" + myCirc2.getOriginX());
        System.out.println("originY of circle 2:" + myCirc2.getOriginY());
        System.out.println("Pi: "+Circle.getPI());

        System.out.println("Area of circle 1: "+ myCirc1.getArea());
        System.out.println("Circumferance of circle 1: "+ myCirc1.getCircumference());

        myCirc3.move(1,2);
        System.out.println("originX of circle 3:" + myCirc3.getOriginX());
        System.out.println("originY of circle 3:" + myCirc3.getOriginY());

        System.out.println("circle 1"+myCirc3);

        myCirc3.scale(5);
        System.out.println("radius of circle 3:" + myCirc3.getRadius());

        System.out.println("circle 1 and 2 overlap: " + myCirc1.isOverlappedWith(myCirc2));
        System.out.println("circle 1 and 3 overlap: " + myCirc1.isOverlappedWith(myCirc3));
        System.out.println("circle 2 and 3 overlap: " + myCirc2.isOverlappedWith(myCirc3));

        System.out.println("circle 1 is enclosed by 2: " + myCirc1.isEnclosedBy(myCirc2));
    }
}