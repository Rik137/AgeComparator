## Booleans

## Задание 1
##### Цель

Научиться писать условные операторы и условия из нескольких выражений, объединённых булевыми операторами.

##### Что нужно сделать

В готовом проекте напишите код, который будет проверять, достаточно ли ингредиентов для приготовления того или иного блюда.

заданы шесть переменных с количествами разных ингредиентов.
- напишите в коде проекта условные операторы if так, чтобы они проверяли количество ингредиентов для каждого рецепта.
- Если ингредиентов достаточно для 
##### реализация
1. задаю переменные
~~~
        int milkAmount = 2000; // ml
        int powderAmount = 300; // g
        int eggsCount = 5; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items
~~~
2. пример работы
~~~
        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }
~~~
3. реализация проверки
~~~        
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Pancakes");
        }
        if(milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            // milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
        }
        if(appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");
        }
    }
}
