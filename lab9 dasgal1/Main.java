import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Zoo<Animal> zoo = new Zoo<>();

        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Arslan"));

        List<Crane> cranes = new ArrayList<>();
        cranes.add(new Crane("Togoru"));

        List<Animal> allAnimals = new ArrayList<>();

        zoo.transferAnimals(lions, allAnimals);

        zoo.transferAnimals(cranes, allAnimals);

        System.out.println(allAnimals.get(0).getName() + ", " + allAnimals.get(1).getName());
    }
}
