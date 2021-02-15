package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;
/**
 * ContactListController is responsible for all communication between views and ContactList object
 */

public class ContactListController {

    private ContactList contactList;

    public ContactListController(ContactList contactList){
        this.contactList = contactList;
    }

    public void setContacts(ArrayList<Contact> contactList) {
        this.contactList.setContacts(contactList);
    }

    public ArrayList<Contact> getContacts() {
        return contactList.getContacts();
    }

    public boolean addContact(Contact contact, Context context){
        AddContactCommand addContactCommand = new AddContactCommand(contactList, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contactList, contact, context);
        deleteContactCommand.execute();
        return deleteContactCommand.isExecuted();
    }

    public boolean editContact(Contact oldContact, Contact newContact, Context context){
        EditContactCommand editContactCommand = new EditContactCommand(contactList, oldContact, newContact, context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }

    public Contact getContact(int index) {
        return contactList.getContact(index);
    }

    public int getSize() {
        return contactList.getSize();
    }

    public void loadContacts(Context context) {
        contactList.loadContacts(context);
    }

    public Contact getContactByUsername(String username) {
        return contactList.getContactByUsername(username);
    }

    public boolean hasContact(Contact contact) {
        return contactList.hasContact(contact);
    }

    public int getIndex(Contact contact) {
        return contactList.getIndex(contact);
    }

    public boolean isUsernameAvailable(String username_str) {
        return contactList.isUsernameAvailable(username_str);
    }

    public ArrayList<String> getAllUsernames(){
        return  contactList.getAllUsernames();
    }

    public void addObserver(Observer observer) {
        contactList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contactList.removeObserver(observer);
    }

}
