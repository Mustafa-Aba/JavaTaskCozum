package Task20;

import java.util.Scanner;

public class T02_ElektrikHesabi {

    int toplamTuketim;
    double oran=(0.7);
    double fatura;

   int tuketimEkle(int tuketilenEnerji){
      return toplamTuketim+=tuketilenEnerji;
   }
   double odenecekTutar(){
      return fatura=oran*toplamTuketim;
   }




}
