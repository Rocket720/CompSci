package General;

import java.util.ArrayList;

public class McCarvillScheduling {

    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> sdle = new ArrayList<>();
        sdle = aListGen(sdle);
        System.out.println(sdle.get(0));
        System.out.println(conSol(sdle));

    }

    public static int conSol(ArrayList<ArrayList<ArrayList<Integer>>> sdle){
        int classes = 0;
        ArrayList<Integer> cpot = new ArrayList<>();
        for (int i = 0; i < sdle.size(); i++) {
            for (int j = 0; j < sdle.get(i).size(); j++) {
                for (int k = 0; k < sdle.get(0).get(0).size(); k++) {
                    boolean good = true;
                    for (int e : cpot) {

                        if (e==sdle.get(i).get(j).get(k)){
                            good = false;

                        }
                    }
                    if (good){
                        cpot.add(sdle.get(i).get(j).get(k));
                    }
                }
            }
        }
        if (classes<cpot.size()){
            classes = cpot.size();
        }

        return classes;
    }


    public static ArrayList<ArrayList<ArrayList<Integer>>> aListGen(ArrayList<ArrayList<ArrayList<Integer>>> sdle){

        ArrayList<ArrayList<Integer>> v = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0, 1);
        a.add(1, 2);
        v.add(a);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0, 7);
        b.add(1, 8);
        v.add(b);
        sdle.add(0, v);

        ArrayList<ArrayList<Integer>> w = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0, 7);
        c.add(1, 8);
        w.add(c);

        /*
        mid.add(0, 15);
        mid.add(1, 16);
        mid2.add(mid);
        mid.clear();
        mid.add(0, 3);
        mid.add(1, 4);
        mid2.add(mid);
        sdle.add(1, mid2);
        mid.clear();
        mid2.clear();

        mid.add(0, 1);
        mid2.add(mid);
        mid.clear();
        mid.add(0, 4);
        mid2.add(mid);
        sdle.add(2, mid2);
        mid.clear();
        mid2.clear();

        mid.add(0, 4);
        mid.add(1, 5);
        mid2.add(mid);
        sdle.add(3, mid2);
        mid.clear();
        mid2.clear();

        mid.add(0, 1);
        mid.add(1, 2);
        mid.add(0, 3);
        mid2.add(mid);
        sdle.add(4, mid2);
        mid.clear();
        mid2.clear();

        return sdle;
        */
        return sdle;
    }
}
