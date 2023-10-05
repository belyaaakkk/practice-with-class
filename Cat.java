public class Cat {
    private int age;
    private char[] name;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(char[] name) {
        this.name = name;
    }

    public Cat(int age, char[] name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }
}
