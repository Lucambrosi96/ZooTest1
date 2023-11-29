package zoo.allAnimals;

import java.time.LocalDate;

public class Lion extends AnimalWithTails {
    public Lion(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, entryDate, weight, height, tailLength);
    }
}
