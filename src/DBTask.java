public class DBTask implements Runnable {

  @Override
  public void run() {

    SingletonDatabaseManager connection = SingletonDatabaseManager.getConnectionObject();
    connection.printConnectionObjectDetails();

    sleep();
  }

  private void sleep() {
    try {
      Thread.sleep(3000);
    } catch (Exception e) {
    }
  }
}
