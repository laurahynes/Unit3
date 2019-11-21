package Lesson8.SamplePrograms;

public class Animal {
   private String name;
   private double weight;
   
   public Animal(String n, double w){
       name = n;
       weight = w;
   }
   
   public void grow(){
       weight += .2 * weight;       
   }
   
   public String toString(){
       String str = String.format("Name: %s", name);
       str+= String.format("\tWeight: %.2f", weight);
       return str;
   }
   
   public void setName(String nm){
       name = nm;
   }
}
