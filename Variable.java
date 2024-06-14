public class Variable {
  public static void main(String[] args) {
    

    //kode variabel
    String name;
    name = "Glen Rejeki Sitorus";

    int age = 19;
    String addres = "Indonesia";


    //Kata kunci variabel 
    var nama2 ="Bang jeki";
    /*nama = "Bang jeki";
    var nama; akan eror karena tidak disi nilai langsung ketika membuat var-nya*/
    
    // Kata kunci final
    final var prodi = "Informatika";
    prodi = "Rekayasa Perangkat Lunak"; // akan eror karena sudah ada final jadi final = mutlak




    // Menampilkan variabel
    System.out.println(name);
    System.out.println(age);
    System.out.println(addres);

    // Menampilkan kata kunci var
    System.out.println(nama2);

    // Menampilkan kata kunci final
    System.out.println(prodi); 
  }
}
