package tasks27_Abstraction.Ornek1;

public class OtoMain {
    public static void main(String[] args) {
        Ford ford1 = new Ford();
        ford1.setUretimYili(2020);

        System.out.println(ford1.getMarka());//Ford Focus
        System.out.println(ford1.getUretimYili());//2020 2020
    }
}
