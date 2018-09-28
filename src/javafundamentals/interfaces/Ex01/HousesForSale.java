package javafundamentals.interfaces.Ex01;

class HousesForSale implements SalesMethods{
    @Override
    public void onlinePhotos() {
        System.out.println("House photos on zillow");
    }

    @Override
    public void signOnObject() {
        System.out.println("For sale sign in yard");
    }
}
