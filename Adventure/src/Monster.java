import java.util.Random;

public class Monster {
    private String name;
    private int damage;
    private  int health;
    private int maxMonsters;
    private int coin;
    public Monster(String name,int damage,int health,int coin){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.coin=coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getMaxMonsters() {
        return maxMonsters;
    }

    public void setMaxMonsters(int maxMonsters) {
        this.maxMonsters = maxMonsters;
    }

    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(3)+1;
    }
}
