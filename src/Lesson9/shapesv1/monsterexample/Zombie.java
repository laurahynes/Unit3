package Lesson9.shapesv1.monsterexample;

public class Zombie implements Monster{
    
    private String name;
    
    public Zombie(String n){
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("I am eating your brains!");
    }

    @Override
    public String identify() {
        return("I am" + name + " the Zombie!");
    }
    
}
