public class Circle{
    private double radius;
    private double originX;
    private double originY;

    private static final double PI = 3.142;

    public Circle(double radius,double originX,double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius){
        this.radius = radius;
        this.originX = 0;
        this.originY = 0;
    }

    public Circle(){
        this.radius = 1;
        this.originX = 0;
        this.originY = 0;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (Double.compare(radius,0)>0){
            this.radius = radius;
        }
    }

    public double getOriginX(){
        return originX;
    }

    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return originY;
    }

    public void setOriginY(double originY){
        this.originY = originY;
    }

    public static double getPI(){
        return PI;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getCircumference(){
        return PI*radius*2;
    }

    public void move(double x,double y){
        this.originX += originX;
        this.originY += originY;
    }

    public String toString(){
        return "Circle[x="+originX+",y="+originY+",radius="+radius+"]";
    }

    public void scale(double factor){
        this.radius *= factor;
    }

    public boolean isOverlappedWith(Circle c){
        double cTop = c.originY + c.radius;
        double cBottom = c.originY - c.radius;
        double cLeft = c.originX - c.radius;
        double cRight = c.originX + c.radius;
        double cirTop = this.originY + this.radius;
        double cirBottom = this.originY - this.radius;
        double cirLeft = this.originX - this.radius;
        double cirRight = this.originX + this.radius;
        boolean heightTest = false;
        boolean widthTest = false;

        if (Double.compare(cirTop,cTop)>= 0 && Double.compare(cirBottom,cTop)<=0){
            heightTest = true;
        }
        else if (Double.compare(cirTop,cBottom)>= 0 && Double.compare(cirBottom,cBottom)<=0){
            heightTest = true;
        }

        if (Double.compare(cirRight,cRight)>= 0 && Double.compare(cirLeft,cRight)<=0){
            widthTest = true;
        }
        else if (Double.compare(cirRight,cLeft)>= 0 && Double.compare(cirLeft,cLeft)<=0){
            widthTest = true;
        }

        if (heightTest == true && widthTest == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEnclosedBy(Circle c){
        if (Double.compare(c.originX,this.originX)== 0 && Double.compare(c.originY,this.originY)== 0 ){
            return true;
        }
        else{
            return false;
        }
    }
}