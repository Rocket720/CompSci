//package unit1;
//
//import java.util.Scanner;
//
//
//public class Television {
//
//    String name = "";
//    boolean power = false; //cannot change setting if off
//    int volume = 0; //0-100
//    int channel = 1; //1-120 and wrap around
//
//    //constructors
//    Television(){
//
//    }
//    Television(String s){
//        name = s;
//    }
//
//    String getName(){
//        return name;
//    }
//
//    //power
//    void turnOnOff(){
//        power = !power;
//        if(power){System.out.println("Power On");}
//        else {System.out.println("Power Off");}
//    }
//
//    //volume
//    void volUp(){
//        if(power){
//            volume++;
//            if (volume>100) {
//                volume = 100;
//                System.out.println("stop trying to blow up your tv");
//            }
//        }
//    }
//    void volDown(){
//        if(power){
//            volume--;
//            if (volume<0){
//                volume = 0;
//                System.out.println("OH IM SORRY AM I STILL TOO LOUD FOR YOU");
//            }
//        }
//    }
//
//    //channel
//    void chanUp(){
//        if(power){
//            channel++;
//            if (channel>120){
//                channel = 1;
//                System.out.println("WHAT 120 CHANNELS AIN'T ENOUGH FOR YOUR SHORT ATTENTION SPAN");
//            }
//        }
//    }
//    void chanDown(){
//        if(power){
//            channel--;
//            if (channel<0){
//                channel = 120;
//                System.out.println("THERE IS NO CHANNEL BELOW 0 DUMMY");
//            }
//        }
//    }
//    void channelSelect(int x){
//        if(power){
//            channel = x;
//            System.out.println("There you go. What am I, your slave?");
//        }
//    }
//    public String toString(){
//        if (power){
//            return name + " Television:\n    Power: On\n    Channel: " + channel + "\n    Volume: " + volume ;
//        }
//        else{
//            return name + " Television:\n    Power: Off\n    Channel: " + channel + "\n    Volume: " + volume;
//        }
//    }
//}
//
//
//public class Tester {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("How many Televisions you want?");
//        int num = input.nextInt();
//        input.nextLine();
//        if (num>2)
//            System.out.println("What are you rich or something?");
//        Television[] devices = new Television[num];
//        for (int i = 0; i < num; i++) {
//            System.out.println("Enter television name");
//            String name = input.next();
//            Television tv = new Television(name);
//            devices[i] = tv;
//        }
//
//        while (true){
//            System.out.println("Select your device: ");
//            for (int i = 0; i < num; i++) {
//                System.out.println("-          Press " + (i+1) + " for " + devices[i].getName());
//            }
//            int sel = input.nextInt()-1;
//            System.out.println();
//
//            System.out.println("Enter a command: ");
//            System.out.println("-          Press 1 for on/off\n" +
//                    "-          Press 2 to increase volume\n" +
//                    "-          Press 3 to decrease volume\n" +
//                    "-          Press 4 to increase channel\n" +
//                    "-          Press 5 to decrease channel\n" +
//                    "-          Press 6 to set channel\n" +
//                    "-          Press 7 to exit\n");
//
//            int command = input.nextInt();
//            if (command==1){ devices[sel].turnOnOff(); }
//            else if(command==2){ devices[sel].volUp(); }
//            else if(command==3){ devices[sel].volDown(); }
//            else if(command==4){ devices[sel].chanUp(); }
//            else if(command==5){ devices[sel].chanDown(); }
//            else if(command==6){
//                System.out.println("Which channel do you want to go to you impatient..........\n");
//                devices[sel].channelSelect(input.nextInt());
//            }
//            else if(command==7){
//                for (int i = 0; i < devices.length; i++) {
//                    System.out.println(devices[i].toString());
//                }
//                break;
//            }
//        }
//
//
//    }
//
//}
