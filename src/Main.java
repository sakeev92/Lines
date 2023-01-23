public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";           //— для хранения имени
        String middleName = "Ivanovich ";     //— для хранения отчества.
        String lastName = " Ivanov ";          // — для хранения фамилии.
        String fullName  = lastName + firstName + middleName;                   // — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        System.out.println("ФИО сотрудника —" + fullName);
    }
    public static void task2() {
        System.out.println("Задача 2");

        String fullName = "Ivanov Ivan Ivanovich";                   // — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        String fullName1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника —" + fullName1);


    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName);


    }
}
