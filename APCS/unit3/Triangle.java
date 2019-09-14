package unit3;

public class Triangle {

    double leg1 = 0;
    double leg2 = 0;
    double leg3 = 0;
    String type = "";

    Triangle(double x, double y){
        leg1 = x;
        leg2 = y;
        leg3 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double hypotenuse(){
        return leg3;
    }

    public int similar(Triangle[] set){
        int count = 0;
        for (Triangle e : set) {
            double x = leg1/leg2;
            double y = e.leg1/e.leg2;
            if (x==y)
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

    

}
