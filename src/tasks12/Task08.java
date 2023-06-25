package tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        int [] numArr=new int[5];
        int [] oddNumbersOfArray=new int[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            numArr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
            if (numArr[i]%2==1) {
                oddNumbersOfArray[i]=numArr[i];
            }
        }
        System.out.println("oddNumbersOfArray = " + Arrays.toString(oddNumbersOfArray));
    }
}
