import java.util.Scanner;

public abstract class BattleLocation extends Location {
    Scanner input = new Scanner(System.in);
    private Monster monster;
    private String award;
    private String name;
    private int maxMonster;

    public BattleLocation(Player player,String name,Monster monster,String award,int maxMonster){
        super(player,name);
        this.monster=monster;
        this.award=award;
        this.name=name;
        this.maxMonster=maxMonster;

    }

    @Override
    public boolean onLocation() {
        int maks =this.getMonster().randomMonsterNumber();
        System.out.println("You are in "+this.getName());
        System.out.println("Be careful "+ maks+" "+this.getMonster().getName()+" is living here...");

        while (getPlayer().getHealth() >0 && getMonster().getHealth() >0){

            System.out.println("[F]ight or [R]un");
            String choose = input.nextLine();
            choose=choose.toUpperCase();
            for (int i =0;i<=maks;i++){
                if (choose.equals("F")){


                    System.out.println("The Fight is begin . Be careful");
                    combat();
                    if (this.getMonster().getHealth()==0){
                        System.out.println("Your Award "+this.getAward());
                        System.out.println("------------------------------------");
                        this.getPlayer().setCoin(getPlayer().getCoin()+this.getMonster().getCoin());
                        System.out.println("Your coin :"+this.getPlayer().getCoin());

                    }if (this.getPlayer().getHealth()<=0){
                        return false;
                    }
            }

            }  if (choose.equals("R")) {
                System.out.println("We need to run");

                run();
                break;
            }
        }

        return true;}

    public boolean combat(){
        System.out.println("-------------------------------------");
        System.out.println("Hit "+this.getPlayer().getDamage());
        monsterNewHealth();
        System.out.println("-----------------------------------------------");
        System.out.println("Taken Damage "+this.getMonster().getDamage());
        playerNewHealth();
        System.out.println("--------------------------------------------------");

        return true;
    }
    public void run(){

        System.out.println("Your hp :"+this.getPlayer().getHealth());

    }
    public void monsterNewHealth(){
        this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getDamage());
        if (this.getMonster().getHealth()<0){this.getMonster().setHealth(0);}

        System.out.println("Monster Health :"+this.getMonster().getHealth());
    }
    public void playerNewHealth(){
        this.getPlayer().setHealth(this.getPlayer().getHealth()-this.getMonster().getDamage());
        if (this.getPlayer().getHealth()<0){this.getPlayer().setHealth(0);}
        System.out.println("Your Health "+this.getPlayer().getHealth());

    }
    public Monster getMonster() {
        return monster;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }public String getAward(){
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
