import java.util.Scanner;
public  class Player {
private Scanner input = new Scanner(System.in);
    //Player specialty//
    private int damage;
    private int health;
    private int coin;
    private String playerName;
    private String playerClass;
    private Envanter envanter;

    private int originalHealth;



    //Player Name constructor//
    public Player(String playerName)
    {
                //This is you
        this.playerName= playerName;
        this.envanter=new Envanter();
    }


        //Char Health,Damage and coin information methods//
    public void selectChar(){

        Warrior war = new Warrior();
        Archer arc = new Archer();
        Assassin asas = new Assassin();
        System.out.println("1 :"+war.getPlayerClass()+" ----Damage :"+war.getDamage()+" ----Health :"+war.getHealth()+" ----Coin = "+war.getCoin());
        System.out.println("2 :"+arc.getPlayerClass()+" ----Damage :"+arc.getDamage()+" ----Health :"+arc.getHealth()+" ----Coin = "+arc.getCoin());
        System.out.println("3 :"+asas.getPlayerClass()+" ----Damage :"+asas.getDamage()+" ----Health :"+asas.getHealth()+" ----Coin = "+asas.getCoin());

        int selectchar = input.nextInt();

        switch (selectchar) {

                        //Selecting Class Menu


            case 1:
                System.out.println("You will be a great Warrior " + playerName);

                this.setDamage(war.getDamage());
                this.setHealth(war.getHealth());
                this.setCoin(war.getCoin());
                this.setPlayerClass(war.getPlayerClass());
                this.setOriginalHealth(war.getHealth());
                break;
            case 2:
                System.out.println("You will be a great Archer " + playerName);
                this.setDamage(arc.getDamage());
                this.setHealth(arc.getHealth());
                this.setCoin(arc.getCoin());
                this.setPlayerClass(arc.getPlayerClass());
                this.setOriginalHealth(arc.getHealth());
                break;
            case 3:
                System.out.println("You will be a great Assassin " + playerName);
                this.setDamage(asas.getDamage());
                this.setHealth(asas.getHealth());
                this.setCoin(asas.getCoin());
                this.setPlayerClass(asas.getPlayerClass());
                this.setOriginalHealth(asas.getHealth());
                break;

                default:
                System.out.println("İnvaild Number");
        }
        System.out.println("Your Class : "+this.getPlayerClass()+"\nYour Damage : "+this.getDamage()+"\nYour Health : "+this.getHealth()+"\nYour Coin : "+this.getCoin()+"\nNow ... LETS BEGIN !!!!");
        }

public void selectLocation() {

        //Location Selecting Menu

    Location location = null;
    while (true){
    System.out.println("Where do you want to go ?");
    System.out.println("1-Safe House");
    System.out.println("2-Store(You can buy weapon or armor here)");
    System.out.println("3-Luferson Castle");
    System.out.println("4-Elmorad Castle");
    System.out.println("5-RonarkLand Base");
    System.out.println("Please select if you want to travel...");
    int select = input.nextInt();
    switch (select) {
        case 1:
            location =new SafeHouse(this);

            break;
        case 2 : location= new ToolStore(this);

            break;

        case 3:
            location = new LufersonCastle(this);
            break;
        case 4:
            location = new ElmoradCastle(this);
            break;
        case 5:
            location = new RonarkLandBase(this);
            break;

        default: location = new SafeHouse(this);

            break;
    }
        if (!location.onLocation()){
            System.out.println("Died...Game Over");
            break;
        }
}}
    //getter setter methods//


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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerClass(){
        return playerClass;
    }
    public void setPlayerClass(String playerClass){
        this.playerClass=playerClass;
    }

    public Envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(Envanter envanter) {
        this.envanter = envanter;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
