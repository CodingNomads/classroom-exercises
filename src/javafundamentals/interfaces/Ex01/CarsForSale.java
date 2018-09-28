package javafundamentals.interfaces.Ex01;

public class CarsForSale implements SellableItem {
    @Override
    public void takePhotos() {
        System.out.println("Car photos on craigslist");
    }

    @Override
    public void putSignOnItem() {
        System.out.println("Price written on car window");
    }

    public void getCarHistory(){
        System.out.println("This car has never been in an accident!");
    }
}
