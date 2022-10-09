import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Read {

  public void ReadTask(String text, ArrayList<Planner> ListTask) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {
      String[] Data = scan.nextLine().split(" ");
      int id = Integer.parseInt(Data[0]);
      SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
      Date dataInput = date.parse(Data[1] + " " + Data[2]);
      SimpleDateFormat datedeadLine = new SimpleDateFormat("dd.MM.yyyy");
      Date deadLine = datedeadLine.parse(Data[3]);
      String nameAuthor = Data[4];
      ListTask.add(new Task(id, dataInput,
          deadLine, nameAuthor));
    }
    scan.close();
    r.close();
  }
}
