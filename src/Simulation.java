import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String fileName) {
        ArrayList<Item> payload = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            String[] itemPayload;

            while (scanner.hasNextLine()) {
                itemPayload = scanner.nextLine().split("=");
                Item item = new Item(itemPayload[0], Integer.parseInt(itemPayload[1]));
                payload.add(item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return payload;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> payload) {
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        U1 u1 = new U1();
        for (Item item : payload) {
            if (u1.canCarry(item)) {
                u1.carry(item);
            } else {
                u1Rockets.add(u1);
                u1 = new U1();
                u1.carry(item);
            }
        }
        u1Rockets.add(u1);
        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> payload) {
        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        U2 u2 = new U2();
        for (Item item : payload) {
            if (u2.canCarry(item)) {
                u2.carry(item);
            } else {
                u2Rockets.add(u2);
                u2 = new U2();
                u2.carry(item);
            }
        }
        u2Rockets.add(u2);
        return u2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        for (Rocket rocket : rockets) {
            totalBudget += rocket.getCost();
            while (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getCost();
            }
        }
        return totalBudget;
    }
}
