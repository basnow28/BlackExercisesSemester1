public class Point{
   private int x;
   private int y;
   
   public Point(){
      this(0,0);
   }
   
   public Point(int initialX, int initialY){
      setLocation(initialX, initialY);
   }
   
   public int getX(){
      return this.x;
   }
   
   public int getY(){
      return this.y;
   }
   
   
   public void setLocation(int x, int y){
      this.x = x;
      this.y = y;
   }
   
   public void translate(int dx, int dy){
      setLocation(this.x + dx, this.y + dy);
   }
   
   public double distanceFromOrigin(){
      return Math.sqrt(x*x + y*y);
   }
   
   public String toString(){
      return "x = " + x + " y = " + y;
   }
   
   public int quadrant(){
      if(this.x == 0 || this.y ==0)
         return 0;
         
      if(this.x > 0 && this.y > 0)
         return 1;
      else if(this.x < 0 && this.y > 0)
         return 2;
      else if(this.x < 0 && this.y < 0)
         return 3;
      else
         return 4;
   }
   
   public void flip(){
      this.x *= -1;
      this.y *= -1;
      swap();  
   }
   
   private void swap(){
      int c = this.x;
      this.x = this.y;
      this.y = c;  
   }
   
   public int manhattanDistance(Point other){
      int sum = 0;
      sum += Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
      return sum;
   }
   
   public boolean isHorizontal(Point other){
      if(this.y == other.y)
         return true;
      return false;
   }
   
   public double slope(Point other){
      int score = 0;
      try{
         score = (this.y - other.y)/(this.x - other.x);
      } catch(Exception e){
         return 0;
      }
      return score;
   }
  
   public boolean isCollinear(Point p1, Point p2){
         double slopeA, slopeB;
         slopeA = slope(p1);
         slopeB = slope(p2);
         
         if(slopeA == slopeB)
            return true;
            
         return false;
   }
}