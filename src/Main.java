public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }


        System.out.println("task 2");
        int N = 0;
        while (N < 10){
            N++;
            System.out.print(N + " ");
        }
        System.out.println ();
        int i = 10;
        for (; i > 0; i--){
            System.out.print(i + " ");
        }


        System.out.println ("task 3");
        int yer = 2010;
        long people = 12_000_000;
        int death = 8;
        int children = 17;
        for (; i < 10; i++){
            yer++;
            people += people / 1000 * (children - death);
            System.out.println("Год " + yer + ", численность населения составляет " + people);
        }

        System.out.println ("task 4");
        int money = 15_000;
        int monthh = 0;
        while (money <= 12_000_000) {
            money *= 1.07;
            monthh++;
            System.out.println("Месяц " + monthh + ", сумма накопления равна " + money);
        }
        System.out.println ("task 5");
        int Money = 15_000;
        int Monthh = 0;
        while (Money <= 12_000_000) {
            Money *= 1.07;
            Monthh++;
            if (Monthh % 6 == 0){
                System.out.println("Месяц " + Monthh + ", сумма накопления равна " + Money);
            }
        }

        System.out.println ("task 6");
        int MoneyVasya = 15_000;
        int MonthhVasya = 0;
        int term = 9*12;
        while (MonthhVasya<= term) {
            MoneyVasya *= 1.07;
            MonthhVasya++;
            if (MonthhVasya % 6 == 0){
                System.out.println("Месяц " + MonthhVasya + ", сумма накопления равна " + MoneyVasya);
            }
        }
        System.out.println ("task 7");
        int Friday = 5;
        int mo = 31;
        do {System.out.println ("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет");
            Friday += 7;
        }
        while (Friday < mo);

        System.out.println ("task 8");
        int Year = 2024;
        int start = Year - 200;
        int stop = Year + 100;
        for (i = start; i <= stop; i++){
            if (i % 79 ==0){
                System.out.println(i);
            }
        }
















    }
}