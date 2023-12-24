import java.util.Random;

public class Flower {
    private String name;
    private int howOld;
    private int stemLength;

    private int cost;

    public Flower() {
    }

    public Flower(String name, int howOld, int stemLength, int cost) {
        this.name = name;
        this.howOld = howOld;
        this.stemLength = stemLength;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowOld() {
        return howOld;
    }

    public void setHowOld(int howOld) {
        this.howOld = howOld;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Flower  nexFlowers() {
        return new Flower();
    }

}
class Rose extends Flower{
    public Rose() {
    }

    public Rose(String name, int howOld, int stemLength, int cost) {
        super(name, howOld, stemLength, cost);
    }

    @Override
    public Rose nexFlowers() {
        //рандомим сколько дней цветку
        Random random = new Random();
        int countOld = random.nextInt(1,20)+1;
        //рандомим длоину стебля
        int countLength = random.nextInt(20,30)+1;

        String name = Flowers.ROSE.translation;
        int howOld = countOld;
        int stemLength = countLength;
        int cost = 5;
        return new Rose(name, howOld, stemLength, cost);
    }
}
class  Carnation extends Flower{
    public Carnation() {
    }

    public Carnation(String name, int howOld, int stemLength, int cost) {
        super(name, howOld, stemLength, cost);
    }
    @Override
    public Carnation nexFlowers() {
        //рандомим сколько дней цветку
        Random random = new Random();
        int countOld = random.nextInt(1,15)+1;
        //рандомим длоину стебля
        int countLength = random.nextInt(15,25)+1;

        String name = Flowers.CARNATION.translation;
        int howOld = countOld;
        int stemLength = countLength;
        int cost = 3;
        return new Carnation(name, howOld, stemLength, cost);
    }

}
class Lily extends Flower{
    public Lily() {
    }

    public Lily(String name, int howOld, int stemLength, int cost) {
        super(name, howOld, stemLength, cost);
    }
    @Override
    public Lily nexFlowers() {
        //рандомим сколько дней цветку
        Random random = new Random();
        int countOld = random.nextInt(2,18)+1;
        //рандомим длоину стебля
        int countLength = random.nextInt(15,25)+1;

        String name = Flowers.LILY.translation;
        int howOld = countOld;
        int stemLength = countLength;
        int cost = 4;
        return new Lily(name, howOld, stemLength, cost);
    }
}
class Chamomile extends Flower{
    public Chamomile() {
    }

    public Chamomile(String name, int howOld, int stemLength, int cost) {
        super(name, howOld, stemLength, cost);
    }
    @Override
    public Chamomile nexFlowers() {
        //рандомим сколько дней цветку
        Random random = new Random();
        int countOld = random.nextInt(1,10)+1;
        //рандомим длоину стебля
        int countLength = random.nextInt(10,20)+1;

        String name = Flowers.CHAMOMILE.translation;
        int howOld = countOld;
        int stemLength = countLength;
        int cost = 4;
        return new Chamomile(name, howOld, stemLength, cost);
    }
}
