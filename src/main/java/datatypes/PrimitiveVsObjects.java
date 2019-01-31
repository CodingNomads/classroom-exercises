package datatypes;

public class PrimitiveVsObjects {

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        System.out.println("Variables by value, primitive types: ");
        System.out.println(number1);
        System.out.println(number2);

        number2 = number1;
        number2 = 3;

        System.out.println(number1);
        System.out.println(number2);

        System.out.println("-------------------------------------");

        House house1 = new House("house1");
        House house2 = new House("house2");

        System.out.println("Variables by reference, objects: ");
        System.out.println(house1.getName());
        System.out.println(house2.getName());

        house2 = house1;
        house2.setName("house3");

        System.out.println(house1.getName());
        System.out.println(house2.getName());
    }



    private static class House {
        private String name;

        public House(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
