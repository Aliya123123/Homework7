public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int salary = 15_000;
        int totalMoney = 2_459_000;
        int total = 0;
        int month = 0;
        while (total <= totalMoney) {
            total += salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }


        System.out.println("task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("task 3");
        int year = 2010;
        long people = 12_000_000;
        int death = 8;
        int children = 17;
        for (; i < 10; i++) {
            year++;
            people += people / 1000 * (children - death);
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("task 4");
        int money = 15_000;
        int moneyMax = 12_000_000;
        int monthh = 0;
        while (money <= moneyMax) {
            money *= 1.07;
            monthh++;
            System.out.println("Месяц " + monthh + ", сумма накопления равна " + money);
        }
        System.out.println("task 5");
        money = 15_000;
        monthh = 0;
        while (money <= moneyMax) {
            money *= 1.07;
            monthh++;
            if (monthh % 6 == 0) {
                System.out.println("Месяц " + monthh + ", сумма накопления равна " + money);
            }
        }

        System.out.println("task 6");
        int moneyVasya = 15_000;
        int monthhVasya = 0;
        int term = 9 * 12;
        while (monthhVasya < term) {
            moneyVasya *= 1.07;
            monthhVasya++;
            if (monthhVasya % 6 == 0) {
                System.out.println("Месяц " + monthhVasya + ", сумма накопления равна " + moneyVasya);
            }
        }
        System.out.println("task 7");
        int friday = 5;
        int mo = 31;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        while (friday < mo);

        System.out.println("task 8");
        int yearr = 2024;
        int start = yearr - 200;
        int stop = yearr + 100;
        for (i = start; i <= stop; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }


    }
}