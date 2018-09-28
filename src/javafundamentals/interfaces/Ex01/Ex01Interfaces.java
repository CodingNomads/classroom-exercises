package javafundamentals.interfaces.Ex01;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces {
    public static void main(String[] args) {
        HousesForSale littleCottage = new HousesForSale();
        CarsForSale miniVan = new CarsForSale();

        SellableItem[] salesItems = new SellableItem[2];
        salesItems[0]=littleCottage;
        salesItems[1]=miniVan;

        for (int i = 0; i < salesItems.length; i++) {
            salesItems[i].takePhotos();
            salesItems[i].putSignOnItem();
        }

        miniVan.getCarHistory();
        littleCottage.getHouseReady();

    }
}
