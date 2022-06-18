import java.util.Arrays;

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
   //     String fullNameReplace = fullName.replace('ё','е');
    //    System.out.println("Данные ФИО сотрудника " + fullNameReplace);
        System.out.println(Arrays.toString(fullName.split(" ")));
        String[] a = fullName.split(" ");

        for( int i=0;i<a.length;i++ );{
            String newString = "";
            int i =0;
            for (int b = 0; b<a[i].length(); b++){
            if (a[i].charAt(b) =='е'){
                newString +='е';
            }
            else
                newString += a[i].charAt(b);
            }
            System.out.println(newString);

            }



    }
}