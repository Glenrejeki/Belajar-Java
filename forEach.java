public class forEach {
  public static void main(String[] args) {
    
    String [] nama = {
      "Glen ","Rejeki","Sitorus","TBJS","DEL"
    };
    
    
    // Tanpa For Each
    System.out.println("Tanpa For Each :");
    for (var i = 0; i < nama.length; i++){
      System.out.println(nama[i]);
    }

    // Pakai For Each
    System.out.println("Pakai For Each :");
    for (String namaOrang :nama){
      System.out.println(namaOrang);
    }
  }
}
