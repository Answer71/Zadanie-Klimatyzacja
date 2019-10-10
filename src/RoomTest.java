public class RoomTest {
    public static void main(String[] args) {

        Room room1 = new Room(56.4, 17,true);


        if (room1.haveAirConditioner() == true && room1.minTemperature() == true) {
            room1.decreaseTemperature();
            System.out.println(room1.decreaseTemperature());
        }
            else if (room1.haveAirConditioner() == false || room1.minTemperature() == false ) {
            System.out.println("Brak klimatyzacji lub za niska temperatura");

            }

        }



    }

