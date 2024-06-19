public class breakContinue {
  public static void main(String[] args) {
    


    // Break
    var counter = 1;
    
    while (true) {
      System.out.println("Perulangan ke "+ counter);
      counter++;
      if (counter>10){
        break;
      }
    }
    System.out.println("Perulangan berhenti");


    // Continue
    for (var hitung = 1; hitung <= 100; hitung++){
      if (hitung % 2 == 0){
        continue;
      }
      System.out.println("Perulangan ganjil ke - "+ hitung);
    }
  }
}
