package tasks07_StringManipulation;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.
        String str="ApPle";
        System.out.println(str.equalsIgnoreCase("apple")?"eşit ":"eşit değil");


    }
}
