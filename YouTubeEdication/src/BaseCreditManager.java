import java.sql.SQLOutput;

public abstract class BaseCreditManager implements ICreditManager {
    public abstract void calculate();
    {
        System.out.println("*** Abstract Hesaplama ***");
    }
    public void save(){

        System.out.println("Kaydedildi.");
    }
}
