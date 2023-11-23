package zoo.allAnimals;

import zoo.controller.Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
            Zoo zoo = new Zoo();

            Lion lion1 = new Lion("Lionel","Bistecca", 1,LocalDate.of(2023, 2, 13), 100, 1.30,1);
            Lion lion2 = new Lion("Mufasa","Pollo", 2,LocalDate.of(2023, 1, 15), 90, 1.0,1.2);
            Lion lion3 = new Lion("Sarabi","Bistecca", 1,LocalDate.of(2023, 2, 18), 120, 1.15,0.8);

            zoo.addLion(lion1);
            zoo.addLion(lion2);
            zoo.addLion(lion3);


            Tiger tiger1 = new Tiger("Diego","Cervo",2,LocalDate.now(),70,1,0.3);
            Tiger tiger2 = new Tiger("Jacob the Tiger","Cervo",2,LocalDate.now(),80,0.8,0.5);
            Tiger tiger3 = new Tiger("Tigre","Pollo",2,LocalDate.now(),69,1,0.4);

            zoo.addTiger(tiger1);
            zoo.addTiger(tiger2);
            zoo.addTiger(tiger3);

            Eagle eagle1 = new Eagle("Thorondor","Pesce",1,LocalDate.now(),20,0.2,1);
            Eagle eagle2 = new Eagle("Gwaihir","Pesce",1,LocalDate.now(),11,0.4,1.3);

            zoo.addEagle(eagle1);
            zoo.addEagle(eagle2);

            System.out.println("L'animale con la coda più lunga è..." + zoo.getLongestTail().getName());
            System.out.println("l'animale con la maggiore apertura alare è..."+ zoo.getGreatestWing().getName());



           System.out.println("il leone più grande è.." + zoo.getHeaviestLion().getName());

            System.out.println("... ed il più piccolo è ..." + zoo.getLightestLion().getName());

            System.out.println("la tigre più grande è..."+ zoo.getHeaviestTiger().getName());

            System.out.println("il leone più alto è.."+ zoo.getHighestLion().getName());
        }
    }
