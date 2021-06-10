public class Fan {
    private int Slow = 1;
    private int Medium =2;
    private  int Fast = 3;
    private int speed =1;
    private double radius =5;
    private String color = "blue";
    private boolean on = false;
    Fan(){
    }
    public int getSlow(){
        return Slow;
    }
    public int getMedium(){
        return Medium;
    }
    public int getFast(){
        return Fast;
    }
    public int getSpeed(){
        return speed;
    }
    public  double getRadius(){
        return radius;
    }
    public  String getColor(){
        return color;
    }
    public  boolean isOn(){
        return on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public  void setOn(boolean on){
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan( int speed , boolean on, String color, double radius ){
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString(){
        String state = " ";
        if(this.isOn()){
            state += "fan is on \n";
            state += "Speed : " + this.speed + "\n";
        } else {
            state += "fan is off \n";
        }
        state += "color : " + this.color + "\n";
        state += "radius : " + this.radius + "\n";
        return state;
    }
}
