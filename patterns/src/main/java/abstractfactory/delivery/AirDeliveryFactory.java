package abstractfactory.delivery;


import abstractfactory.packages.bigbox.BigBoxForSea;
import abstractfactory.packages.bigbox.IBigBox;
import abstractfactory.packages.box.BoxForSea;
import abstractfactory.packages.box.IBox;
import abstractfactory.packages.envelope.EnvelopeForAir;
import abstractfactory.packages.envelope.IEnvelope;

public class AirDeliveryFactory implements DeliveryFactory{

    @Override
    public IEnvelope getEnvelopPackage() {
        return new EnvelopeForAir();
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
