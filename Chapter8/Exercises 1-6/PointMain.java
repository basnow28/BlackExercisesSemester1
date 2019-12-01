public class PointMain{
   public static void main(String args[]){
      Point p1 = new Point(7,-7);
      Point p2 = new Point(-4,4);
      Point p3 = new Point(0,-2);
      Point p4 = new Point(0,4);
      
      System.out.println("Point p1 is: " + p1 );
      System.out.println("Point p2 is: " + p2 ); 
      System.out.println("Point p3 is: " + p3 );
      System.out.println("Point p4 is: " + p4 );
      System.out.println();
      
      //Exercise 1 - quadrant
      System.out.println("Quadrant of the p1 is: " + p1.quadrant());
      System.out.println("Quadrant of the p2 is: " + p2.quadrant());
      System.out.println("Quadrant of the p3 is: " + p3.quadrant());
      System.out.println("Quadrant of the p4 is: " + p4.quadrant());
      System.out.println();
      
      // Exercise 2 - flip the points
      System.out.println("Point p2 is: " + p2);
      p2.flip();
      System.out.println("Point p2 after flip(): " + p2);
      System.out.println();
      
      //Exercise 3 - manhattanDistance()
      System.out.println("Manhattan distance between p1 and p3 is: " + p3.manhattanDistance(p1));
      System.out.println();
      
      //Exercise 4 - isHorizontal()
      if(p2.isHorizontal(p4)){
         System.out.println("p2 and p4 are horizontal " + "p2.y = p4.y = " + p2.getY());
      }else
         System.out.println("p2 and p4 are not horizontal" + p1 + p2);
      System.out.println();
      
      //Exercise 5 - slope(Point other)
      double slope = p3.slope(p4); 
      if(slope == 0.0)
         System.out.print("x1 = x2 - no answer ");
      else
         System.out.println(slope);
      System.out.println("\n");
   
      //Exercise 6 - isCoordinate
      Point a = new Point(2,4);
      Point b = new Point(3,6);
      Point c = new Point(2,10);
      
      boolean  coll = a.isCollinear(b,c);
      System.out.println("Are points a,b,c collinear? " + coll);
   }
}