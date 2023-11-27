package zoo.controller;

import zoo.allAnimals.*;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Lion> lionList;
    List<Tiger> tigerList;
    List<Eagle> eagleList;

    public Zoo() {
        lionList = new ArrayList<>();
        tigerList = new ArrayList<>();
        eagleList = new ArrayList<>();
    }

    public void addLion(Lion lion) {
        lionList.add(lion);
    }

    public void  addTiger(Tiger tiger){
        tigerList.add(tiger);
    }
    public  void addEagle(Eagle eagle){
        eagleList.add(eagle);
    }
    //LEONI//
    public Lion getHighestLion(){
        Lion currentHighest = lionList.get(0);
        for (int i=1; i<lionList.size();i++)
        {
            if(lionList.get(i).getEight() > currentHighest.getEight())
            {
                currentHighest= lionList.get(i);
            }
        }
        return currentHighest;
    }
    public Lion  getSmallestLion(){

        Lion currentSmallest = lionList.get(0);

        for(int i=1; i<lionList.size();i++){
            if(lionList.get(i).getEight() < currentSmallest.getEight()){
                currentSmallest= lionList.get(i);
            }
        }

        return currentSmallest;
    }

    public Lion getHeaviestLion(){
        Lion currentHeaviest = lionList.get(0);
        for(int i=1;i<lionList.size();i++){
            if(lionList.get(1).getWeight()> currentHeaviest.getWeight()){
                currentHeaviest= lionList.get(i);
            }
        }
        return currentHeaviest;
    }
    public  Lion getLightestLion(){
        Lion  currentLightest =  lionList.get(0);
        for(int i=1;i<lionList.size();i++){
            if(lionList.get(1).getWeight()< currentLightest.getWeight()){
                currentLightest= lionList.get(i);
            }
        }
        return  currentLightest;
    }
    //TIGRE//
    public  Tiger getHighestTiger(){

        Tiger currentHighest = tigerList.get(0);
        for(int i=1; i<tigerList.size(); i++){
            if (tigerList.get(i).getEight() > currentHighest.getEight()){
                currentHighest = tigerList.get(i);
            }
        }
        return currentHighest;
    }
    public  Tiger getSmallestTiger(){
        Tiger currentSmallest = tigerList.get(0);
        for(int i=1; i<tigerList.size(); i++){
            if (tigerList.get(i).getEight() < currentSmallest.getEight()){
                currentSmallest= tigerList.get(i);
            }
        }
        return currentSmallest;
    }

    public Tiger getHeaviestTiger(){
        Tiger currentHeaviest=tigerList.get(0);
        for(int i=1; i<tigerList.size();i++){
            if (tigerList.get(i).getWeight()> currentHeaviest.getWeight()){
                currentHeaviest=tigerList.get(i);
            }
        }
        return currentHeaviest;
    }

    public Tiger getLightTiger(){
        Tiger currentLightest=tigerList.get(0);
        for(int i=1; i<tigerList.size();i++){
            if(tigerList.get(i).getWeight()< currentLightest.getWeight()){
                currentLightest=tigerList.get(i);
            }
        }
        return currentLightest;
    }




    //AQUILE//
    public Eagle  getHighestEagle(){
        Eagle currentHighest = eagleList.get(0);
        for(int i=1; i<eagleList.size(); i++){
            if (eagleList.get(i).getEight() > currentHighest.getEight()){
                currentHighest=eagleList.get(i);
            }
        }
        return  currentHighest;
    }

    public Eagle getSmallestEagle(){
        Eagle currentSmallest= eagleList.get(0);
        for(int i=1; i<eagleList.size(); i++){
            if(eagleList.get(i).getEight() < currentSmallest.getEight()){
                currentSmallest=eagleList.get(i);
            }
        }
        return currentSmallest;
    }
    public Eagle getHeaviestEagle(){
        Eagle currentHeaviest= eagleList.get(0);
        for (int i =1; i<eagleList.size();i++){
            if(eagleList.get(i).getWeight() > currentHeaviest.getWeight()){
                currentHeaviest=eagleList.get(i);
            }
        }
        return currentHeaviest;
    }
    public Eagle getLightestEagle(){
        Eagle currentLightest= eagleList.get(0);
        for (int i =1;i< eagleList.size();i++){
            if (eagleList.get(i).getWeight()< currentLightest.getWeight()){
                currentLightest=eagleList.get(i);
            }
        }
        return currentLightest;
    }
    //ALTRO//
    public AnimalsWithTails getlongestTail(){
        List<AnimalsWithTails> animalsWithTailsList = new ArrayList<>();
        animalsWithTailsList.addAll(lionList);
        animalsWithTailsList.addAll(tigerList);
        AnimalsWithTails currentLongestTail =  animalsWithTailsList.get(0);
        for (int i=1; i<animalsWithTailsList.size();i++){
            if(animalsWithTailsList.get(i).getTailLenght() > currentLongestTail.getTailLenght()){
                currentLongestTail=animalsWithTailsList.get(i);
            }
        }
        return currentLongestTail;
    }
    public AnimalsWithWings getWingSpan(){
        List<AnimalsWithWings> animalsWithWingsList = new ArrayList<>(eagleList);
        AnimalsWithWings currentWingspan = animalsWithWingsList.get(0);
        for (int i = 1; i<animalsWithWingsList.size();i++){
            if (animalsWithWingsList.get(i).getWingspan() > currentWingspan.getWingspan()){
                currentWingspan= animalsWithWingsList.get(i);
            }
        }
        return   currentWingspan;
    }

}