import java.util.*;
class Contact{
    String name;
    String phoneNumber;

  
    Map<String, String> contacts = new HashMap<>();

    //Add contact.
    Map<String, String> addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
        return contacts;
    }

    //Search contact by name.
    String searchContact(String name) {
        if (contacts.containsKey(name)) {
            return "Phone number for " + name + ": " + contacts.get(name);
        } else {
            return "Contact not found.";
        }
    }

    //Delete contact.
    String deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            return "Contact deleted: " + name;
        } else {
            return "Contact not found.";
        }
    }
  

        public static void main(String[] args) {
            // Implementation of the contact management system
            
            Contact cn = new Contact();
            cn.addContact("John Doe", "123-456-7890");
            cn.addContact("Jane Smith", "987-654-3210");  
            cn.addContact("Alice Johnson", "555-123-4567");
            System.out.println(cn.searchContact("John Doe"));
            System.out.println(cn.searchContact("Jane Smith"));
            System.out.println(cn.deleteContact("Jane Smith"));
           
        }
        }
