package com.mycompany.ice4;
public class ConatctManager {


    //Comiting a second change
    private Contact[] contactList;

    public ConatctManager(Contact[] contactList) { 
        this.contactList = contactList;
    }
    
    //Comment nov-26-2024
    public Contact findContact(String emailAddress) {
        for (Contact contact : contactList) {
            if (contact.getEmailAddress().equalsIgnoreCase(emailAddress)) {
                return contact;
            }
        }
        return null;
    }
    
    

    public void clearContacts() {
        contactList = new Contact[0];
    }
}

