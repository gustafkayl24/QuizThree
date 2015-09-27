public class Triangle {
	 private double side1 = 1.0;
	 private double side2 = 1.0;
	 private double side3 = 1.0;
	 
	 public Triangle() {
	 }

	 public Triangle(double side1, double side2, double side3) {
	   this.side1 = side1;
	   this.side2 = side2;
	   this.side3 = side3;
	 }
	 
	public abstract class GeometricObject {
		  private String color = "white";
		  private boolean filled;
		  private java.util.Date dateCreated;

		  /** Construct a default geometric object */
		  protected GeometricObject() {
		    dateCreated = new java.util.Date();
		  }

		  /** Construct a geometric object with color and filled value */
		  protected GeometricObject(String color, boolean filled) {
		    dateCreated = new java.util.Date();
		    this.color = color;
		    this.filled = filled;
		  }

		  /** Return color */
		  public String getColor() {
		    return color;
		  }

		  /** Set a new color */
		  public void setColor(String color) {
		    this.color = color;
		  }

		  /** Return filled. Since filled is boolean,
		   *  the get method is named isFilled */
		  public boolean isFilled() {
		    return filled;
		  }

		  /** Set a new filled */
		  public void setFilled(boolean filled) {
		    this.filled = filled;
		  }

		  /** Get dateCreated */
		  public java.util.Date getDateCreated() {
		    return dateCreated;
		  }

		  @Override
		  public String toString() {
		    return "created on " + dateCreated + "\ncolor: " + color +
		      " and filled: " + filled;
		  }

		  /** Abstract method getArea */
		  public abstract double getArea();

		  /** Abstract method getPerimeter */
		  public abstract double getPerimeter();
		}
	
	public double getPerimeter(double side1, double side2, double side3){
		return side1 + side2 + side3;
	}
	public double getArea(double side1, double side2, double side3)
    { 
		double area; double s;
        s = 1/2 * (side1 + side2 + side3);
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of the triangle is " + area);
        return area;
    }
	 public String toString() {
		    return " Side 1 = " + side1 + " Side 2 = " + side2
		           + " Side 3 = " + side3;
	 }
}
	
