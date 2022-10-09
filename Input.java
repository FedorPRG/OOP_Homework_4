import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Input {

  public void InputTask(ArrayList<Planner> ListTask) {
    Calendar calendarNow = new GregorianCalendar();
    Scanner input = new Scanner(System.in);
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt();
    // input.close();
 
    for (int i = 0; i < amount; i++) {
      Date dataInput = calendarNow.getTime();
      System.out.printf("Введите количество количество дней для решения задачи:");
      int days = input.nextInt();
      // input.close();

      calendarNow.roll(Calendar.DATE, days);
      Date deadLine = calendarNow.getTime();
      // String[] Data = InputTask.InputTask();
      System.out.printf("Введите ФИО (без пробелов) автора задачи:");
      Scanner inputAuthor = new Scanner(System.in);
      String nameAuthor = inputAuthor.nextLine();
      // input.close();
      Integer id = ListTask.get(ListTask.size()-1).getId();
      id=id+1;

      ListTask.add(new Task(id, dataInput, deadLine, nameAuthor));
    }
  }
}
