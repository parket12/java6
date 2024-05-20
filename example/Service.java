// Service.java
package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Service {
    static Log ServiceLog;
    static {
        try {
            ServiceLog = new Log("ServiceLog.log", Level.ALL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void plantFlowers() {
        try {
            System.out.println("Выберите цветы , которые вы хотите поставить в магилу.");
            List<String> list = new ArrayList<>(Arrays.asList("1)Ромашки \t 100р", "\n 2)Тюльманы \t 200р"));
            System.out.println(list);
            System.out.println("Выберите цветы");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Укажите колличество ромашек ");
                    int colvo = scanner.nextInt();
                    ServiceLog.Logger.info("К оплате " + colvo * 100 + "р");
                    break;
                case 2:
                    System.out.println("Укажите колличество Тюльпанов ");
                    int colvoo = scanner.nextInt();
                    ServiceLog.Logger.info("К оплате " + colvoo * 200 + "р");
                    break;
            }
        }
        catch (Exception e){
            System.out.println(e);
            ServiceLog.Logger.warning("Произошла ошибка: " + e);
        }
    }
    public static void  Occupiedgraves(int Occupiedgraves) {
        ServiceLog.Logger.info("Количество занятых мест на кладбище : " + Occupiedgraves);
    }
    public static void cleanGrave() {
        try {
            System.out.println("Выберите версию уборки: \n 1)Убрать с кайфом \n 2)Убрать без кайфа");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ServiceLog.Logger.info("К оплате 5,000р");
                    break;
                case 2:
                    ServiceLog.Logger.info("К оплате 10,000р");
                    break;
            }
        }
        catch (Exception e){
            System.out.println(e);
            ServiceLog.Logger.warning("Произошла ошибка: " + e);
        }
    }
    public static void  numberOfPlaces(int numberOfPlacess) {
        ServiceLog.Logger.info("Количество доступных мест на кладбище : "+ numberOfPlacess);

    }
    public static void cremation(List<Employee> employees) {
        try {
            System.out.println("Выберите сотрудника, которого хотите кремировать:");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                ServiceLog.Logger.info((i + 1) + ") " + employee.getName() + ", " + employee.getAge() + " лет, " + employee.getRole());
            }
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            employees.remove(choice - 1);
            ServiceLog.Logger.info("Сотрудник с индексом " + choice + " кремирован заживо. Оставшиеся сотрудники:");
            for (Employee employee : employees) {
                ServiceLog.Logger.info(employee.getName() + ", " + employee.getAge() + " лет, " + employee.getRole());
            }
        }
        catch (Exception e){
            System.out.println(e);
            ServiceLog.Logger.warning("Произошла ошибка: " + e);
        }
    }
    public static void welcome() {
        System.out.println("Добро пожаловать на кладбище!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите войти? (Да/Нет)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Нет")) {
            ServiceLog.Logger.info("Хорошо, приходите в следующий раз.");
            System.exit(0);
        }
    }
    public static void Actions() {
        System.out.println("Выберите действие:");
        System.out.println("1. Информация о работниках");
        System.out.println("2. Цветы");
        System.out.println("3. Уборка");
        System.out.println("4. Количество доступных мест");
        System.out.println("5. Вскрытие");
        System.out.println("6. Кремирование");
        System.out.println("7. Сожжение");
        System.out.println("8. Оплатить");
    }
    public static void burning(List<Employee> employees) {
        try {
            System.out.println("Выберите сотрудника, которого хотите сжечь заживо:");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                ServiceLog.Logger.info((i + 1) + ") " + employee.getName() + ", " + employee.getAge() + " лет, " + employee.getRole());
            }
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            employees.remove(choice - 1);
            ServiceLog.Logger.info("Сотрудник с индексом " + choice + " сожжён заживо. Оставшиеся сотрудники:");
            for (Employee employee : employees) {
                ServiceLog.Logger.info(employee.getName() + ", " + employee.getAge() + " лет, " + employee.getRole());
            }
        }
        catch (Exception e){
            System.out.println(e);
            ServiceLog.Logger.warning("Произошла ошибка: " + e);
        }
    }
    public static void employeesInfo(List<Employee> employees) {
        System.out.println("Действующие работники:");
        for (Employee employee : employees) {
            ServiceLog.Logger.info(employee.getName() + ", " + employee.getAge() + " лет, " + employee.getRole());
        }
    }
}
