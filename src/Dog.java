import java.time.Instant;

/**
 * This class defines a dog.
 *
 * @author Florian.WINDISCH
 * @version 1.0
 */
public class Dog extends Pet {
    /**
     * Is the dog a good dog?
     */
    private boolean goodDog;

    /**
     * If a timestamp was passed to the constructor pass it to the constructor of the parent.
     *
     * @param birthday Unix timestamp when the dog was born.
     * @param name     Name of the dog.
     * @param owner    The owner of the dog.
     */
    public <T> Dog(String name, T owner, long birthday) throws Exception {
        super("dog", name, owner, birthday);
        this.goodDog = true;
    }

    /**
     * If no timestamp is passed to the constructor the dog will be born now.
     *
     * @param name       Name of the dog.
     * @param owner      The owner of the dog.
     * @param <T>        Generic type used for owner.
     * @throws Exception Throws if owner is not of type Person or String.
     */
    public <T> Dog(String name, T owner) throws Exception {
        super("dog", name, owner, Instant.now().getEpochSecond());
        this.goodDog = true;
    }

    /**
     * Go on a walk with the dog.
     *
     * @return Always true since all dogs are good dogs.
     */
    public boolean walkies() {
        if (!this.goodDog) {
            this.goodDog = true;
        }

        System.out.println(owner.name + " goes for a walk  with " + name + "!");
        return this.goodDog;
    }

    /**
     * Give the dog a treat.
     * This also feeds the dog.
     *
     * @return Always false since the dog will be fed and is not hungry anymore.
     */
    public boolean giveTreat() {
        System.out.println(owner.name + " gives a treat to " + name + "!");
        return this.feed();
    }
}
