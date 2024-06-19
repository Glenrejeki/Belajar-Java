public class doWhileLoop {
  public static void main(String[] args) {
    /*Pengecekan kondisi di while loop dilakukan di awal perulangan dilakukan, sedangkan do while loop dilakukan setelah perulangan dilakakukan. Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true */


    var counter = 100;
    

    do {
      System.out.println("Perulangan ke "+counter);
      counter++;
    }while (counter <= 10);
  }
}
