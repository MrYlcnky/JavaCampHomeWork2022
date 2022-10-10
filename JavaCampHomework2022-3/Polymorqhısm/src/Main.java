public class Main {
    public static void main(String[] args) {
        //polymorqhısm: çok biçimcilik
        /*
        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new DataBaseLogger(),new EmailLogger(),new Consolelogger()};
        for(BaseLogger logger:loggers){
            logger.Log("Log mesajı");
        */

        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
        customerManager.Add();

        }
    }

