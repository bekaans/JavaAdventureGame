public class Armor {
    String name ;
    int block;
    int coin;

    public Armor(String name,int block,int coin){
        this.name=name;
        this.block=block;
        this.coin=coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }public int getCoin(){
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
