package org.example;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Миша", "Frontend Developer");
        Employee dev2 = new Developer("Вика", "Backend Developer");
        Employee manager = new Manager("Аня", "IT Department");

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(manager);

        directory.showDetails();
    }
}