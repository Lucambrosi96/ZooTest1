package zoo.allAnimals;

import java.time.LocalDate;

public class AnimalsWithWings extends Animal {
    private double wingspan;
    public AnimalsWithWings(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double eight, double wingspan) {
        super(name, favoriteFood, age, entryDate, weight, eight);
        this.wingspan = wingspan;
    }
    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}