public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    
    // Perbedaan primitif dengan non primitif
    /*  primitif
    byte iniByte = null; // ini akan eror karena cuma bisa pakai  sekali nama variabel dari tipe data primitif terseubt

    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);
  */
  //Bukan primitif
  Byte iniByte  = null;
  System.out.println(iniByte);
  /*Keduanya akan bisa dijalankan meski nama variabelnya sama */
  iniByte = 100;
  System.out.println(iniByte);
  
  // Konversi primitif -> bukan primitif
    int usia = 17;
    Integer usiaObjek = usia;
    short shortUsia = usiaObjek.shortValue();
    System.out.println(shortUsia);
  }
}
