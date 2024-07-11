package Challenges;

import java.util.List;
import java.util.ArrayList;
public class MobilePhone {
    // write code here


    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber=phoneNumber;
        myContacts =  new ArrayList<Contact>();
    }

    public boolean removeContact(Contact c){
        for (int i = 0; i < myContacts.size(); i++)
        {
            if(myContacts.get(i).getName().equals(c.getName())){
                myContacts.remove(i);
                return true;
            }
        }
        return false;


    }

    public boolean addNewContact(Contact contact) {
        for (Contact emycontact : myContacts) {
            if (emycontact.getName().equals(contact.getName())) {
                return false;
            }
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact old,Contact New){

        int index = myContacts.indexOf(old);

        if(index>=0){
            myContacts.set(index,New);
            return true;
        }else {
            return false;
        }

    }


    private int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++)
        {
            if (myContacts.get(i).getName().equals(contact)){
                myContacts.remove(i);
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String c ){


        for (Contact contact: myContacts){
            if (contact.getName().equalsIgnoreCase(c)){
                return contact;
            }
        }
        return null;
    }



    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i< myContacts.size(); i++){

            System.out.println((i+1)+"."+ myContacts.get(i).getName()+ " -> "+ myContacts.get(i).getPhoneNumber());

        }
    }




}