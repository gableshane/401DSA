package codechallenges.animalshelter;

import org.junit.*;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueueDog() {
        AnimalShelter sheldon = new AnimalShelter();
        sheldon.enqueue(new Dog("Charlie"));
        sheldon.enqueue(new Dog("Igor"));
        sheldon.enqueue(new Cat("Garfield"));
        sheldon.enqueue(new Cat("Cornelius"));
        assertEquals("A dog named Charlie should be in the shelter at front of queue",
                "Charlie",sheldon.dogQueue.peek().name);
    }
    @Test
    public void enqueueCat() {
        AnimalShelter sheldon = new AnimalShelter();
        sheldon.enqueue(new Cat("Garfield"));
        sheldon.enqueue(new Cat("Cornelius"));
        sheldon.enqueue(new Dog("Charlie"));
        sheldon.enqueue(new Dog("Igor"));
        assertEquals("A dog named Charlie should be in the shelter at front of queue",
                "Garfield",sheldon.catQueue.peek().name);
    }

    @Test
    public void dequeueDog() {
        AnimalShelter sheldon = new AnimalShelter();
        sheldon.enqueue(new Dog("Charlie"));
        sheldon.enqueue(new Dog("Igor"));
        sheldon.enqueue(new Cat("Garfield"));
        sheldon.enqueue(new Cat("Cornelius"));
        assertEquals("The return value of dequeue should be the first dog in line","Charlie",sheldon.dequeue("dog").name);
    }
    @Test
    public void dequeueCat() {
        AnimalShelter sheldon = new AnimalShelter();
        sheldon.enqueue(new Cat("Garfield"));
        sheldon.enqueue(new Cat("Cornelius"));
        sheldon.enqueue(new Dog("Charlie"));
        sheldon.enqueue(new Dog("Igor"));
        assertEquals("The return value of dequeue should be the first dog in line","Garfield",sheldon.dequeue("cat").name);
    }
    @Test
    public void expectedFailure(){
        AnimalShelter sheldon = new AnimalShelter();
        sheldon.enqueue(new Cat("Garfield"));
        sheldon.enqueue(new Cat("Cornelius"));
        sheldon.enqueue(new Dog("Charlie"));
        sheldon.enqueue(new Dog("Igor"));
        assertNull("Should return null if invalid param",sheldon.dequeue("Banana"));
    }
}