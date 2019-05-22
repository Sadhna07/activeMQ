import org.apache.activemq.broker.BrokerService;

public class EmbeddedBrokerService {

    public static void main(String[] args) throws Exception {
        BrokerService broker = new BrokerService();
        broker.setUseJmx(true);
        broker.addConnector("tcp://localhost:61616");
        broker.setPersistent(false);
        broker.start();
        System.out.println("Broker Started!!!");
        // now lets wait forever to avoid the JVM terminating immediately
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }
}