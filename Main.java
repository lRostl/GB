package HW2Lessons;

import java.util.Arrays;

public class Main {

/**
    * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    * Конструктор класса должен заполнять эти поля при создании объекта;
    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    * Создать массив из 5 сотрудников
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
...
    persArray[4] = new Person(...);

    * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 **/

    public static void main(String[] args) {

/** Создание объектов **/

        Staffer[] staffArray = new Staffer[5];

        staffArray[0] = new Staffer("Константинов Максим Сергеевич", "Охранник",
                "k.Maks123S@mail.ru", "9991238789", 38000, 46);
        staffArray[1] = new Staffer("Киш Диана Радионовна", "HR",
                "kishD.R.@mail.ru", "9214568789", 41000, 24);
        staffArray[2] = new Staffer("Дикова Людмила Михайловна", "Бухгалтер",
                "dikLudaMih666@mail.ru", "9215641223", 50000, 41);
        staffArray[3] = new Staffer("Самохвалов Сергей Владимирович", "Системный администратор",
                "11SamoSergoVl11@mail.ru", "9811255446", 55000, 34);
        staffArray[4] = new Staffer("Руденко Иван Николаевич", "Менеджер",
                "ruDIvaNik21@mail.ru", "9817531253", 42000, 26);

        System.out.println("Вывод активных кадров: \n");
        staffArray[0].outputStaffer();
        staffArray[1].outputStaffer();
        staffArray[2].outputStaffer();
        staffArray[3].outputStaffer();
        staffArray[4].outputStaffer();


/** Цикл для фильтра сотрудников старше 40 **/

       for( int i = 0; i < staffArray.length; i++){
            if(staffArray[i].filterAge() > 40 ){
               System.out.println("*Cотрудник старше 40 лет: \n");
               staffArray[i].outputStaffer();
            }
        }
    }
}
