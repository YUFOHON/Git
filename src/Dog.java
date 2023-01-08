public class Dog {
    private int age;
    private int weight;

    public static void main(String[] args) {
        Dog Tom=new Dog();
        Tom.eat();

    }

    private void eat(){
        this.weight++;
        System.out.println(weight);
    }


    //todo
    private void sleep(){
        this.age++;
        System.out.println(age);
    }
}
