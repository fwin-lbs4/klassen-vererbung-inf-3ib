import java.time.Instant;
import java.util.Random;

/**
 * This class defines a cat.
 *
 * @author Florian.WINDISCH
 * @version 1.0
 */
public class Cat extends Pet {
    /**
     * Happiness of the cat.
     */
    private boolean happy;

    /**
     * If a timestamp was passed to the constructor pass it to the constructor of the parent.
     *
     * @param birthday   Unix timestamp when the cat was born.
     * @param name       Name of the cat.
     * @param owner      The owner of the cat.
     * @param <T>        Generic type used for owner.
     * @throws Exception Throws if owner is not of type Person or String.
     */
    public <T> Cat(String name, T owner, long birthday) throws Exception {
        super("cat", name, owner, birthday);
        this.happy = (new Random()).nextInt(2) == 0;
    }

    /**
     * If no timestamp is passed to the constructor the cat will be born now.
     *
     * @param name  Name of the cat.
     * @param owner The owner of the cat.
     */
    public <T> Cat(String name, T owner) throws Exception {
        super("cat", name, owner, Instant.now().getEpochSecond());
        this.happy = (new Random()).nextInt(2) == 0;
    }

    /**
     * Play with the cat.
     *
     * @return True or false depending on the happiness of the cat.
     */
    public boolean play() {
        System.out.println("You are playing with " + name + "!");
        this.happy = (new Random()).nextInt(2) == 0;
        return this.happy;
    }
}
