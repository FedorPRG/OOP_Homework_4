import java.util.ArrayList;

public class Print {
  public void PrintListTask(ArrayList<Planner> ListTask) {
    System.out.println("id Дата и время создания задачи  Время deadlina ФИО Автора задачи");
    for (Planner task : ListTask) {
      System.out.println(task.getFullName());
    }
  }
}
