public class Main {
    public static void main(String[] args) {
        System.out.println("задача1");
        System.out.println("Было");
        double dog = 8;
        System.out.println("Собаки: " + dog);
        var cat = 3.6;
        System.out.println("Cat: " + cat);
        var paper = 763789;
        System.out.println("paper: " + paper);
        System.out.println("1 действие:");
        dog = dog + 4;
        System.out.println("Собаки: " + dog);
        cat = cat + 4;
        System.out.println("Cat: " + cat);
        paper = paper + 4;
        System.out.println("paper: " + paper);
        System.out.println("2 действие ");
        dog = dog - 3.5;
        System.out.println("Собаки: " + dog);
        cat = cat - 1.6;
        System.out.println("Cat: " + cat);
        paper = paper - 7639;
        System.out.println("paper: " + paper);
        System.out.println("Задача2");

        var friend = 19;
        System.out.println("Кол-во друзей : " + friend);
        friend = friend + 2;
        System.out.println("Кол-во друзей :(1действин) " + friend);
        friend = friend / 7;
        System.out.println("Кол-во друзей :(2действие) " + friend);
        System.out.println("задача3");

        var frog = 3.5;
        System.out.println("Лягушки : " + frog);
        frog = frog * 10;
        System.out.println("Лягушки (1) : " + frog);
        frog = frog / 3.5;
        System.out.println("Лягушки (2) : " + frog);
        frog = frog + 4;
        System.out.println("Лягушки (3) : " + frog);
        System.out.println("задача4");
        var boxerwight1 = 78.2;
        System.out.println("Вес первого боксера " + boxerwight1 + "kg");
        var boxerwight2 = 82.7;
        System.out.println("Вес второго боксера " + boxerwight2 + "kg");
        var wighttogthere = boxerwight2 + boxerwight1;
        System.out.println("Общий вес боксеров :" + wighttogthere + "kg");
        var differencewight = boxerwight2 - boxerwight1;
        System.out.println("Разница веса боксеров :" + differencewight + "kg");
        differencewight = wighttogthere % boxerwight1;
        System.out.println("Разница весса боксеров :" + differencewight + "kg");
        System.out.println("задача5");
        var totalTime = 640;
        System.out.println("Общее время работы " + totalTime);
        var peopelsWorksTime = 8;
        System.out.println("Время работы одного челвоека " + peopelsWorksTime);
        var allpeople = totalTime / peopelsWorksTime;
        System.out.println("Всего работников в компании – " + allpeople + " человек");
        allpeople += 94;
        totalTime = allpeople * peopelsWorksTime;
        System.out.println("Если в компании работает " + allpeople + " человек, то всего  " + totalTime + " часов работы может быть поделено между сотрудниками");

    }
}