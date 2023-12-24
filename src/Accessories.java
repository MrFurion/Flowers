import java.util.Scanner;

public class Accessories {
    private String name;
    private int cost;

    public Accessories() {
    }

    public Accessories(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Accessories getAccessories() {
        System.out.println("В наличии есть следующие аксессуары:" + "\n"
                + " - #1 Прозрачная упаковка + красная лента сумма 3 р" + "\n"
                + " - #2 Бумажная упаковка + нить сумма 2 р" + "\n"
                + " Если желаете выбрать аксессуар ведите номер, в противном случаи ведите 0");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Accessories b;
        if (line.equals("1")){
           b = new Accessories("1", 3);
        } else if (line.equals("2")) {
            b = new Accessories("1", 2);
        } else {
            b = new Accessories("0", 0);
        }
        return b;
    }
}
