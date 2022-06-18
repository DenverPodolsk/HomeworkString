public class Main {
    public static void main(String[] args) {
       //  Задача 1
String firstName = "Ivan ";
String middleName = "Ivanovich ";
String lastName = "Ivanov ";
String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
// Задача 2
       String fullNameBig = fullName.toUpperCase() ;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+ fullNameBig);
        //Задача 3
        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника " + fullNameReplace);



    }
}