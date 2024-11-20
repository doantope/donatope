package com.mycompany.ice4;
public class ConatctManager {
    private Contact[] contactList;

    public ConatctManager(Contact[] contactList) { 
        this.contactList = contactList;
    }

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

