package ArrayListChallenge;


import java.util.ArrayList;
import java.util.Scanner;

// Part of java udemy course
public class Console1
{

    public static void main(String[] args)
    {
        Actions actions = new Actions();
        Scanner sc = new Scanner(System.in);
        actions.items = new ArrayList<>();

        System.out.println("= ".repeat(5)+" Please enter the functions you want to perform on list " + " =".repeat(5));

        System.out.println("===".repeat(30));
        String menu = """
                0 - to shutdown
                1 - to add items
                2 - to remove items
                4 - exit
                """;






        while (true)
        {
            System.out.println(menu);
            System.out.println("===".repeat(30));
            System.out.print("Enter the function = ");
            int input = sc.nextInt();

            sc.nextLine();


            if (input == 0)
            {
                System.out.println("Shutting down");
                sc.close();

                break;
            } else if (input == 1)
            {
                System.out.println("Please enter the item you want to add into the list ");

                String input2 = sc.nextLine();
                String[] items1= input2.split(",");
                for(String s:items1){
                    actions.setItems(s.trim());
                }


            } else if (input == 2)
            {
                System.out.println("Please enter the item you want to remove from the list ");
                String input3 = sc.nextLine();
                actions.removeItems(input3.trim());
            }
        }


    }



}
