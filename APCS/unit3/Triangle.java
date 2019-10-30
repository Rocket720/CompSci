public class Triangle {

    private double leg1 = 0;
    private double leg2 = 0;
    private double leg3 = 0;
    private String type = "";

    Triangle(double x, double y){
        leg1 = x;
        leg2 = y;
        leg3 = hypotenuse();
    }

    double hypotenuse(){
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    public static int similar(Triangle[] set){
        int count = 0;
        for (Triangle e : set) {
            double x = leg1/leg2;
            double y = e.leg1/e.leg2;
            if (x==y || x==(1/y))
                count++;
        }
        return count;
    }

    private String type(){
        return "";
    }

    public String getType(){
        return type;
    }

    double getLeg1(){
        return leg1;
    }
    double getLeg2(){
        return leg2;
    }

    public String toString(){
        return(leg1 + " by " + leg2);
    }
    

}
