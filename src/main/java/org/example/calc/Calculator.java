package org.example.calc;

/*Написать класс Калькулятор (необобщенный), который содержит обобщенные
статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.*/
public class Calculator {
    public static <T extends Number> void sum(T num1, T num2){
        if(num1 instanceof Integer){
            T result =  (T) Integer.valueOf(num1.intValue() + num2.intValue());
            System.out.println(result);
        }
        else if(num1 instanceof Double){
            T result =  (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
            System.out.println(result);
        }
    }
    public static <T extends Number> void divide(T num1, T num2){
        if(num1 instanceof Integer){
            T result =  (T) Integer.valueOf(num1.intValue() - num2.intValue());
            System.out.println(result);
        }
        else if(num1 instanceof Double){
            T result =  (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
            System.out.println(result);
        }
    }
    public static <T extends Number> void multiply(T num1, T num2){
        if(num1 instanceof Integer){
            T result =  (T) Integer.valueOf(num1.intValue() * num2.intValue());
            System.out.println(result);
        }
        else if(num1 instanceof Double){
            T result =  (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
            System.out.println(result);
        }
    }
    public static <T extends Number> void subtract(T num1, T num2){
        if(num1 instanceof Integer){
            T result =  (T) Integer.valueOf(num1.intValue() / num2.intValue());
            System.out.println(result);
        }
        else if(num1 instanceof Double){
            T result =  (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Double num1 = 4d;
        Integer num2 = 10;
        sum(num1, num2);
        divide(num1, num2);
        multiply(num1, num2);
        subtract(num1, num2);
    }
}


