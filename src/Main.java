import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
/**
 1. В чем разница между абстрактным классом и интерфейсом в Java?
 2. Дайте краткую характеристику метода clone().
 3. Нужно ли проверять checked exception?
 4. Какие есть способы создания объекта String? Где он создается?
 **/
        try {
            // todo
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String str1 = new String("Hello!");
        String str2 = "Hello!!!!";


 /**  - Задача на лайв-кодинг
Напишите пример Enum.
 - Задача на лайв-кодинг
Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.
 **/


        List<String> list = new ArrayList<>();
        list.add("красный");
        list.add("оранжевый");
        list.add("желтый");
        list.add("зеленый");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i++));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}