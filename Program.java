import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    ArrayList<Planner> ListTask = new ArrayList<>();
    Read r = new Read();
    Print p = new Print();
    Input i = new Input();
    Sort s = new Sort();
    System.out.print("\033[H\033[J");
    try (Scanner in = new Scanner(System.in)) {

      while (true) {
        System.out.println("Введите номер команды");
        System.out.println("1 - чтение из файла");
        System.out.println("2 - вывод на экран");
        System.out.println("3 - добавление записи");
        System.out.println("4 - сортировка");
        System.out.println("5 - запись в файл");
        String key = in.next();
        switch (key) {
          case "1":
            r.ReadTask("TaskLoad.csv", ListTask);
            break;
          case "2":
            p.PrintListTask(ListTask);
            break;
          case "3":
            i.InputTask(ListTask);
            break;
          case "4":
            s.SortTask(ListTask);
            break;
          case "5":
            Write.WriteTask("TaskSave.csv", ListTask);
            break;
          default:
            System.out.println("Такой команды нет");
            break;
        }
      }
    }
  }
}
