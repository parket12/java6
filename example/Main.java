package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.example.CemeteryService.exhumation;
import static org.example.Service.*;

public class Main {
    public static void main(String[] args) {
        int Occupiedgravess = 100;
        int numberOfPlacess = 200;
        Main Main = new Main();
        Employee employee1 = new Employee("Иванов Иван Иванович", 82, "часть команды, часть корабля через 2 года");
        Employee employee2 = new Employee("Коргополов Артём Витальевич", 18, "часть команды, часть корабля через 4 года");
        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2));
        welcome();
        do {
            Actions();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    employeesInfo(employees);
                    break;
                case 2:
                    plantFlowers();
                    break;
                case 3:
                    cleanGrave();
                    break;
                case 4:
                    numberOfPlaces(Occupiedgravess);
                    break;
                case 5:
                    exhumation();
                    break;
                case 6:
                    Service.cremation(employees);
                    break;
                case 7:
                    Service.burning(employees);
                    break;
                case 8:
                    Occupiedgraves(100);
                    break;
                default:
                    System.out.println("Неверный выбор. Повторите попытку.");
            }
        }while (true) ;
    }
}