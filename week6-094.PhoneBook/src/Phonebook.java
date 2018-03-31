/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list_person = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.list_person.add(person);
    }
    public void printAll() {
        for (Person p: this.list_person) 
            System.out.println(p);
    }
    public String searchNumber(String name) {
        for (Person p: this.list_person) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known" ;
    }
}
