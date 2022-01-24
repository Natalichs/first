import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();
    private float weight = 0;


    //Добавление фрукта в коробку
    public void add(T obj){
        box.add(obj);
    }



    //Вес коробки
    public float getWeight(){
        for(T obj: box){
            weight += obj.getWeight();
        }
        return  weight;
    }

    //Сравнение коробок
    public boolean compare(Box b2){
        return (this.weight == b2.getWeight());
    }

    //Геттер для Arraylist
    public ArrayList<T> getBox() {
        return box;
    }

    // Пересыпаем содержимое из текущей коробки в заданную
    public void addBox(Box<T> b) {
        b.getBox().addAll(box);
        box.clear();
        weight = 0;
    }
}
