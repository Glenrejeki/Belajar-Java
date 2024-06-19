public class forLoop {
  public static void main(String[] args) {
    

    // Perulangan tanpa henti
    /* for (;;){
      System.out.println("Perulangan tanpa henti");
      }
    */

  // Perulangan dengan kondisi 
  System.out.println("Perulangan dengan kondisi :");
  var counter = 1;
  for (; counter <= 10 ; )    {
    System.out.println("Perulangan ke "+counter);
    counter++;
  }

  // Perulangan dengan Init 
  System.out.println("Perulangan dengan Init : ");
  for (var hitung = 1;hitung <= 10 ; )    {
    System.out.println("Perulangan ke "+hitung);
    hitung++;
  }

  //Perulangan dengan post statement
  System.out.println("Perulangan dengan post statement : ");
  for (var hitung = 1;hitung <= 10 ; hitung++)    {
    System.out.println("Perulangan ke "+hitung);
  }  

  }
}
