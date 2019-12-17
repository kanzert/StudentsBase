package JavaLab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<StudentInfo> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        boolean flag = true;
        while(flag) {
            System.out.println("1.Создать запись");
            System.out.println("2.Вывод записей журнала");
            System.out.println("3.Выход");

            int option = scanner.nextInt();


            switch (option) {
                case 1:
                    StudentInfo student = new StudentInfo();
                    student.setSurname();
                    student.setName();
                    student.setPhoneNumber();
                    student.setDateOfBirth();
                    student.setAddress();
                    list.add(student);
                    break;
                case 2:
                    if(list.size() > 0) {
                        System.out.printf("Список имеет %d элементов \n", list.size());
                        for(StudentInfo person : list) {

                            System.out.println(person);
                        }
                    } else {
                        System.out.println("Список пуст");
                    }
                    break;
                case 3:
                    flag = false;

            }
        }







    }
}
