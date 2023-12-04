import java.util.Scanner;

public class ToolStore extends NormalLocation{
    Scanner input = new Scanner(System.in);
    public ToolStore(Player player){
        super("Store", player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Store..");
        System.out.println("1-Weapon");
        System.out.println("2-Armor");
        System.out.println("3-Envanter");
        System.out.println("4-Exit");
        System.out.print("Your choose : ");
        int select = input.nextInt();

        while (select <1 || select >4){
            System.out.println("Invaild Number , please try again.");
            select = input.nextInt();
        }

        switch (select) {
            case 1:
                            //Weapon Menu
                System.out.println("This is weapon shop");
                System.out.println("What do you need ?");
                Weapon gun = new Weapon("Gun", 18, 15);
                System.out.println("1: " + gun.getName() + " Damage: " + gun.getDamage() + " Coin: " + gun.getCoin());
                Weapon sword = new Weapon("Sword", 22, 16);
                System.out.println("2: " + sword.getName() + " Damage: " + sword.getDamage() + " Coin: " + sword.getCoin());
                Weapon rifle = new Weapon("Rifle", 26, 25);
                System.out.println("3: " + rifle.getName() + " Damage: " + rifle.getDamage() + " Coin: " + rifle.getCoin());
                System.out.println("4:Exit here---");
                System.out.print("Plase choose :");
                int selectweapon = input.nextInt();
                switch (selectweapon) {
                    case 1:
                                        // if buy gun
                        if (getPlayer().getCoin() >= gun.getCoin()) {
                            System.out.println("You have a gun now ...");
                            int balance = getPlayer().getCoin() - gun.getCoin();
                            System.out.println("Your profit :" + balance);
                            this.getPlayer().setCoin(balance);
                            this.getPlayer().getEnvanter().setEnvanter(gun);
                            this.getPlayer().setDamage(gun.getDamage());
                            return onLocation();
                        }

                                        //if buy sword
                    case 2:
                        if (getPlayer().getCoin() >= sword.getCoin()) {
                            System.out.println("You have a sword now ...");
                            int balance = getPlayer().getCoin() - sword.getCoin();
                            this.getPlayer().setCoin(balance);
                            this.getPlayer().getEnvanter().setEnvanter(sword);
                            this.getPlayer().setDamage(sword.getDamage());
                            System.out.println("Your profit :" + balance);
                            return onLocation();

                        }
                                    //if buy rifle
                    case 3:
                        if (getPlayer().getCoin() >= rifle.getCoin()) {
                    System.out.println("You have a rifle now ...");
                    int balance = getPlayer().getCoin() - rifle.getCoin();
                    System.out.println("Your profit :" + balance);
                    this.getPlayer().setCoin(balance);
                            this.getPlayer().getEnvanter().setEnvanter(rifle);
                            this.getPlayer().setDamage(rifle.getDamage());

                           return onLocation();
                        }



                    default:return onLocation();
        }


        case 2:
                        // armor menu
                System.out.println("This is armor shop");
                Armor light = new Armor("Light",5,10);
                System.out.println("1-Light Armor");
                Armor middle = new Armor("Middle",8,12);
                System.out.println("2-Middle Armor");
                Armor heavy = new Armor("Heavy",12,22);
                System.out.println("3-Heavy Armor");
                int selectedarmor = input.nextInt();
                switch (selectedarmor){
                    case 1 :
                                        //if buy light armor
                        if (getPlayer().getCoin() >= light.getCoin()){
                            System.out.println("You have a light armor now...");
                            int balance = getPlayer().getCoin()-light.getCoin();
                            this.getPlayer().setCoin(balance);
                            this.getPlayer().getEnvanter().setArmor(light);
                            System.out.println("Now your profit :"+balance);
                            return onLocation();
                        }
                    case 2:
                                        //if buy middle armor
                        if (getPlayer().getCoin() >= middle.getCoin()){
                            System.out.println("You have a light armor now...");
                            int balance = getPlayer().getCoin()-middle.getCoin();
                            this.getPlayer().getEnvanter().setArmor(middle);
                            this.getPlayer().setCoin(balance);
                            System.out.println("Now your profit :"+balance);
                            return onLocation();
                        }
                    case 3:
                                        //if buy heavy armor
                        if (getPlayer().getCoin() >= heavy.getCoin()){
                            System.out.println("You have a Heavy armor now...");
                            int balance = getPlayer().getCoin()-heavy.getCoin();
                            this.getPlayer().getEnvanter().setArmor(heavy);
                            this.getPlayer().setCoin(balance);
                            System.out.println("Now your profit :"+balance);
                            return onLocation();



                }
                    default:
                        System.out.println("Invaild Number please try again");
                }
                                            //show envanter
            case 3:
                System.out.println("Your Weapon :"+getPlayer().getEnvanter().getEnvanter().getName());
                System.out.println("Damage :"+getPlayer().getEnvanter().getEnvanter().getDamage());
                System.out.println("Your Armor :"+getPlayer().getEnvanter().getArmor().getName());
                System.out.println("Your Block :"+getPlayer().getEnvanter().getArmor().getBlock());
                break;

            case 4:
                System.out.println("GoodBye friend");
                return true;
            default:
                System.out.println("Invaild Number please try again");
        }




      return true;}}