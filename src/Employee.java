public class Employee extends Person{
    //Attributes
    private float salary= 0;

    //constructor
    public Employee(String inName){
        name= inName;
    }

    //methods
    public void getRaise(int amount){
        salary += amount;
    }
}
