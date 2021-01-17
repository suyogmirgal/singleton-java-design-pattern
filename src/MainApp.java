public class MainApp {

  public static void main(String args[]) {

    DBTask task1 = new DBTask();
    DBTask task2 = new DBTask();
    DBTask task3 = new DBTask();

    System.out.println("\n Task 1:");
    task1.run();

    System.out.println("\n Task 2:");
    task2.run();

    System.out.println("\n Task 3:");
    task3.run();

  }
}
