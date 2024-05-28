package abstractfactory.delivery;


import abstractfactory.packages.bigbox.IBigBox;
import abstractfactory.packages.box.IBox;
import abstractfactory.packages.envelope.IEnvelope;

public interface DeliveryFactory {
    IEnvelope getEnvelopPackage();
    IBox getBoxPackage();
    IBigBox getBigBoxPackage();
}