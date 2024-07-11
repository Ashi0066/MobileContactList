package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists
{



    public static void main(String[] args)
    {

        String[] items = {"Apples","Bananas","milk","eggs"};



        // creates a immutable list
        List<String> list = List.of(items);


        // creates a mutable list
        // the below code works because array list is inherently mutable so however we initialize it  will always be mutable

        ArrayList<String> list1 = new ArrayList<>(List.of("a","b","c","e","f","g"));
        list1.add("e");
        list1.add("f");
        list1.add("g");
        System.out.println(list1.size()+1);
        System.out.println((long) list1.size());
        System.out.println(list1);
        System.out.println("the third item is = " + list1.get(2));
        list1.set(2,"e");
        System.out.println( list1.get(list1.size()-1));


        System.out.println();
        System.out.println("For loop ");
        System.out.println();
        for (String s : list1)
        {
            System.out.println(s);
        }

        System.out.println(list1);

//
//        list1.removeAll(List.of("a","b","C"));
//        System.out.println(list1);

        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);


        String[] arr = list1.toArray(new String[list1.size()]);
        System.out.println(Arrays.toString(arr));


        int[] arr2 = new int[3];

        List<Integer> list2 = new ArrayList<>();
        list2.add(null);

        List<String> list3 = List.of("9");











    }


}
