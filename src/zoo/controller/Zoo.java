package zoo.controller;

import zoo.allAnimals.*;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    List<Animal> animalList;

    public Zoo() {
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public <T extends Animal> Animal getTallestAnimal(Class<T> classe) {
        Animal currentTallest = null;
        for (Animal animal : animalList) {
            if (classe.isInstance(animal)) {
                if (currentTallest == null) {
                    currentTallest = animal;
                } else if (animal.getHeight() > currentTallest.getHeight()) {
                    currentTallest = animal;
                }
            }
        }
        return currentTallest;
    }

    public <T extends Animal> Animal getSmallestAnimal(Class<T> classe) {
        Animal currentSmallest = null;
        for (Animal animal : animalList) {
            if (classe.isInstance(animal)) {
                if (currentSmallest == null) {
                    currentSmallest = animal;
                } else if (animal.getHeight() < currentSmallest.getHeight()) {
                    currentSmallest = animal;
                }
            }
        }
        return currentSmallest;
    }

    public <T extends Animal> Animal getHeaviestAnimal(Class<T> classe) {
        Animal currentHeaviest = null;
        for (Animal animal : animalList) {
            if (classe.isInstance(animal)) {
                if (currentHeaviest == null) {
                    currentHeaviest = animal;
                } else if (animal.getHeight() > currentHeaviest.getWeight()) {
                    currentHeaviest = animal;
                }
            }
        }
        return currentHeaviest;
    }

    public <T extends Animal> Animal getLightestAnimal(Class<T> classe) {
        Animal currentLightest = null;
        for (Animal animal : animalList) {
            if (classe.isInstance(animal)) {
                if (currentLightest == null) {
                    currentLightest = animal;
                } else if (animal.getHeight() < currentLightest.getWeight()) {
                    currentLightest = animal;
                }
            }
        }
        return currentLightest;
    }

    public AnimalWithTails getlongestTail() {
        AnimalWithTails currentLongestTail = null;
        for (Animal animal : animalList) {
            if (animal instanceof AnimalWithTails) {
                AnimalWithTails animalWithTails = (AnimalWithTails) animal;
                if (currentLongestTail == null) {
                    currentLongestTail = animalWithTails;
                } else if (animalWithTails.getTailLength() > currentLongestTail.getTailLength()) {
                    currentLongestTail = animalWithTails;
                }
            }
        }
        return currentLongestTail;
    }

    public AnimalsWithWings getWidestWingSpan() {
        AnimalsWithWings currentWidestWingspan = null;
        for (Animal animal : animalList) {
            //se è una instanza  lo implemento direttamente nella nuova variabile
            if (animal instanceof AnimalsWithWings animalsWithWings) {
                if (currentWidestWingspan == null) {
                    currentWidestWingspan = animalsWithWings;
                } else if (animalsWithWings.getWingspan() > currentWidestWingspan.getWingspan()) {
                    currentWidestWingspan = animalsWithWings;
                }
            }
        }
        return currentWidestWingspan;
    }

}