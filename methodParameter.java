public class methodParameter {
  public static void main(String[] args) {
    sayHello("Glen", "Sitorus");
    sayHello("Aldo", "Lee");
    sayHello("Jhon", "Davincent");
  }

  static void sayHello(String firsName, String lastName){
    System.out.println("Hello "+firsName+" "+lastName);
  }
}
