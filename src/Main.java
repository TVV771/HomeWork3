public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int PostOffice = 40000;
        System.out.println(PostOffice);
        byte OpticalScanner = 44;
        System.out.println(OpticalScanner);
        short TouchPad = 75;
        System.out.println(TouchPad);
        long DocumentCompartment = 256000;
        System.out.println(DocumentCompartment);
        float HairShaft = 2.7f;
        System.out.println(HairShaft);
        double PythonWeight = 10.9;
        System.out.println(PythonWeight);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        double PostOffice =  27.12;
        System.out.println(PostOffice);
        long OpticalScanner = 987678965549L;
        System.out.println(OpticalScanner);
        double TouchPad = 2.786;
        System.out.println(TouchPad);
        short DocumentCompartment = 569;
        System.out.println(DocumentCompartment);
        short HairShaft = -159;
        System.out.println(HairShaft);
        double PythonWeight = 27897;
        System.out.println(PythonWeight);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short LudmilaPavlovna = 23;
        short AnnaSergeevna = 27;
        short EkaterinaAndreevna =30;
        int SumOfStudents = LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        short GeneralPaper = 480;
        int PaperChildren = GeneralPaper / SumOfStudents;
        System.out.println("На каждого ученика рассчитано " + PaperChildren + " листов бумаги");


    }
    public static void task4 () {
        System.out.println("Задача 4");
        short Bottle2Min = 16;
        int Bottle1Min = Bottle2Min / 2;
        int Bottle20Min = Bottle1Min * 20;
        int Bottle1H = Bottle1Min * 60;
        int Bottle1Day = Bottle1H * 24;
        int Bottle3Day = Bottle1Day * 3;
        long Bottle1M = Bottle1Day * 30;
        System.out.println("За 20 мин машина произвела " + Bottle20Min + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + Bottle1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + Bottle3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + Bottle1M + " штук бутылок");




    }
    public static void task5 () {
        System.out.println("Задача 5");
        short Color = 120;
        short WhiteColor = 2;
        short BrownColor = 4;
        int Class1Color = WhiteColor + BrownColor;
        int SchoolClass = Color / Class1Color;
        int WhiteTotalColor = SchoolClass * WhiteColor;
        int BrownTotalColor = SchoolClass * BrownColor;
        System.out.println("В школе, гдe " + SchoolClass + " классов, нужно " + WhiteTotalColor + " банок белой краски и " + BrownTotalColor + " банок коричневой краски.");






    }
    public static void task6 () {
        System.out.println("Задача 6");
        int Banana = 5;
        short BananaWeight = 80;
        int Milk = 200;
        short MilkWeight =105;
        int IceCream = 2;
        short IceCreamWeight = 100;
        int Eggs = 4;
        short EggsWeight = 70;
        float ToMixTotal = (Banana* BananaWeight) + (Milk * MilkWeight) + (IceCream * IceCreamWeight) + (Eggs * EggsWeight);
        System.out.println( ToMixTotal + " количество граммов спортзавтрака" );
        float TransferKG = ToMixTotal / 1000;
        System.out.println( TransferKG + " количество килограмм в спортзавтраке");







    }
    public static void task7 () {
        System.out.println("Задача 7");
        int WeightDownKg = 7;
        short Weight250Gram = 250;
        short Weight500Gram = 500;
        int WeightDownGram = WeightDownKg * 1000;
        int WeightGram250 = WeightDownGram / Weight250Gram;
        int WeightGram500 = WeightDownGram / Weight500Gram;
        System.out.println( WeightGram250 + " дней если 250 " + WeightGram500 + " дней если 500 ");







    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaMoneyMount = 67760;
        int DenisMoneyMount = 83690;
        int KristinaMoneyMount = 76230;
                int MashaBonus = MashaMoneyMount * 10 /100;
                int DenisBonus = DenisMoneyMount * 10 /100;
                int KristinaBonus = KristinaMoneyMount * 10 /100 ;
                    int MashaNewMoney = MashaMoneyMount + MashaBonus;
                    int DenisNewMoney = DenisMoneyMount + DenisBonus;
                    int KristinaNewMoney = KristinaMoneyMount + KristinaBonus;
                        int MashaYearNotBonus = MashaMoneyMount * 12;
                        int DenisYearNotBonus = DenisMoneyMount * 12;
                        int KristinaYerNotBonus = KristinaMoneyMount * 12;
                            int MashaYearBonus = MashaNewMoney * 12;
                            int DenisYearBonus = DenisNewMoney * 12;
                            int KristinaYerBonus = KristinaNewMoney * 12;
        int differenceMasha = MashaYearBonus - MashaYearNotBonus;
        int differenceDenis = DenisYearNotBonus - DenisYearBonus;
        int differenceKristina = KristinaYerNotBonus - KristinaYerBonus;
        System.out.println("Маша теперь получает " + MashaNewMoney + " рублей. Годовой доход вырос на " + MashaBonus + " рублей");
        System.out.println("Денис теперь получает " + DenisNewMoney + " рублей. Годовой доход вырос на " + DenisBonus + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNewMoney + " рублей. Годовой доход вырос на " + KristinaBonus + " рублей");














    }
}