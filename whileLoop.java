public class whileLoop {
  public static void main(String[] args) {
    // While loop cuma ada kondisi perulangan, tanpa ada init statement dan post statement
    var counter = 1;
    while (counter<=10) {
      System.out.println("Perulangan ke "+counter);
      counter++;
    }
  }
}
