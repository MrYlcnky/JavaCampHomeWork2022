public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){   //Constructor
        this.logger=logger;

    }

    public void Add(){
        System.out.println("Müşteri eklendi");
        this.logger.Log("log Mesaji");

    }

}
