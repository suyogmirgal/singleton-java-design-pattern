public class NonSingletonDatabaseManager {


  public NonSingletonDatabaseManager() {

  }

  public void printConnectionObjectDetails() {
    System.out.println(" DB Manager Object -> " + this.hashCode());
  }

}
