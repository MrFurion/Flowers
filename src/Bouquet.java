import java.util.*;

public class Bouquet {
    public static List<Flower> list = new ArrayList<>();
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.makeBouquet();
        bouquet.sumBouquet();
        bouquet.sortBouquet();
        bouquet.lengthFlower();
    }
    public void makeBouquet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Цветы в наличии:" + "\n" +
                " " + "№1 " + Flowers.CARNATION.translation +
                " " + "№2 " + Flowers.LILY.translation +
                " " + "№3 " + Flowers.CHAMOMILE.translation +
                " " + "№4 " + Flowers.ROSE.translation);
        System.out.println("Введите номер цветка или 0 если вы закончили");

        String line;
        while (!(line = scanner.nextLine()).equals("0")){
            if(line.equals("1")){
                Flower flower = new Carnation().nexFlowers();
                list.add(flower);
            } else if (line.equals("2")) {
                Flower flower = new Lily().nexFlowers();
                list.add(flower);
            } else if (line.equals("3")) {
                Flower flower = new Chamomile().nexFlowers();
                list.add(flower);
            } else if (line.equals("4")) {
                Flower flower = new Rose().nexFlowers();
                list.add(flower);
            }
        }
//        scanner.close();
    }
    public void sumBouquet(){
        Accessories accessories = new Accessories().getAccessories();
        System.out.println(accessories.getCost());

        int countSum = 0;
        for (Flower f:list) {
            countSum = countSum + f.getCost();
        }
        countSum = countSum + accessories.getCost();
        System.out.println("Цена вещего букета составляет: " + countSum + " p");
    }
    public void sortBouquet(){
        list.sort(Comparator.comparingInt(Flower::getHowOld));
        for (Flower s:list) {
            System.out.println(s.getName() + " " + s.getHowOld() + " Дней(я) после среза цветка;");
        }
    }
    public void lengthFlower() {
        System.out.println();
        System.out.println("Если желаете найти цветок по длине стебля в букете, в ведите go ,\n" +
                " в противном случи ведите exit.");
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line = scanner.nextLine()).equals("exit")) {
            if (line.equals("go")) {
                System.out.println("в ведите целое число от 10 до 30");
                int min = scanner.nextInt();
                int max = scanner.nextInt();
                for (Flower s : list) {
                    if (s.getStemLength() >= min && s.getStemLength() <= max) {
                        System.out.println(s.getName());
                    }else {
                        System.out.println("Этот цветок " + s.getName() + " длиннее " + max + " cm");
                    }
                }
            }
        }
    }

}
