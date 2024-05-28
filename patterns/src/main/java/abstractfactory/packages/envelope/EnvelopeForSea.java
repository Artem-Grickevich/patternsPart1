package abstractfactory.packages.envelope;

public class EnvelopeForSea implements IEnvelope {
    @Override
    public void pack() {
        System.out.println("pack envelope which will be delivered by sea");
    }
}