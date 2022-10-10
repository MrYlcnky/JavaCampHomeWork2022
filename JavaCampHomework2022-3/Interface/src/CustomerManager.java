public class CustomerManager {

    private ICustommerDal custommerDal;
    public CustomerManager(ICustommerDal custommerDal){
        this.custommerDal=custommerDal;
    }

    public void add(){
        //iş kodları yazılır
        custommerDal.Add();
    }
}
