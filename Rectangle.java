// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  private static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  public Rectangle() {
    this.width = 1;
    this.height = 1;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double scaleX, double scaleY) {
    height *= scaleY;
    width *= scaleX;
  }

  public void scale(double scaler){
    height *= scaler;
    width *= scaler;
  }

  public boolean isOverlappedWith(Rectangle r){
    boolean overlapwidth = false;
    boolean overlapheight = false;
    double RecUpperWidth = (this.originX + (0.5 * this.width));
    double RecLowerWidth = (this.originX - (0.5 * this.width));
    double rLowerWidth = (r.originX - 0.5 * r.width);
    double rUpperWidth = (r.originX + 0.5 * r.width);
    double RecUpperHeight = this.originY + 0.5 * this.height;
    double RecLowerHeight = this.originY - 0.5 * this.height;
    double rLowerHeight = r.originY - 0.5 * r.height;
    double rUpperHeight = r.originY + 0.5 * r.height;

    if (Double.compare(RecUpperWidth,rLowerWidth) >= 0 && Double.compare(rLowerWidth, RecLowerWidth) >= 0){
      overlapwidth = true;
    }
    else if (Double.compare(RecUpperWidth,rUpperWidth) >= 0 && Double.compare(rUpperWidth, RecLowerWidth) >= 0){
      overlapwidth = true;
    }

    if (Double.compare(RecUpperHeight, rLowerHeight) >= 0 && Double.compare(rLowerHeight,RecLowerHeight) >= 0){
      overlapheight = true;
    }
    else if (Double.compare(RecUpperHeight, rUpperHeight) >= 0 && Double.compare(rUpperHeight,RecLowerHeight)>=0){
      overlapheight = true;
    }

    if (overlapheight == true && overlapwidth == true){
      return true;
    }
    else {
      return false;
    }
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    boolean result = r1.isOverlappedWith(r2);
    if (result == true){
      return true;
    }
    else {
      return false;
    }
  }

  public double calcRatio(){
    double ratio;
    if (height > width) {
      ratio = width/height;
    }
    else {
      ratio = height/width;
    }
    return ratio;
  }

  public boolean isSquare(Rectangle r){
    double rat = r.calcRatio();
    if (Double.compare(0.999,rat) < 0 && Double.compare(1.001,rat) > 0){
      return true;
    }
    else{
      return false;
    }
  }

  public double getWidth(){ 
    return width;
  }

  public void setWidth(double width){
    if (Double.compare(width,0) >= 0){
      this.width = width;
    }
  }

  public double getHeight(){ 
    return height;
  }

  public void setHeight(double height){
    if (Double.compare(height,0)>=0){
      this.height = height;
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

  public static double getNUMBER_OF_SIDES(){ 
    return NUMBER_OF_SIDES;
  }

}
