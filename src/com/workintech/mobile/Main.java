package com.workintech.mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        MobilePhone phone = new MobilePhone("1231231231", contactList);
        Contact gokmen = new Contact("Gokmen", "1234");
        phone.addNewContact(new Contact("Nergis", "1235"));
        phone.addNewContact(new Contact("Dogan", "1236"));
        phone.addNewContact(new Contact("Kadir", "1237"));
        phone.addNewContact(new Contact("Gokmen", "1238"));
        phone.addNewContact(gokmen);
        phone.addNewContact(new Contact("Dogancan", "1234"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(gokmen));
        System.out.println("Index Name: " + phone.findContact("Dogancan"));
        System.out.println("Query Contact: " + phone.queryContact("Dogan"));
        System.out.println("Query Contact: " + phone.queryContact("Dogan"));
        System.out.println("Search Contact:" + phone.search("Gokmen"));
    }

}
