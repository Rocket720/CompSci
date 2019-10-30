public class day3_1 {

    public static void main(String[] args) {

        Circle[] cs = { new Circle(0, 0, 10), new Circle(3, 5, 6), new Circle(-5, 9, 6) };

        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (getDistance(1, 5, cs[i].xCenter, cs[i].yCenter) <= cs[i].getCircumference()) {
                count++;
                System.out.println(cs[i].toString());
            }
        }


    }

    static double getDistance(int a, int b, int x, int y) {
        return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }

}

class Circle {
    int radius = 0;
    int xCenter = 0;
    int yCenter = 0;
    String color = "";
    static int numCircles = 0;

    Circle() {
        numCircles++;

    }

    Circle(int r) {
        numCircles++;
        radius = r;

    }

    Circle(int x, int y, int r) {
        numCircles++;
        xCenter = x;
        yCenter = y;
        radius = r;
        System.out.println("that toaster needed a bath anyways");
    }

    Circle(int x, int y, int r, String c) {
        numCircles++;
        xCenter = x;
        yCenter = y;
        radius = r;
        color = c;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    

    public String toString(){
        return "Center(" + xCenter + ", " + yCenter + "), Radius = " + radius;
    }
}
