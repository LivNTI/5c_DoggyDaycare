public class Dog {
    //attributes
    private String name;
    private int happiness=100;
    private DogOwner human;

    //Constructor
    public Dog(String inName){
        name= inName;
        human = new DogOwner(this);
    }

    //methods

    public void getInfo(){
        System.out.println(name + " has owner "+ human.getName());
    }

    public String getName() {
        return name;
    }
}
