package abstractfactory.packages.envelope;

public class EnvelopeForRailroad implements IEnvelope {
    @Override
    public void pack() {
        System.out.println("pack envelope which will be delivered by Railroad");
    }
}
