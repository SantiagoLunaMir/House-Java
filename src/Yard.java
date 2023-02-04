public class Yard {
    //private BedSize bedSize;
    private boolean grass;
    private int width;
    private int height;
    private String color;

    /*
    public void setBedSize(boolean bedSize){
        this.bedSize=bedSize;
    }
    public BedSize getBedSize(){
        return bedSize;
    }
    */

    public void setGrass(boolean grass) {
        this.grass = grass;
    }

    public boolean getGrass() {
        return grass;
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
