public class Weapon {
    String name;
    int damage ;
    int coin;

    public Weapon(String name,int damage,int coin){
        this.name=name;
        this.damage=damage;
        this.coin=coin;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getCoin(){
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
