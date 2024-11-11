import java.util.ArrayList;

public class Daycare {

    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Employee> workers = new ArrayList<>();
    private ArrayList<DogOwner> owners= new ArrayList<>();

    public Daycare(){
        addNewDog();
        
        for(Dog doggo: dogs){
            doggo.getInfo();
        }
    }

    public void addNewDog(){
        dogs.add(new Dog("Spot"));
        dogs.add(new Dog("Bosse"));
        dogs.add(new Dog("Scooby"));
    }
}
