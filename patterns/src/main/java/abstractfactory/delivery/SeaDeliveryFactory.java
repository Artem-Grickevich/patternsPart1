package abstractfactory.delivery;


import abstractfactory.packages.bigbox.BigBoxForSea;
import abstractfactory.packages.bigbox.IBigBox;
import abstractfactory.packages.box.BoxForSea;
import abstractfactory.packages.box.IBox;
import abstractfactory.packages.envelope.EnvelopeForSea;
import abstractfactory.packages.envelope.IEnvelope;

public class SeaDeliveryFactory implements DeliveryFactory {
    @Override
    public IEnvelope getEnvelopPackage() {
        return new EnvelopeForSea();
    }

    @Override
    public IBox getBoxPackage() {
        return new BoxForSea();
    }

    @Override
    public IBigBox getBigBoxPackage() {
        return new BigBoxForSea();
    }
}
