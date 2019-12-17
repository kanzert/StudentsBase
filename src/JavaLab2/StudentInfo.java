package JavaLab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Locale;

public class StudentInfo {
    private String surname;
    private String name;
    private Date dateOfBirth;
    private String phoneNumber;

    Address address;
    //public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void setSurname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Фамилия: ");
        while(this.surname == null) {
            String s = sc.nextLine();
            /*
            if (!isNumeric(s) && !s.trim().isEmpty()) {

                break;
            }*/

            if(s.matches("[\\p{IsCyrillic}]+")) {
                this.surname = s;
                break;
            }
            System.out.println("Что-то не так. Попробуйте еще раз.");
        }
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя: ");
        while(this.name == null) {
            String s = sc.nextLine();
            /*
            if (!isNumeric(s) && !s.trim().isEmpty()) {

                break;
            }*/

            if (s.matches("[\\p{IsCyrillic}]+")) {
                this.name = s;
                break;
            }
            System.out.println("Что-то не так. Попробуйте еще раз.");
        }
    }

    public void setDateOfBirth(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                System.out.println("Дата рождения(запись в виде 01.01.2000) : ");
                String dateString = sc.nextLine();

                this.dateOfBirth = dateFormat.parse(dateString);
                if(dateOfBirth != null)
                    break;

            } catch (Exception ex) {
                System.out.printf("Неправильный формат ввода даты. Попробуйте по примеру 01.01.2000");
            }
        }
    }


    public void setPhoneNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер мобильного телефона(10 цифр): ");
            String s = sc.nextLine();

            while (!(s.matches("[0-9]+") && s.length() == 10)) {
                System.out.println("Ошибка! Попытайтесь еще раз.");
                s = sc.nextLine();
            }
            this.phoneNumber = s;
        }

/*
    public static Address readAddress() throws IOException {

        System.out.printf("Enter Street: ");
        String street = reader.readLine();

        System.out.printf("Enter BuildingCode: ");
        int buildingCode = Integer.parseInt(reader.readLine());

        while (true) {
            try {
                System.out.printf("Enter RoomNum: ");
                int roomNum = Integer.parseInt(reader.readLine());

                address.BuildingCode = buildingCode;
                address.RoomNum = roomNum;
                address.Street = street;
                return address;

            } catch (Exception ex) {
                System.out.printf(ex.getMessage() + "\n");
            }
        }

    }
*/


public  void setAddress(){

        Scanner sc = new Scanner(System.in);
        address = new Address();
        System.out.println("Введите улицу: ");
        this.address.setStreet(sc.nextLine());
        System.out.println("Введите номер дома: ");
        this.address.setNumberBuilding(Integer.parseInt(sc.nextLine()));
        System.out.println("Введите номер квартиры: ");
        this.address.setNumberFlat(Integer.parseInt(sc.nextLine()));



}


    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }



    @Override
    public String toString()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Фамилия: " + this.surname + "\n" + "Имя: " + this.name + "\n" + "Номер телефона: " + this.phoneNumber +
                "\n" + "Дата рождения: " + dateFormat.format(this.dateOfBirth) + "\n" + "Адрес: " + this.address + "\n";
    }

}
