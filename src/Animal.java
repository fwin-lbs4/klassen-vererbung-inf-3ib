/**
 * In this class we define an Animal.
 * It is an abstract class, so it will never be instantiated on its own.
 *
 * @author Florian.WINDISCH
 * @version 1.0
 */
abstract class Animal {
    /**
     * Birthday of the animal.
     */
    private final long birthday;
    /**
     * Species of the animal.
     */
    private final String species;

    /**
     * Generate an animal with species and birthday.
     *
     * @param species  The species of the animal.
     * @param birthday Unix timestamp when the animal was born.
     */
    public Animal(String species, long birthday) {
        this.birthday = birthday;
        this.species = species;
    }

    /**
     * Get the birthday of the animal.
     *
     * @return The birthday of the animal as a long.
     */
    public long getBirthday() {
        return birthday;
    }

    /**
     * Get the species of the animal.
     *
     * @return The species of the animal as a String.
     */
    public String getSpecies() {
        return species;
    }
}
