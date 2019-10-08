public class day1_1{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
    }
}

class Rectangle{
    
    int aLength = 0;
    int bLength = 0;
    int xPos = 0;
    int yPos = 0;

    Rectangle(){

    }

    Rectangle(int a, int b){
        aLength = a;
        bLength = b;
    }
}


private class Circle{
 
    int radius = 0;
  	int xCenter = 0;
  	int yCenter = 0;
  	String color = "";
  	static int numCircles = 0;
    
    Circle(){
        numCircles++;
    }

    Circle(int r)
    {
        numCircles++;
        radius = r;  
    }
          
    Circle(int x, int y, int r)
    {
        numCircles++;
        xCenter = x;
        yCenter = y;
        radius = r;
        System.out.println("kill me witha rusty spoon");
    }

    Circle(int r, int x, int y, String c){
        radius = r;
        xCenter = x;
        yCenter = y;
        color = c;
        numCircles++;
    }

    double getArea(){
        return Math.PI*radius*radius;
  	}
  	
  	double getCircumference(){
        return 2*Math.PI*radius;
    }
      

}


