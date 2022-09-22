public class Main {
    public static void main(String[] args)
    {
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerWeight = boxerOne + boxerTwo;
        System.out.println(boxerWeight);
        var boxerDifference =boxerTwo % boxerOne;
        System.out.println(boxerDifference);

        var timeAll =640;
        var timeOneWoker = 8;
        var allWokerInCompany = timeAll / timeOneWoker;
        System.out.println("Всего работников в компании - " + allWokerInCompany + " человек");

        var elseWokerInCompany = 94;
        var thenTimeAll = elseWokerInCompany * timeOneWoker;
        System.out.println("Если в компании работает " + elseWokerInCompany + " человек, то всего " + thenTimeAll + " часов работы может быть поделено между сотрудниками");
    }
}