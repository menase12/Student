package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Prepare to accept user input
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Person> thePersonList = new ArrayList<Person>();
        int counter=0;
    do {
        Person newPerson = new Person();
        System.out.print("Enter person's first name: ");
        newPerson.setFirstName(keyboard.nextLine());
        System.out.print("Enter your last name: ");
        newPerson.setLastName(keyboard.nextLine());
        System.out.print("Enter you address: ");
        newPerson.getAddress(keyboard.nextLine());
        System.out.print("Enter your Phone number: ");
        newPerson.getPhoneNumber(keyboard.nextLine());
        System.out.print("Enter your email: ");
        newPerson.getEmail(keyboard.nextLine());
        thePersonList.add(newPerson);
        counter++;

    }while(counter<5);

        for(Person eachPerson: thePersonList)
        {
            System.out.println(eachPerson.getFirstName());

        }
        }
}

