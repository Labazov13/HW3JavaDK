package org.example.array;

/*Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 если они одинаковые, и false в противном случае.
 Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа*/
public class CompareArray {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].getClass() == array2[i].getClass()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer [] ar1 = {5, 4, 8, 78, 9};
        Double [] ar2 = {7d, 9d, 0d, 8d, 11d};
        boolean b = compareArrays(ar1, ar2);
        System.out.println(b);
    }
}
