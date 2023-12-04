package zoo.controller;

import zoo.animals.*;

import java.util.*;


public class Zoo {
    private final Map<Class<? extends Animal>, List<Animal>> animalMap;

    public Zoo() {
        this.animalMap = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        if (!animalMap.containsKey(animal.getClass())) {
            animalMap.put(animal.getClass(), new ArrayList<>());
        }
        animalMap.get(animal.getClass()).add(animal);
    }

    public <T extends Animal> Animal getTallestAnimal(Class<T> species) {
        return animalMap.get(species)
                .stream()
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);

    }

    public <T extends Animal> Animal getSmallestAnimal(Class<T> species) {
        return animalMap.get(species)
                .stream()
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);
    }


    public <T extends Animal> Animal getHeaviestAnimal(Class<T> species) {
        return animalMap.get(species)
                .stream()
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }

    public <T extends Animal> Animal getLightestAnimal(Class<T> species) {
        return animalMap.get(species)
                .stream()
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }

    public AnimalWithTail getLongestTail() {
        return animalMap.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(AnimalWithTail.class::isInstance)
                .map(AnimalWithTail.class::cast)
                .max(Comparator.comparing(AnimalWithTail::getTailLength))
                .orElse(null);
    }

    public AnimalWithWings getWidestWingspan() {
        return animalMap.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(AnimalWithWings.class::isInstance)
                .map(AnimalWithWings.class::cast)
                .max(Comparator.comparing(AnimalWithWings::getWingspan))
                .orElse(null);
    }
}