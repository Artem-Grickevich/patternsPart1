package abstractfactory.packages.box;

public class BoxForSea implements IBox{
    @Override
    public void pack() {
        System.out.println("pack box which will be delivered by Sea");
    }
}
