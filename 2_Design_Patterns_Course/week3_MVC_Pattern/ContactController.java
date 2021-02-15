package com.example.sharingapp;

/**
 * ContactController is responsible for all communication between views and Contact object
 */

public class ContactController {

    private Contact contact;

    public ContactController(Contact contact){
        this.contact = contact;
    }

    public String getUsername(){
        return contact.getUsername();
    }

    public void setUsername(String userName){
        contact.setUsername(userName);
    }

    public String getEmail(){
        return contact.getEmail();
    }

    public void setEmail(String email){
        contact.setUsername(email);
    }

    public String getId(){
        return contact.getId();
    }

    public void setId(String Id){
        contact.setUsername(Id);
    }

    public Contact getContact() { return this.contact; }

    public void addObserver(Observer observer) {
        contact.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact.removeObserver(observer);
    }
}
