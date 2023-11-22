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


       Lion highest = lionList.get(0);


       for (int i=1; i<lionList.size();i++)
       {

           if(lionList.get(i).getEight() > highest.getEight())
           {
               highest= lionList.get(i);
           }


       }



       return highest;
     }
     public Lion  getsmallLion(){

       Lion small = lionList.get(0);

       for(int i=1; i<lionList.size();i++){
           if(lionList.get(i).getEight() < small.getEight()){
               small= lionList.get(i);
           }
       }

       return small;
     }

     public Lion getHeavyLion(){
       Lion heavy = lionList.get(0);
       for(int i=1;i<lionList.size();i++){
           if(lionList.get(1).getWeight()> heavy.getWeight()){
               heavy= lionList.get(i);
           }
       }
       return heavy;
     }
     public  Lion getLightLion(){
       Lion  light =  lionList.get(0);
       for(int i=1;i<lionList.size();i++){
           if(lionList.get(1).getWeight()< light.getWeight()){
               light= lionList.get(i);
           }
       }
       return  light;
     }





     //TIGRE//
     public  Tiger getHighestTiger(){

       Tiger highest = tigerList.get(0);
       for(int i=1; i<tigerList.size(); i++){
           if (tigerList.get(i).getEight() > highest.getEight()){
               highest = tigerList.get(i);
           }
       }
       return highest;
     }
     public  Tiger getSmallTiger(){
       Tiger small = tigerList.get(0);
       for(int i=1; i<tigerList.size(); i++){
           if (tigerList.get(i).getEight() < small.getEight()){
               small= tigerList.get(i);
           }
       }
       return small;
     }

     public Tiger getHeavyTiger(){
       Tiger heavy=tigerList.get(0);
       for(int i=1; i<tigerList.size();i++){
           if (tigerList.get(i).getWeight()> heavy.getWeight()){
               heavy=tigerList.get(i);
           }
       }
       return heavy;
     }

     public Tiger getLightTiger(){
       Tiger light=tigerList.get(0);
       for(int i=1; i<tigerList.size();i++){
           if(tigerList.get(i).getWeight()< light.getWeight()){
               light=tigerList.get(i);
           }
       }
       return light;
     }




     //AQUILE//
     public Eagle  getHighestEagle(){
       Eagle highest = eagleList.get(0);
       for(int i=1; i<eagleList.size(); i++){
           if (eagleList.get(i).getEight() > highest.getEight()){
               highest=eagleList.get(i);
           }
       }
       return  highest;
     }

     public Eagle getSmallEagle(){
       Eagle small= eagleList.get(0);
       for(int i=1; i<eagleList.size(); i++){
           if(eagleList.get(i).getEight() < small.getEight()){
               small=eagleList.get(i);
           }
       }
       return small;
     }
     public Eagle getHeavyEagle(){
       Eagle heavy= eagleList.get(0);
       for (int i =1; i<eagleList.size();i++){
           if(eagleList.get(i).getWeight() > heavy.getWeight()){
               heavy=eagleList.get(i);
           }
       }
       return heavy;
     }
     public Eagle getLightEagle(){
       Eagle light= eagleList.get(0);
       for (int i =1;i< eagleList.size();i++){
           if (eagleList.get(i).getWeight()< light.getWeight()){
               light=eagleList.get(i);
           }
       }
       return light;
     }


      //ALTRO//


     public Felines getlongerTail(){
       List<Felines> felinesList = new ArrayList<>();
       felinesList.addAll(lionList);
       felinesList.addAll(tigerList);
       Felines longTail =  felinesList.get(0);
       for (int i=1; i<felinesList.size();i++){
           if(felinesList.get(i).getTailLenght() > longTail.getTailLenght()){
               longTail=felinesList.get(i);
           }
       }
       return longTail;
     }
     public Winged getGreatestWing(){
       List<Winged> wingedList = new ArrayList<>(eagleList);
       Winged greaestWing = wingedList.get(0);
       for (int i = 1; i<wingedList.size();i++){
           if (wingedList.get(i).getWingspan() > greaestWing.getWingspan()){
               greaestWing= wingedList.get(i);
           }
       }

        return   greaestWing;
     }

}
