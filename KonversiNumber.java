public class KonversiNumber {
  public static void main(String[] args) {
    

    // Bentuk widening casting
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;
    long iniLong = iniInt;
    float iniFloat = iniLong; 
    double iniDouble = iniFloat;

    // Bentuk narrowing casting
    double iniDouble2 = 123.453;
    float iniFloat2 = (float)iniDouble2;
    long iniLong2 = (long)iniFloat2;
    int iniInt2 = (int)iniLong2;
    short iniShort2 = (short)iniInt2;
    byte iniByte2 = (byte)iniShort2;


    // Menampilkan widening casting (otomatis) 
    System.out.println("Perubahan widening casting :"+iniDouble);

    //Menampilkan narrowing casting (manual)
    System.out.println("Perubahan narrowing casting :"+iniByte2);
  }
}
