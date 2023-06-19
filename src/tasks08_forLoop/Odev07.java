package tasks08_forLoop;

public class Odev07 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int bos = 8; bos >i ; bos--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1|| i==j||i==8) {
                    System.out.print("* ");
                }else
                    System.out.print("! ");
            }
            System.out.println();

        }

    }

}
