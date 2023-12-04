public class Envanter {
    private Weapon weapon;
    private Armor armor;

    // Envanter construction and getter-setter

    public Envanter(){
        this.weapon=new Weapon("Hand",1,0);
        this.armor=new Armor("No Rope",0,0);
    }

    public Weapon getEnvanter() {
        return weapon;
    }

    public void setEnvanter(Weapon envanter) {
        this.weapon = envanter;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
