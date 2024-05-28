package abstractfactory.packages.box;


import abstractfactory.packages.Packaging;

public class BoxForAir implements Packaging {
    @Override
    public void pack() {
        System.out.println("pack box which will be delivered by air");
    }
}
