public class SingletonDatabaseManager {

  private static SingletonDatabaseManager connectionObject;

  private SingletonDatabaseManager() {

  }

  public static SingletonDatabaseManager getConnectionObject() {
    if (connectionObject == null) {
      connectionObject = new SingletonDatabaseManager();
    }
    return connectionObject;
  }

  public void printConnectionObjectDetails() {
    System.out.println(" DB Manager Object -> " + this.connectionObject.hashCode());
  }

}
