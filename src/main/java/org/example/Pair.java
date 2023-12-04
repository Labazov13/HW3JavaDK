package org.example;
/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
а также переопределение метода toString(), возвращающее строковое представление пары*/
public class Pair <T, V>{
    T firstParametr;
    V secondParametr;

    public Pair(T firstParametr, V secondParametr) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
    }

    public T getFirst() {
        return firstParametr;
    }

    public V getSecond() {
        return secondParametr;
    }

    @Override
    public String toString() {
        return "Пара значений {" +
                "Первый параметр = " + firstParametr +
                ", второй параметр = " + secondParametr +
                '}';
    }

    public static void main(String[] args) {
        Pair <Integer, String> pair = new Pair<>(1, "Hi");
        int first = pair.getFirst();
        String second = pair.getSecond();
        System.out.println(pair.toString());
    }
}
