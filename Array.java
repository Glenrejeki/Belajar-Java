public class Array {
  public static void main(String[] args) {
    
    // Array biasa
    String[] arrayString = new String[3]; // jangan lupa dalam kurung setelah String soalnya tadi eror cuy
    arrayString[0] = "Glen";
    arrayString[1] = "Rejeki";
    arrayString[2] = "Sitorus";

    // Array Insialisasi 
    int [] arrayInt = new int []{
      10,90,80,29
    };
    long [] arrayLong = {
      1,2,3,4
    };
    String [] namaLengkap = {
      "Glen", "Rejeki", "Sitorus"
    };

    // Operasi di array 
    long [] panjangArray ={
      10,90,80,70
    };
    panjangArray [0]= 100;
    String [] namaUniv = {
      "UI","ITB","ITS","IT Del", "UPN Jakarta"
    };
    namaUniv [3] = null;

    //Array dalam array 
    String [][] kendaraan = {
      {"Mio","Honda Beat","Motor supra"},
      {"Kapal Ferry", "Speed Boat"},
      {"Pesawat Citilink", "Pesawat Lion", "Pesawat Garuda"},
    };





    

    // Menampilka array biasa 
    System.out.println(arrayString[0]);
    System.out.println(arrayString[1]);
    System.out.println(arrayString[2]);

    // Menampilkan insialisasi array
    for (int i : arrayInt ){
      System.out.println(i);
    }
    for (long i : arrayLong ){
      System.out.println(i);
    }
    for (String i : namaLengkap){
      System.out.println(i);
    }

    // Menampilkan operasi di array 
    System.out.println(panjangArray.length);
    System.out.println(panjangArray[0]);
    System.out.println(panjangArray[1]);
    for (long i : panjangArray){
      System.out.println(i);
    }
    System.out.println(namaUniv[3]);
    for(String i : namaUniv){
      System.out.println(i);
    };

    // Menampilkan array dalam array 
    System.out.println(kendaraan[0][1]);
    System.out.println(kendaraan[1][0]);
    System.out.println(kendaraan[2][2]);
  }
}
