import java.util.Scanner;

public class Owner {
//attributes
    private String name;
    private int id;
    private Dog furbaby;

    //constructor
    public Owner(Dog inDog){
        System.out.println("Hello " +inDog.getName() + " What is your owners name? ");
        Scanner s= new Scanner(System.in);
        name= s.nextLine();
        furbaby= inDog;
    }

    //methods
    public void greet(){
        System.out.println("Hello, my name is "+ name +" and my dog is "+ furbaby);

    }

    public String getName(){
        return name;
    }
}
