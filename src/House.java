
public class House {
    private Kitchen kitchen;
    private  LivingRoom livingroom;
    public static final int MAX_BED_ROOMS=10;
    public static final int MAX_REST_ROOMS=10;
    private BedRoom[] bedRooms=new BedRoom[MAX_BED_ROOMS];
    private RestRoom[] restRooms=new RestRoom[MAX_REST_ROOMS];
    private Yard yard;
    private int i=0;
    private int j=0;
    public void addRoom(BedRoom bedRoom,int i){
       if(bedRooms.length <= MAX_BED_ROOMS){
           bedRooms[i]=bedRoom;
           i++;
       }
    }
    public void addRoom(RestRoom restRoom,int j){
        if(restRooms.length<=MAX_REST_ROOMS){
            restRooms[j]=restRoom;
            j++;
        }
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public void setKitchen(LivingRoom livingroom) {
        this.livingroom = livingroom;
    }
    public LivingRoom getLivingroom() {
        return livingroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }
    public Yard setYard() {
        return yard;
    }
}
