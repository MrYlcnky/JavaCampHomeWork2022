public class Main {
    public static void main(String[] args) {
        //Overriding:  üzerine yazmak
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000));


        System.out.println("-------------------Polymorqhısm ");

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) { // Polymorqhısm
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
