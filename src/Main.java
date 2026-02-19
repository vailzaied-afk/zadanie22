public class Main {
    public static void main(String[] args) {
        int a = 50000;
        byte b = 100;
        short c = 32000;
        long d = 3000000000L;
        float e = 3.33f;
        double f = 5.1212;
        System.out.println("Значение переменной a c типом int равно " + a + '\n' +
                "Значение переменной b c типом byte равно " + b + '\n' +
                "Значение переменной c c типом short равно " + c + '\n' +
                "Значение переменной d c типом long равно " + d + '\n' +
                "Значение переменной e c типом float равно " + e + '\n' +
                "Значение переменной f c типом double равно " + f + '\n'
        );

        float j = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short g = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.println("Это значение " + j + " имеет тип переменной float" + '\n' +
                "Это значение " + h + " имеет тип переменной long" + '\n' +
                "Это значение " + i + " имеет тип переменной float" + '\n' +
                "Это значение " + g + " имеет тип переменной short" + '\n' +
                "Это значение " + k + " имеет тип переменной short" + '\n' +
                "Это значение " + l + " имеет тип переменной short" + '\n' +
                "Это значение " + m + " имеет тип переменной byte" + '\n'
        );

        var a1 = 23;
        var a2 = 27;
        var a3 = 30;
        var quantityOfPaper = 480;
        var numberOfStudents = a1 + a2 + a3;
        var sheetsForEach = quantityOfPaper / numberOfStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги" + '\n'
        );

        byte minutes20 = 20;
        short day = 24*60;
        short threeDays = 3*24*60;
        int month = 24*60*30;
        byte machineOutputPerMinute = 16/2;
        int productivityIn20Minutes = machineOutputPerMinute * minutes20;
        int productivityPerDay = machineOutputPerMinute * day;
        int productivityInThreeDays = machineOutputPerMinute * threeDays;
        int productivityPerMonth = machineOutputPerMinute * month;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок" + '\n' +
                "За 1 день машина произвела " + productivityPerDay + " штук бутылок" + '\n' +
                "За 3 дня машина произвела " + productivityInThreeDays + " штук бутылок" + '\n' +
                "За 1 месяц машина произвела " + productivityPerMonth + " штук бутылок" + '\n'
        );

        byte white = 2;
        byte brown = 4;
        byte cabinet = (byte) (white + brown);
        byte quantity = (byte) (120 / cabinet);
        byte quantityWhite = (byte) (white * quantity);
        byte quantityBrown = (byte) (brown * quantity);
        System.out.println("В школе, где " + quantity + " классов, нужно " + quantityWhite + " банок белой краски и " +
                quantityBrown + " банок коричневой краски" + '\n'
        );

        short bananaWeight = 80;
        short milkWeight = 105;
        short weightOfIceCream = 100;
        short rawEggWeight = 70;
        short breakfastWeight = (short) (bananaWeight * 5 + milkWeight * 2 + weightOfIceCream * 2 + rawEggWeight *4);
        double weightOfBreakfastInKg = (double) breakfastWeight / 1000;
        System.out.println("Вес одного напитка  " + breakfastWeight + " в граммах " + "\n" +
                "Вес одного напитка " + weightOfBreakfastInKg + " в килограммах" + '\n');

        int totalWeight = 7 * 1000;
        int minWeight = 250;
        int maxWeight = 500;
        int maxDays = totalWeight / minWeight;
        int minDays = totalWeight / maxWeight;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему потребуется " + maxDays + " для похудения, " + '\n' +
                "а если каждый день будет худеть на 500 грамм, то " + minDays + " дней." + '\n');

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaSalary = (float) (masha * 1.1);
        float denisSalary = (float) (denis * 1.1);
        float kristinaSalary = (float) (kristina * 1.1);
        float mashaSalaryDifference = mashaSalary - masha;
        float denisSalaryDifference = denisSalary - denis;
        float kristinaSalaryDifference = kristinaSalary - kristina;
        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей" + '\n' +
                "Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей" + '\n' +
                "Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей"
        );
    }
}