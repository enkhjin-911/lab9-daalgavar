// Animal is the base class for all animals
public abstract class Animal {

    private String name;

    // Constructor: sets the animal's name when created
    public Animal(String name) {
        this.name = name;
    }

    // Returns the animal's name
    public String getName() {
        return name;
    }

    // When we print an Animal object, it shows the name
    @Override
    public String toString() {
        return name;
    }
}
