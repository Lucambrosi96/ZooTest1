package zoo.allAnimals;

import java.time.LocalDate;

public class AnimalsWithTails extends Animal {
    private double tailLenght;
    public AnimalsWithTails(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double eight, double tailLenght) {
        super(name, favoriteFood, age, entryDate, weight, eight);
        this.tailLenght = tailLenght ;
    }
    public double getTailLenght() {
        return tailLenght;
    }
    public void setTailLenght(double tailLenght) {
        this.tailLenght = tailLenght;
    }
}
