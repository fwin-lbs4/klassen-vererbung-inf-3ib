/**
 * In this class we define a pet.
 * It is an abstract class, so it will never be instantiated on its own.
 *
 * @author Florian.WINDISCH
 * @version 1.0
 */
abstract class Pet extends Animal {
    /**
     * Name of the pet.
     */
    public String name;
    /**
     * Owner of the pet.
     */
    public final Person owner;
    /**
     * Is the pet hungry?
     */
    private boolean hungry;

    /**
     * Generate a pet with a species, name, owner and birthday.
     *
     * @param species    The species of the pet.
     * @param name       The name of the pet.
     * @param owner      The owner of the pet.
     * @param birthday   Unix timestamp when the pet was born.
     * @param <T>        Generic type used for owner.
     * @throws Exception Throws if owner is not of type Person or String.
     */
    public <T> Pet(String species, String name, T owner, long birthday) throws Exception {
        super(species, birthday);
        this.name = name;

        if (!(owner instanceof Person || owner instanceof String)) {
            throw new Exception("Parameter owner must be of type String or Person!");
        }

        this.owner = (owner instanceof String) ? new Person((String) owner) : (Person) owner;

        this.hungry = true;
    }

    /**
     * Feed the pet.
     *
     * @return Always false, since the pet will not be hungry after feeding.
     */
    public boolean feed() {
        if (this.hungry) {
            System.out.println(owner.name + " feeds " + name + "!");
            this.hungry = false;

            return false;
        }

        System.out.println(name + " is not hungry!");

        return this.hungry;
    }
}
