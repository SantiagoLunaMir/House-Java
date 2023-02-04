public class RestRoom {
    private int width;
    private int height;
    private String color;
    private boolean showerCabin;
    private int chairsCapacity;
    public void setShowerCabin(boolean showerCabin){
        this.showerCabin=showerCabin;
    }
    public boolean getShowerCabin(){
        return showerCabin;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
