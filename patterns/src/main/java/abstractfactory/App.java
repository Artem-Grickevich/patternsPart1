package abstractfactory;


import abstractfactory.delivery.DeliveryFactory;
import abstractfactory.packages.bigbox.IBigBox;
import abstractfactory.packages.box.IBox;
import abstractfactory.packages.envelope.IEnvelope;

public class App {

    private IEnvelope envelope;
    private IBox box;
    private IBigBox bigBox;

    public App(DeliveryFactory factory) {
        envelope = factory.getEnvelopPackage();
        box = factory.getBoxPackage();
        bigBox = factory.getBigBoxPackage();
    }

    public void pack() {
        envelope.pack();
        box.pack();
        bigBox.pack();
    }

}
