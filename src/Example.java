import java.time.Instant;

/**
 * Entrypoint Example
 *
 * @author Florian.WINDISCH
 * @version 1.0
 */
public class Example {
    /**
     * Standard constructors
     */
    public Example() {
    }

    /**
     * Entrypoint main
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        Person owner = new Person("Flo");

        try {
            Cat cat = new Cat("Kitty", owner);

            boolean catIsHappy = cat.play();
            System.out.println(cat.name + " belongs to " + cat.owner.name + " and is a " + cat.getSpecies());
            System.out.println(cat.name + " is " + (catIsHappy ? "happy" : "not happy"));
            System.out.println(cat.name + " was born on " + cat.getBirthday());
        } catch (Exception e) {
            System.out.println("Failed creating cat: " + e.getMessage());
        }

        try {
            Dog dog = new Dog("Doggy", owner, Instant.now().minusSeconds(1000).getEpochSecond());

            boolean dogIsGood = dog.walkies();
            boolean dogIsHungry = dog.giveTreat();
            System.out.println(dog.name + " belongs to " + dog.owner.name + " and is a " + dog.getSpecies());
            System.out.println(dog.name + " is " + (dogIsGood ? "a good Dog" : " a bad Dog"));
            System.out.println(dog.name + " is " + (dogIsHungry ? "hungry" : "not hungry"));
            System.out.println(dog.name + " was born on " + dog.getBirthday());
        } catch (Exception e) {
            System.out.println("Failed creating dog: " + e.getMessage());
        }
    }
}
