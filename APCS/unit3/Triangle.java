public class Triangle {

    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double angle = 0;
    private String type = "";

    Triangle(double x, double y, double z){
        a = x;
        b = y;
        c = z;
        angle = angle();
        type = type();
    }

    private double angle(){
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2*a*b));
    }

    public static int similar(Triangle[] set){
        int count = 0;
        for (Triangle e : set) {
            double x = a/b;
            double y = e.a/e.b;
            if (x==y || x==(1/y))
                count++;
        }
        return count;
    }

    private String type(){
        if(Math.sqrt(a*a+b*b)==c)
            return "";
    }

    public String getType(){
        return type;
    }

    private setType(String type){
        this.type = type;
    }

    double getA(){
        return a;
    }
    double getB(){
        return b;
    }

    public String toString(){
        return(a + " by " + b);
    }
    

}
