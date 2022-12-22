# AgeComparatoer

### Задание 2
##### Цель

Научиться писать условия из нескольких выражений и объединять их булевыми операторами.

##### Что нужно сделать

В новом проекте напишите программу, которая будет выводить заранее заданные возрасты трёх людей в порядке увеличения — от меньшего к большему.

##### реализация

1. задал три переменных возроста тре людей.
~~~
        int vasyaAge = 10;
        int katyaAge = 65;
        int mishaAge = 34;
~~~
2. задал еще три переменных диапазона возроста
~~~

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст
~~~
3. оргонизовал проверки: минимального возроста
~~~

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        } else if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }
~~~
среднего возроста
~~~
        if (vasyaAge > katyaAge && vasyaAge < mishaAge || vasyaAge > mishaAge && vasyaAge < katyaAge) {
            middle = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge < mishaAge || katyaAge > mishaAge && katyaAge < vasyaAge) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }
~~~
максимального возроста
~~~

        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
            ;
        } else {
            max = mishaAge;
        }
        System.out.println("min " + min + " age \n" + "middle " + middle + " age \n" + "max " + max + " age \n");
    }
}
~~~
