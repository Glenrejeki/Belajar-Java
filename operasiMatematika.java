public class operasiMatematika {
  public static void main(String[] args) {
    

    // Operasi Biasa
    int a = 100;
    int b = 10;

    // Menampilkan operasi biasa 
    
    System.out.println("Operasi biasa :");
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);

        

    // Augmented assigments
    System.out.println("Augmented assigments :");
    int angka = 100;
    angka +=10;
    System.out.println(angka);
    angka -= 10;
    System.out.println(angka);
    angka *= 10;
    System.out.println(angka);
    angka /=10;
    System.out.println(angka);
    angka %= 10;
    System.out.println(angka);

    // Contoh lain augmented assigments
    System.out.println("Contoh lain Augmented assigments :");
    int angka1 = 100;
    angka1 +=10;
    angka1 -= 10;
    angka1 *= 10;
    angka1 %= 10;
    angka1 /=10;
    System.out.println(angka1);

    // Unary Operator
    int d = +100;
    ++d;
    System.out.println(d);
    --d;
    System.out.println(d);
    --d;
    System.out.println(d);
    d= -d;
    System.out.println(d);
  }
}
