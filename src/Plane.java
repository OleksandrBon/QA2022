public class Plane {

    public String flightId;
    public String flightDestination;
    public String [] passengers;

    public Plane (String f, int seatAmount){
        flightId = f;
        passengers = new String[seatAmount];
    }
    public void setFlightDestination(String destination){
        flightDestination = destination;
    }
    public void boardPassenger(String name, int seatNumber){
        if (passengers[seatNumber] != null){
            System.out.println("This place is not available");
            int freeSeat = getFreeSeat();
            if (freeSeat >=0 && freeSeat < passengers.length){
                passengers[freeSeat] = name;
            } else {
                System.out.println("This plane has no free seats");
            }
        }else {
            passengers[seatNumber] = name;
        }
    }
    public int getFreeSeat() {
        int freeSeat = -1;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null){
                freeSeat = i;
                break;
            }

        }
        return  freeSeat;
    }

}
