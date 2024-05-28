package abstractfactory.packages.bigbox;

public class BigBoxForSea implements IBigBox {

    @Override
    public void pack() {
        System.out.println("pack big box which will be delivered by sea");
    }
}
