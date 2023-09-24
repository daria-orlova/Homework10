public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для отчета — " + upperFullName);
        System.out.println();

        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("ФИО сотрудника — " + fullName1.replace("ë", "e"));
    }
}