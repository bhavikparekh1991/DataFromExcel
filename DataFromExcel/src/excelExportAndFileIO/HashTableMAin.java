package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashTableMAin {
	Hashtable<String, String> contacts;

	HashTableMAin() {
            contacts = new Hashtable<String, String>();
    }

    /*
    * Has the contact added to the phone book
    * @param: String name
    * @return: true if the contact was added, false otherwise
    */
    public boolean hasName(String name) {
        return contacts.containsKey(name);
        
    }

    /* Find a contact by email address
    * @param: String emailAddress
    * @return: true if the contact with the email address was added, or false if not
    */
    public boolean hasEmailAddress(String emailAddress) {
        return contacts.containsValue(emailAddress);
    }

    /*
    * Find a contact
    * @param: String name
    * @return: the contact with the above name, or null if not found
    */
    public String findEmailAddress(String name) {
        String emailAddress = contacts.get(name);
        if (emailAddress != null) {
            System.out.println("[" + name + "]: [" + emailAddress + "]");
            return emailAddress;
        }else {
            System.out.println("Contact for [" + name + "] not found");
            return null;
        }
    }

    /*
    * Add a new contact
    * @param: String name, String emailAddress
    * @return: 1 if a new contact is created, 0 otherwise
    */
    public int addContact(String name, String emailAddress) {
        if (hasEmailAddress(emailAddress)) {
            System.out.println("Cannot add [" + name + "] Email address [" + emailAddress+ "] existed");
            return 0;
        } else if (hasName(name)) {
            System.out.println("Name [" + name + "] existed");
            return 0;
        } else {
            contacts.put(name, emailAddress);
            System.out.println("A new contact for [" + name + "] added");
            return 1;
        }
    }

    /*
    * Delete a contact
    * @param: String name
    * @return: 1 if one contact was deleted, 0 otherwise
    */
    public int deleteContact(String name) {
        if (hasName(name)) {
            contacts.remove(name);
            System.out.println("Contact for [" + name + "] removed");
            return 1;
        } else {
            System.out.println("Contact for [" + name + "] not found");
            return 0;
        }
    }

    /*
    * Print all contacts
    */
    public void listAllContacts() {
        System.out.printf("> Current contact list\n");
        System.out.printf("%-10s|%-20s\n", "Name", "Email Address");
        for (String name : contacts.keySet()) {
            String emailAddress = contacts.get(name);
            System.out.printf("%-10s|%-20s\n", name, emailAddress);
        }
    }
    
    public static void main(String[] args) {
    	 
    	HashTableMAin book = new HashTableMAin();
        book.addContact("Alice", "alice@example.com");
        book.addContact("Bob", "bob@example.com");
        book.addContact("Cathrine", "cathrine@example.com");
        book.addContact("Jane", "cathrine@example.com");
 
        System.out.println("> Find contact");
        book.findEmailAddress("Alice");
        book.findEmailAddress("Jane");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Alice");
        book.listAllContacts();
        
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        a1.add("mota");
        a1.add(0, "mota");
        System.out.println("\t"+a1);
        System.out.println(a1.indexOf("mota"));
        System.out.println(a1.lastIndexOf("mota"));
        a1.remove(1);
        a1.remove("mota");
        System.out.println("\t"+a1);
        System.out.println(a1.indexOf("mota"));
    }
 
}
