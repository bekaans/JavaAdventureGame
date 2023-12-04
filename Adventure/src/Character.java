public abstract class Character
{

    //User's Character Speciality//
    private String playerClass ;
    private int classid;
   private int damage;
    private int health;
    private int coin;
    private int originalHealth;

    public Character(int classid,String playerClass, int damage, int health,int coin,int originalHealth)
    {

        this.classid=classid;
        this.playerClass=playerClass;
        this.damage=damage;
        this.health=health;
        this.coin=coin;
        this.originalHealth=originalHealth;
    }
    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String name) {
        this.playerClass = name;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}

