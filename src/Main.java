public class Main {
    public static void leapYear(int year) {


        if ((year >= 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

            System.out.println(year + " год является високосным");
        } else {

            System.out.println(year + " год не является високосным");
        }

        if (year < 1584) {

            System.out.println("Нет возможности определить, явялется ли год високосным, так как опредилание високосного года появились в 1584 году");
        }
    }

    public static void clientDevice(int clientDeviceYear, int clientOS) {


        if (clientOS == 0 && clientDeviceYear >= 2024) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && clientDeviceYear < 2024) {

            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        if (clientOS == 1 && clientDeviceYear < 2024) {


            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientOS == 1 && clientDeviceYear >= 2024) {

            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static int distanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        leapYear(year);

        int clientDeviceYear = 2023;
        int clientOS = 1;
        clientDevice(clientDeviceYear, clientOS);

        int deliveryDistance = 50;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }
    }
}

