public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадание 2");

        String fullNameReport = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameReport);

        System.out.println("\nЗадание 3");

        String fullNameNew = "Иванов Семён Семёнович";
        fullNameNew = fullNameNew.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameNew);


    }
}