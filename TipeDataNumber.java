public class TipeDataNumber {
  public static void main(String[] args) {
    // Masih bilangan bulat
    byte iniByte = 100;// 1 byte 
    short iniShort = 1000; // 2 byte
    int iniInt = 1000000; // 4 byte
    long iniLong = 100000000;// 8 byte
    long iniLong2 = 10000000l;

    // Bilangan desimal 
    float iniFloat = 10.10f;
    double iniDouble = 10.10f;


    // Literals
    int decimalInt = 25;
    int hexInt = 0xA132B;
    int biInt = 0b01010101;

    //Underscore = memudahkan membaca nilai yang banyak
    long balance = 1_000_000_000_00l;
    int sum = 60_000_000;

    // Menampilkan program bil.bulat
    System.out.println("Nilai byte : " + iniByte);
    System.out.println("Nilai short :"+iniShort);
    System.out.println("Ini int :"+ iniInt);
    System.out.println("Ini long :"+iniLong);
    System.out.println("Nilai long 2 :"+iniLong2);


    // Menampilkan bilangan desimal 
    System.out.println("Nilai float :"+iniFloat);
    System.out.println("Ini double :"+iniDouble);


    // Menampilkan literals
    System.out.println("Nilai desimal int :"+decimalInt);
    System.out.println("Nilai hexa Int :"+hexInt);
    System.out.println("Nilai binary Int :"+biInt);

    //  Menampilkan Underscore
    System.out.println("Nilai balance :"+balance);
    System.out.println("Nilai sum :"+sum);
  }
}
