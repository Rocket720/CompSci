package unit1;

public class Square {

    int xCenter = 0;
    int yCenter = 0;
    int length = 0;
    boolean filled = false;

    double xLow = 0;
    double yLow = 0;
    double xHigh = 0;
    double yHigh = 0;

    Square(){

    }
    Square(int xC,int yC,int len,boolean fill){
        xCenter=xC;
        yCenter=yC;
        length=len;
        filled=fill;

        xLow = (double)xCenter-((double)length/2.0);
        yLow = (double)yCenter-((double)length/2.0);
        xHigh = (double)xCenter+((double)length/2.0);
        yHigh = (double)yCenter+((double)length/2.0);
    }

    public int getArea(){
        return length*length;
    }

    public int perimeter(){
        return length*4;
    }

    public String toString(){
        if (filled){
            return "Center: (" + xCenter + ", " + yCenter + ") \nSide Length: " + length + " \nIs Filled";
        }
        else{
            return "Center: (" + xCenter + ", " + yCenter + ") \nSide Length: " + length + " \nIs Not Filled";
        }
    }

    public boolean contains(int x, int y){

        if((!filled) && ((x==xLow && y>=yLow && y<=yHigh) || (y==yLow && x>=xLow && x<=xHigh) || (x==xHigh && y>=yLow && y<=yHigh) || (y==yHigh && x>=xLow && x<=xHigh))){
            return true;
        }
        else return filled && x >= xLow && x <= xHigh && y >= yLow && y <= yHigh;

    }

}
