package Task20;

import java.util.Scanner;

public class T04_Bisiklet {
    int hiz=10;
    int vites=1;//1<= vites <=5

    void hizdegistir(int yeniHiz){
        hiz=yeniHiz;
    }
    int vitesArtir(){
        return vites++;
    }
    int vitesAzalt(){
        return vites--;
    }
    void durumGoster(){
        System.out.println("hiz = " + hiz);
        System.out.println("vites = " + vites);
    }
    void dur(){
        System.out.println("STOP");
    }
    void islemYap(){
        System.out.println("***İşlemler Menüsü***");
        System.out.println("1->DurumGoster\t2->vites azalt\t3->vites artır\t4->hiz degistir\t5->Sürene vur bisiklet dursun");

        Scanner input=new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
                durumGoster();
                islemYap();
                break;
            case 2:
                if (vites>1) {
                    vitesAzalt();
                }else
                    System.out.println("vites 1'den düşük olamaz");
                islemYap();
                break;
            case 3:
                if (vites<5) {
                    vitesArtir();
                }else
                    System.out.println("vites 5'den yüksek olamaz");
                islemYap();
                break;
            case 4:
                System.out.println("Yeni hızı gir: ");
                hizdegistir(input.nextInt());
                islemYap();
                break;
            case 5:
                dur();

                break;
            default:
                System.out.println("Hatalı giriş. Tekrar dene!");
                islemYap();

        }

    }
}