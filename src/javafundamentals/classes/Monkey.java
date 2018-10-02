package javafundamentals.classes;

public class Monkey {
    int age;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eatingABanana(BananaBasket bananaBasket){
        Banana banana1 = bananaBasket.getBanana();
        System.out.println(getName() + " is eating a " + banana1);
    }
}
