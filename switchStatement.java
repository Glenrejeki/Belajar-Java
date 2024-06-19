public class switchStatement {
  public static void main(String[] args) {
    var nilai = 'F';

    switch (nilai) {
      case 'A':
        System.out.println("Wow, Anda lulus dengan baik");
        break;
      case 'B':
        System.out.println("Nilai anda cukup baik");
        break;
      case 'C':
        System.out.println("Nilai anda pas-pasan");
        break;
      case 'D':
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin anda salah jurusan wkwkw");
        break;
    }

    // Switch lamda
    switch (nilai){
      case 'A'-> System.out.println("Wow anda lulus dengan nilai baik");
      case 'B', 'C' -> System.out.println("Nilai adan cukup baik");
      case 'D'-> System.out.println("Anda tidak lulus");
      default -> System.out.println("Mungkin anda salah jurusan bos");
    }

    // Switch tanpa yield
    String ucapan;
    switch (nilai){
      case 'A'-> ucapan ="Wow anda lulus dengan nilai baik";
      case 'B', 'C' -> ucapan = "Nilai adan cukup baik";
      case 'D'-> ucapan = "Anda tidak lulus";
      default -> ucapan = "Anda emang gk niat kuliah";
    }
    System.out.println(ucapan);



  }
}
