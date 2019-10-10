public class Room {
    private double yardage;
    private int temperature;
    private boolean airConditioner;

    public Room(double yardage, int temperature, boolean airConditioner) {
        this.yardage = yardage;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    int decreaseTemperature() {
        return temperature -1;
    }

    boolean haveAirConditioner() {
        return airConditioner;
    }

    public double getYardage() {
        return yardage;
    }

    public void setYardage(double yardage) {
        this.yardage = yardage;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
    boolean minTemperature (){
        return temperature > 19;
    }
}


