public  class NormalLocation extends Location{
    public NormalLocation(String name,Player player){
        super(player,name);
    }


    @Override
   public boolean onLocation() {
        return true;
    }
}
