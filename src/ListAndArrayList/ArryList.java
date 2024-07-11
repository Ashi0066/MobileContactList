package ListAndArrayList;


import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name,String type,int count ){

    public GroceryItems(String name){
        this(name,"Dairy",1);
    }

    @Override
    public String toString()
    {
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class ArryList
{


    public static void main(String[] args)
    {


        // here we did not need to specify the type of the array because array list is resizable array implementation


        ArrayList<GroceryItems> groceryItems = new ArrayList<>();

        groceryItems.add(new GroceryItems("hh"));
        groceryItems.add(new GroceryItems("butter"));
        groceryItems.add(new GroceryItems("Milk"));
        groceryItems.add(0,new GroceryItems("Cheese"));
        groceryItems.set(1,new GroceryItems("Water","Raw",1));
        groceryItems.remove(0);


        System.out.println(groceryItems.getClass().getName());




        System.out.println(groceryItems);




    }




}
