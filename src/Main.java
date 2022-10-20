public class Main {
    public static void main(String[] args) {
        var friend =19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=3.5*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);//Домашнее задание №2
        var boxerWeight1=78.2;
        System.out.println(boxerWeight1);
        var boxerWeight2=82.7;
        System.out.println(boxerWeight2);
        var totolWeight=boxerWeight1+boxerWeight2;
        System.out.println("Общий вес бойцов"+ totolWeight+"кг");
        var weightdifference=boxerWeight1-boxerWeight2;
        System.out.println("Разница между весами"+ weightdifference+"кг");
        var weightdifference2=boxerWeight2%boxerWeight1;
        System.out.println("Разница между весами с остатком" + weightdifference2 + "кг");//Задание 6,7
        var totalTime=640;
        System.out.println("Общее время" + totalTime +"часов");
        var timePerEmployee=8;
        System.out.println("Время одного сотрудника" + timePerEmployee + "часов");
        var totalEmployee=totalTime/timePerEmployee;
        System.out.println("Всего работников в компании" + totalEmployee + "человек");
        var moreEmployee=totalEmployee+94;
        System.out.println(" Работников больше" + moreEmployee + "человека");
        var lessTime=totalTime/moreEmployee;
        System.out.println("Если в компании работает человек" + moreEmployee + ", то всего" + lessTime + "часов работы может быть поделено между сотрудниками");
    }
}