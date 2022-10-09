import java.io.FileWriter;
import java.util.ArrayList;

public class Write {
  public static void WriteTask(String text, ArrayList<Planner> ListTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Planner Task : ListTask) {
      w.write(Task.getFullName() + "\n");
    }
    w.flush();
    w.close();
  }
}
