public class Main {
    public static void main(String[] args) {
        //ICustommerDal custommerDal =new OracleCustomerDal();
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());

        customerManager.add();
    }
}
