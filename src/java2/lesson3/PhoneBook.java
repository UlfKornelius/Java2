package ru.bondarev.java2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    public class PhoneBook {

    private HashMap<String, List<String>> book;


    public PhoneBook(){
        this.book = new HashMap<>();

    }

    public void add(String surname, String number, String email){
       searchPhone(surname, number);
       searchEmail (surname, email);
    }

    void searchPhone (String surname, String number) {
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println("Номер " + number + " добавлен для фамилии "  + surname);
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
        }



    }


        void searchEmail (String surname, String email) {
            if(book.containsKey(surname)){
                List<String> numbers = book.get(surname);
                if(!numbers.contains(email)){
                    numbers.add(email);
                    System.out.println("Эл.адрес " + email + " добавлен для фамилии "  + surname);
                } else {
                    System.out.println(String.format("Электронный адрес %s уже существует для фамилии %s", email, surname));
                }
            } else {
                book.put(surname, new ArrayList<>(Arrays.asList(email)));
                System.out.println(String.format("Электронный адрес %s добавлен для фамилии %s", email, surname));
            }



        }






    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
            return new ArrayList<>();
        }



    }






}
