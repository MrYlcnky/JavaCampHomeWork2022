import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Yapısal anlamda Sözlük: HashMap
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap"); //eklemek  sol taraf anahtardır sağ tarafı sol tarafa göre çağrılır
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman: " + item + " Değer: " + sozluk.get(item));

        }

        System.out.println(sozluk.size()); // eleman sayısı verir
        sozluk.remove("table"); // silmek için
        sozluk.clear(); // tamamen siler
        System.out.println(sozluk.get("table"));
    }
}
