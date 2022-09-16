package n1observer.n1observer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Broker broker = new Broker();
        Brokerage brokerage1 = new Brokerage("brokerage1", broker);
        Brokerage brokerage2 = new Brokerage("brokerage2", broker);
        Brokerage brokerage3 = new Brokerage("brokerage3", broker);
        Brokerage brokerage4 = new Brokerage("brokerage4", broker);
        Brokerage brokerage5 = new Brokerage("brokerage5", broker);
        
        broker.attachBrokerage(brokerage1);
        broker.attachBrokerage(brokerage2);
        broker.attachBrokerage(brokerage3);
        broker.attachBrokerage(brokerage4);
        broker.attachBrokerage(brokerage5);
        
        System.out.println("****Increasing stock****");
        System.out.println();
        broker.increaseStock();
        
        System.out.println();
        
        System.out.println("****Decreasing stock****");
        System.out.println();
        broker.decreaseStock();
    }
}
