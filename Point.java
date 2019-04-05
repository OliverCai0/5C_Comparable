/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        if(otherObj instanceof Point){
            Point p2;
            p2 = (Point) otherObj;
            double distanceP1 = Math.sqrt((xcor * xcor) + (ycor * ycor));
            double distanceP2 = Math.sqrt((p2.get_xcor() * p2.get_xcor()) + (p2.get_ycor() * p2.get_ycor()));
            return Double.compare(distanceP1, distanceP2);
        }
        return 0; // temp: all Points are One
    }

    public double get_xcor(){
        return xcor;
    }
    
    public double get_ycor(){
        return ycor;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}