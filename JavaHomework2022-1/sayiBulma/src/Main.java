public class Main {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi=false;

        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMi= true;
                System.out.println("Sayı mevcuttur");
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı Mevcut");
        }
        else {
            System.out.println("Sayı Mevcut Değildir");
        }
    }
}
