package ArrayListChallenge;

import java.util.Comparator;
import java.util.List;

public class Actions
{

    public List<String> items;



    public Boolean checkItem(String name){
        return items.contains(name);
    }

    public void setItems(String item)
    {
        if (items.contains(item)){
            System.out.println("Item already exist in the list ");
        }else {

            items.add(item);
            lisSorter();
            System.out.println("Item added to the list " + "\u2022" +" "+item );
            System.out.println(items);
        }
    }

    public void removeItems(String item){
        if (items.contains(item)){
            items.remove(item);
            lisSorter();
            System.out.println("Item removed from the list " + "• "+item);
            System.out.println(items);
        }else {
            System.out.println("The item does not exist in the list ");
        }

    }
    public void lisSorter(){
        items.sort(Comparator.naturalOrder());
    }

}
