package ru.bondarev.java2.lesson3;

public class Person {

    Person(){
    System.out.println("Создаем телефонный справочник");
    PhoneBook phonebook = new PhoneBook();
        System.out.println("-----------------");

        System.out.println("Наполняем телефонный справочник");
        phonebook.add("Иванов", "223344", "ivanov@mail.ru");
        phonebook.add("Иванов", "22334411", "ivanov1@mail.ru");
        phonebook.add("Петров", "22334499", "petrov@mail.ru");
        phonebook.add("Сидоров", "22334488", "sidorov@mail.ru");
        phonebook.add("Иванов", "22334422", "ivanov2@mail.ru");
        System.out.println("-----------------");

        System.out.println("Получаем контакты:");
        System.out.println("Иванов:");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров:");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров:");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи с фамилией Преображенский");
        System.out.println(phonebook.get("Преображенский"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "223344", "ivanov@mail.ru");
        System.out.println("Иванов:");
        System.out.println(phonebook.get("Иванов"));

        System.out.println("Пробуем записать существующий электронный адрес");
        phonebook.add("Сидоров", "22334488", "sidorov@mail.ru");
        System.out.println("Сидоров:");
        System.out.println(phonebook.get("Сидоров"));


}
}
