import java.time.LocalDate;

public class Animal {
    private String name;
    private String favoriteFood;
    private int age;
    private LocalDate entryDate;
    private  double weight;
    private double eight;

    public Animal(String name, String favoriteFood, int age, LocalDate entryDate, double weight, double eight) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.entryDate = entryDate;
        this.weight = weight;
        this.eight = eight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getEight() {
        return eight;
    }

    public void setEight(double eight) {
        this.eight = eight;
    }







}
