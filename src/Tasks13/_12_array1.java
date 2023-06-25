package Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.

    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
static int [] numArrays;
    public static void main(String[] args) {


        getUser();
        System.out.println(duplicate(numArrays));
    }

    private static void getUser() {
        Scanner input=new Scanner(System.in);
        System.out.println("kac elemanli array istersin");
        int boyut=input.nextInt();
        numArrays = new int[boyut];; //kullanicidan alinan deger yeni array in boyutu olarak belirlendi

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            numArrays[i]=input.nextInt(); //boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }

    }
    private static boolean duplicate(int[] numArrays) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < numArrays.length; i++) {
            arrayList.add(numArrays[i]);
        }
        for (int i = 0; i < numArrays.length ; i++) {
            if (arrayList.indexOf(numArrays[i])!=arrayList.lastIndexOf(numArrays[i])) {
                return true;
            }
        }
        return false;
    }

}