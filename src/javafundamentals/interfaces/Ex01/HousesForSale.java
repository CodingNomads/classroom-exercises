package javafundamentals.interfaces.Ex01;

class HousesForSale implements SellableItem {
    @Override
    public void takePhotos() {
        System.out.println("House photos on zillow");
    }

    @Override
    public void putSignOnItem() {
        System.out.println("For sale sign in yard");
    }

    public void getHouseReady(){
        System.out.println("The house is clean and ready for the open house tomorrow!");
    }
}
