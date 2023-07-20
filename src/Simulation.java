import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems(String fileName) {
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

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return payload;
    }


}
