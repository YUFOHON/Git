public class Cat {
    private int age;
    private int weight;

    public static void main(String[] args) {
        Cat ragdoll=new Cat();
        ragdoll.eat();

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
