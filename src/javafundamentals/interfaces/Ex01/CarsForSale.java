package javafundamentals.interfaces.Ex01;

public class CarsForSale implements SalesMethods{
    @Override
    public void onlinePhotos() {
        System.out.println("Car photos on craigslist");
    }

    @Override
    public void signOnObject() {
        System.out.println("Price written on car window");
    }
}
