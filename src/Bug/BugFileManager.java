package Bug;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BugFileManager {

    public static void saveBug(Bug bug, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(bug.getTitle() + "\n");
            writer.write(bug.getDescription() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Bug loadBug(String filename) {
        Bug bug = new Bug();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            bug.setTitle(reader.readLine());
            bug.setDescription(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bug;
    }
}
