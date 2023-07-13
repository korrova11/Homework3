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

    public static void task1() {
        System.out.println("Задача 1");
        int a = 33800;
        byte b = 15;
        short c = -15000;
        long d = 7000000876l;
        float e = 1.5f;
        double f = 75.37814908767786d;
        System.out.println("Значение переменной a c типом int равно " +a+ ".");
        System.out.println("Значение переменной b с типом byte равно "+b+".");
        System.out.println("Значение переменной с с типом short равно "+c+".");
        System.out.println("Значение переменной d с типом long равно "+d+".");
        System.out.println("Значение переменной e с типом float равно "+e+".");
        System.out.println("Значение переменной f с типом double равно "+f+".");

    }
    public static void task2() {
        System.out.println("Задача 2");
        float a;
        long b;
        float c;
        short d;
        short e;
        short f;
        byte g;
        a=27.12f;
        b=987678965549l;
        c=2.786f;
        d=569;
        e=-159;
        f=27897;
        g=67;
        System.out.println("Значение переменной a с типом float равно "+a+".");
        System.out.println("Значение переменной b с типом long равно "+b+".");
        System.out.println("Значение переменной c с типом float равно "+c+".");
        System.out.println("Значение переменной d с типом short равно "+d+".");
        System.out.println("Значение переменной e с типом short равно "+e+".");
        System.out.println("Значение переменной f с типом short равно "+f+".");
        System.out.println("Значение переменной g с типом byte равно "+g+".");


    }
    public static void task3() {
        System.out.println("Задача 3");
        int lp=23;
        int as=27;
        int ea=30;
        short allList=480;
        float list=allList/(lp+as+ea);
        System.out.println("На каждого ученика рассчитано "+list+" листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte jm1=8;
        int jm20=jm1*20;
        int jmDay=24*60*jm1;
        int jmDay3=3*24*60*jm1;
        int jmMouth=30*24*60*jm1;
        System.out.println("За 20 минут машина произвела "+jm20+" штук бутылок.");
        System.out.println("За сутки машина произвела "+jmDay+" штук бутылок.");
        System.out.println("За три дня машина произвела "+jmDay3+" штук бутылок.");
        System.out.println("За 1 месяц машина произвела "+jmMouth+" штук бутылок.");


    }
    public static void task5() {
        System.out.println("Задача 5");
        int cl=120/(2+4);
        int white=2*cl;
        int brown=4*cl;
        System.out.println("В школе, где "+cl+" классов, нужно "+white+" банок белой краски и "+brown+" банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte mBanan=80;
        byte mMilk=105;
        byte mIce=100;
        byte mEgg=70;
        float mBrGr=5*mBanan+2*mMilk+2*mIce+4*mEgg;
        float mBrK=mBrGr/1000;
        System.out.println("Завтрак спортсмена составляет "+mBrGr+" грамм, иначе "+mBrK+" килограмм.");

   }
   public static void task7() {
        System.out.println("Задача 7");
        float min=7000/250;
        float max=7000/500;
        float middle=(min+max)/2;
        System.out.println("Если спортсмен будет терять в весе каждый день 250 грамм, то на это уйдет "+ min+" дней, если 500 грамм, то "+max+" дней. В среднем спортсмену может потребоваться "+middle+" дней.");

   }
   public static void task8() {
        System.out.println("Задача 8");
        int masha=67760;
        int denis=83690;
        int cris=76230;
        int openMasha=masha/10;
        int openDenis=denis/10;
        int openCris=cris/10;
        float nm=masha+openMasha;
        float nd=denis+openDenis;
        float nc=cris+openCris;
        float deltaM=(nm-masha)*12;
        float deltaD=(nd-denis)*12;
        float deltaC=(nc-cris)*12;
        System.out.println("Маша теперь получает "+nm+" рублей. Годовой доход вырос на "+deltaM+" рублей.");
        System.out.println("Денис теперь получает "+nd+" рублей. годовой доход вырос на "+deltaD+" рублей.");
        System.out.println("Кристина теперь получает"+nc+" рублей. годовой доход вырос на "+deltaC+" рублей.");

   }}
