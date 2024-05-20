package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;


public class CemeteryService extends Service {

    static Log CemeteryServiceLog;
    static {
        try {
            CemeteryServiceLog = new Log("CemeteryServiceLog.log", Level.ALL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void exhumation() {
        try {
            System.out.println("Вскрытие могилы (дополнительная услуга).");
            System.out.println("Укажите номер могилы, которую вы хотите вскрыть:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("Укажите адрес, куда доставить вашего деда:");
            String adress = scanner.nextLine();
            CemeteryServiceLog.Logger.info("Труп из могилы " + choice + " будет доставлен по адресу " + adress + " завтра");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e);
            CemeteryServiceLog.Logger.warning("Произошла ошибка: " + e);
        }
    }

}


