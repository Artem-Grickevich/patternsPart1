package abstractfactory.delivery;


import abstractfactory.packages.bigbox.BigBoxForRailroad;
import abstractfactory.packages.bigbox.IBigBox;
import abstractfactory.packages.box.BoxForRailroad;
import abstractfactory.packages.box.IBox;
import abstractfactory.packages.envelope.EnvelopeForRailroad;
import abstractfactory.packages.envelope.IEnvelope;

public class RailroadDeliveryFactory implements DeliveryFactory {
    @Override
    public IEnvelope getEnvelopPackage() {
        return new EnvelopeForRailroad();
    }

    @Override
    public IBox getBoxPackage() {
        return new BoxForRailroad();
    }

    @Override
    public IBigBox getBigBoxPackage() {
        return new BigBoxForRailroad();
    }
}
