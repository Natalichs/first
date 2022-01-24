public class Main {

    public static void main(String[] args) {

        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<Apple> box3 = new Box();
        Box<Orange> box4 = new Box();

        Apple a1 = new Apple();
        Orange or1 = new Orange();

        box2.add(or1);
        box1.add(a1);
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println(box2.getWeight()); //вес box2

        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        box2.addBox(box4); //пересыпали 2 коробку в 4
        box3.addBox(box1); //пересыпали 3 коробку в 1

        System.out.println(box1.getWeight());// вес box1
        System.out.println(box2.getWeight());// вес box2 после пересыпанию в box4 - должен быть 0
        System.out.println(box1.compare(box4)); //сравниваем вес коробки 1 и 4
    }
}
