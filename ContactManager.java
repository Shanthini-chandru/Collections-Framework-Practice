import java.util.*;
class ContactManager {
    

  
    private Map<String, String> contacts = new HashMap<>();

    //Add contact.
    String addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        return "Contact added: " + name + " - " + phoneNumber;
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
            
            ContactManager cn = new ContactManager();
           
            System.out.println(cn.addContact("John Doe", "123-456-7890"));
            System.out.println(cn.addContact("Jane Smith", "987-654-3210"));
            System.out.println(cn.addContact("Alice Johnson", "555-123-4567"));
            System.out.println(cn.searchContact("John Doe"));
            System.out.println(cn.searchContact("Jane Smith"));
            System.out.println(cn.deleteContact("Jane Smith"));
            System.out.println(cn.searchContact("Jane Smith"));
        }
        }
