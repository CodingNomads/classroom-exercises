package classes;

class Animal{
    protected String specy;
    protected String gender;
    protected int age;

    public Animal(String specy, String gender, int age){
        this.specy = specy;
        this.gender = gender;
        this.age = age;
    }

    public String getSpecy() {
        return specy;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setSpecy(String specy) {
        this.specy = specy;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}