import java.util.Scanner;
public class StudentClass {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2];
        for(int i=0;i<2;i++){
            s[i] = new Student();
            s[i].set();
        }
        for(int i=0;i<2;i++){
            s[i].get();
        }
    }

    
}

class Student{
    int roll;
    String name;
    int age;
    
    Student(){} //default constructor
    Student(int r, String n, int a){ // prameterized contructor
        roll =r;
        name = n;
        age = a;
    }

    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name :");
        name = sc.nextLine();
        //sc.nextLine();
        System.out.println("Enter age: ");

        age = sc.nextInt();
        sc.close();


    }
     void get(){
        System.out.println("enter roll: "+roll);
       
        System.out.println("Enter the name :"+name);
       
        System.out.println("Enter age: "+age);
       


    }


}