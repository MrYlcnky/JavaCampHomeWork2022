
public class CustomerManager {
    private ICreditManager icreditManager;
    private Customer customer;
    public CustomerManager(Customer customer,ICreditManager icreditManager) {
        this.customer=customer;
        this.icreditManager=icreditManager;
    }

    public void giveCredit(){

        icreditManager.calculate();
        System.out.println("Kredi verildi");

        icreditManager.save();

    }
    public  void save()
    {
        System.out.println("Müşteri kaydedildi.");
    }
}
