
import java.util.*;
class VehicleDescription{
    int wheel;
    int totalSeat;
    int length;
    int maxWeight;
    int totalcolor;
    String[] colorOption = new String[30];
    


    void setVehicle(){
        Scanner obj= new Scanner(System.in);
        System.out.println("Total NO of wheels: ");
        wheel = obj.nextInt();
        
        System.out.println("Total seats: ");
        totalSeat = obj.nextInt();
        System.out.println("Total Weight: ");
        maxWeight  = obj.nextInt();
        System.out.println("Total color:");
        totalcolor = obj.nextInt();
        obj.nextLine();
        System.out.println("Total color options :");
        for(int i=0;i<totalcolor;i++){
            colorOption[i] =  obj.nextLine();

        }

    }

    void showDescription(){
        System.out.println("Total NO of wheels: "+wheel);
        System.out.println("Total seats: "+totalSeat);
        System.out.println("Total Weight: "+maxWeight);
        System.out.println("Total color options are:");
        for(int i=0;i<totalcolor;i++){
            System.out.print(colorOption[i]+"  ");
        }
    }
}

public class Vehicle{
    public static void main(String[] arg){
        VehicleDescription twoWheeler = new VehicleDescription();

        twoWheeler.setVehicle();
        twoWheeler.showDescription();
    }
}