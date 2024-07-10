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

    public static void distance(int deliveryDistance) {

        if (deliveryDistance <= 20) {

            System.out.println("Потребуется дней: 1");
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {

            System.out.println("Потребуется дней: 2");
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {

            System.out.println("Потребуется дней: 3");
        }

        if (deliveryDistance > 100) {

            System.out.println("Нет доставки");
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        leapYear(year);

        int clientDeviceYear = 2023;
        int clientOS = 1;
        clientDevice(clientDeviceYear, clientOS);

        int deliveryDistance = 95;
        distance(deliveryDistance);
    }
}
