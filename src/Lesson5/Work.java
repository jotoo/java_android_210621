package Lesson5;

public class Work {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov I. I.", "worker", "123@yandex.ru", 1234, 50000, 40);
        System.out.println(employee);
        Employee employee1 = new Employee("Petrov P.P.", "worker", "4321@yandex.ru", 4321, 40000, 41);
        System.out.println(employee);
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("1", "worker", "1234", 15678, 30000, 35);
        staff[1] = new Employee("2", "worker", "12345", 25678, 30000, 55);
        staff[2] = new Employee("3", "worker", "12367", 35678, 30000, 55);
        staff[3] = new Employee("4", "worker", "12389", 45678, 30000, 25);
        staff[4] = new Employee("5", "worker", "123000", 55678, 30000, 65);
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() > 40) {
                System.out.println(staff[i]);
            }
        }

    }
}
