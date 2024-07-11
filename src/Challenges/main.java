package Challenges;

import java.util.ArrayList;
import java.util.List;

public class main
{
    List<Contact> mycontact;
    public static void main(String[] args)
    {
        Contact v = new Contact("ali","rehman");

        System.out.println(  Contact.createContact("ashir","ui"));

        MobilePhone m= new MobilePhone("124");
        m.updateContact(Contact.createContact("Ali","1234"),Contact.createContact("Ai","22"));

        System.out.println(m.findContact("Ali"));






    }




}
