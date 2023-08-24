import java.util.Scanner;

public class Employee{
    public static void main(String[] args){
        // Emp e1 = new Emp("vishal",2018,50000000,"Bihar");
        // Emp e2 = new Emp();
        // e1.get();
        // e2.set();
        // e2.get();

        Emp[] s = new Emp[2];

        for(int i=0;i<2;i++){
            System.out.println("\n\nEnter Details of emplyee "+(i+1)+" : \n");
            s[i] = new Emp();
            s[i].set();
        }

        for(int i=0;i<2;i++){
            System.out.println("\n\nDetails of emplyee "+(i+1)+" : \n");
            s[i].get();
        }
        
        Emp.sc.close();

    }
}

class Emp {
    private String name;
    private int yearOfJoinning;
    private int salary;
    private String address;
    static Scanner sc = new Scanner(System.in);

    Emp(){}
    Emp(String name, int yearOfJoinnig,int salary,String address){
        
        this.name= name;
        this.yearOfJoinning = yearOfJoinnig;
        this.salary = salary;
        this.address = address;
        
    }

    void set(){
       
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter the Year of joinning : ");
        yearOfJoinning = sc.nextInt();
        System.out.print("Enter the salary : ");
        salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the address : ");
        address = sc.nextLine();
       


      

        
    }

    void get(){
        System.out.println(name);
        System.out.println(yearOfJoinning);
        System.out.println(salary);
        System.out.println(address);

        
    }
}
