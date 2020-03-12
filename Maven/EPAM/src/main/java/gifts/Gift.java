package gifts;
import java.util.*;
import sweets.Sweet;

public class Gift{
    ArrayList<Sweet> gifts=new ArrayList<Sweet>();

    public Gift(){

    }

    public int getWeight(){
        sortGifts();
        int totalWeight=0;

        for(int i=0;i<gifts.size();i++)
            totalWeight+=gifts.get(i).getSWeight();

        return totalWeight;
    }

    public void add(Sweet s){
        gifts.add(s);
    }

    public void sortGifts(){
        Collections.sort(gifts);
    }

    public String toString(){
        StringBuilder s=new StringBuilder();


        for(int i=0;i<gifts.size();i++) {
            s.append(gifts.get(i).getName());
            s.append(" ");
        }
        String result=s.toString();

        return result;
    }

}
