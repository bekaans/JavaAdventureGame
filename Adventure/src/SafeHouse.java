public class SafeHouse extends  NormalLocation{
    public SafeHouse(Player player){
        super("Güvenli Ev", player);


    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in safe house now , your health has been recovery");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Your Hp :"+this.getPlayer().getHealth());
        return true;
    }
}
