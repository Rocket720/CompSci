//package unit7;
//
//public class Asset{
//    private String name;
//    private int yearBuilt;
//    private int value;
//
//    Asset(){}
//
//    Asset(String name, int yearBuilt, int value){
//        this.name = name;
//        this.yearBuilt = yearBuilt;
//        this.value = value;
//    }
//
//    public String toString(){
//        return "Asset{	Name: " + name + ", \n" +
//                "Year Built: " +  yearBuilt + ", \n" +
//                "Value: " + value + ", \n " +
//                "}";
//    }
//
//    public boolean equals(Object a){
//        if(a.toString().equals(this.toString()))
//            return true;
//        return false;
//    }
//
//}
//class House extends Asset{
//    private int squareFeet;
//
//    House(){}
//
//    House(String name, int yearBuilt, int value, int squareFeet){
//        super(name, yearBuilt, value);
//        this.squareFeet = squareFeet;
//    }
//
//    public String toString(){
//        return "Asset{	Name: " + super.name + ", \n" +
//                "Year Built: " + " yearBuilt + ", \n" +
//        "Value: " + value + ", \n " +
//                "Square Feet: " + squareFeet+ ", \n " +
//                "}";
//    }
//
//
//
//    static House biggest(House[] x){
//        House b = x[0];
//        for (House h : x){
//            if(b.toString().length()<x.toString().length()){
//                b = h;
//        }}
//        return b;
//    }
//
//
//
//    public boolean equals(Object a){
//        if(a.toString().equals(this.toString()))
//            return true;
//        return false;
//    }
//
//}
