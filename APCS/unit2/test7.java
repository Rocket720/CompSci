class test7{

    public static void main(String[] args){
        quizCircle a = new quizCircle(1, 0, 0);
        quizCircle b = new quizCircle(1, 3, 0);
        System.out.println(a.overlaps(b));
    }

}
class quizCircle{
    double radius = 0, xCenter = 0, yCenter = 0;
    static int numCircles = 0;

    quizCircle(){
        numCircles++;
    }
    quizCircle(double r, double x, double y) {
        numCircles++;
        radius = r;
        xCenter = x;
        yCenter = y;
    }

    boolean overlaps(quizCircle a){
        double distance = getDistance(a.xCenter, a.yCenter, xCenter, yCenter);
        if(distance<=(radius+a.radius))
            return true;
        return false;
    }

    double getDistance(double a, double b, double x, double y) {
        return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }
   
}