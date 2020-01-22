package codechallenges.animalshelter;

import java.util.*;

public class AnimalShelter {

    Queue<Dog> dogQueue = new LinkedList<>();
    Queue<Cat> catQueue = new LinkedList<>();

    public void enqueue(Animal animal){
        if(animal instanceof Cat){
            this.catQueue.add((Cat) animal);
        } else if(animal instanceof Dog){
            this.dogQueue.add((Dog) animal);
        }
    }
    public Animal dequeue(String pref){
        pref = pref.toUpperCase();
        if(pref.equals("CAT")){
            if(this.catQueue.isEmpty()){
                return null;
            }
            return this.catQueue.remove();
        } else if(pref.equals("DOG")){
            if(this.dogQueue.isEmpty()){
                return null;
            }
            return this.dogQueue.remove();
        }
        return null;
    }
}
