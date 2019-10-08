package unit1;

public class Television {

    String name = "";
    boolean power = false; //cannot change setting if off
    int volume = 0; //0-100
    int channel = 1; //1-120 and wrap around

    //constructors
    Television(){

    }
    Television(String s){
        name = s;
    }

    String getName(){
        return name;
    }

    //power
    void turnOnOff(){
        power = !power;
        if(power){System.out.println("Power On");}
        else {System.out.println("Power Off");}
    }

    //volume
    void volUp(){
        if(power){
            volume++;
            if (volume>100) {
                volume = 100;
                System.out.println("stop trying to blow up your tv");
            }
        }
    }
    void volDown(){
        if(power){
            volume--;
            if (volume<0){
                volume = 0;
                System.out.println("OH IM SORRY AM I STILL TOO LOUD FOR YOU");
            }
        }
    }

    //channel
    void chanUp(){
        if(power){
            channel++;
            if (channel>120){
                channel = 1;
                System.out.println("WHAT 120 CHANNELS AIN'T ENOUGH FOR YOUR SHORT ATTENTION SPAN");
            }
        }
    }
    void chanDown(){
        if(power){
            channel--;
            if (channel<0){
                channel = 120;
                System.out.println("THERE IS NO CHANNEL BELOW 0 DUMMY");
            }
        }
    }
    void channelSelect(int x){
        if(power){
            channel = x;
            System.out.println("There you go. What am I, your slave?");
        }
    }
    public String toString(){
        if (power){
            return name + " Television:\n    Power: On\n    Channel: " + channel + "\n    Volume: " + volume ;
        }
        else{
            return name + " Television:\n    Power: Off\n    Channel: " + channel + "\n    Volume: " + volume;
        }
    }
}
