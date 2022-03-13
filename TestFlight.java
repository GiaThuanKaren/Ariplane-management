package ThiHK1;
import java.util.*;
import java.io.*;

public class TestFlight {
    public static void main(String[] args) throws IOException {
        RWFile rwFile = new RWFile();
        String pathFlight = "..\\Source\\flight.txt";
        String pathWrite = ".\\flight.txt";
        FlightList flightList = new FlightList();
        rwFile.readFile(flightList, pathFlight);
        flightList.output();
        // flightList.input();
        // try {
        //     FileReader fr = new FileReader(pathWrite);
        //     BufferedReader br = new BufferedReader(fr);
        
        //     String line = br.readLine(); 
        //     while(line != null) {
        //         String[] arr = line.split(";");
        //         String flightId = arr[0];
        //         String routeId = arr[1];
        //         String flightRouteId = arr[2];
        //         String airplaneId = arr[3];
        //         int status = Integer.parseInt(arr[4]);
        //         int numTicketLeft = Integer.parseInt(arr[5]);
        //         String takeOffDay = arr[6];
        //         String landingDay = arr[7];
        //         Flight f = new Flight(flightId, routeId, flightRouteId, airplaneId, status, 
        //         numTicketLeft, takeOffDay, landingDay);
        //         flightList.addElement(f);  
        //         line = br.readLine();
        //     }
        // } catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        // rwFile.writeFile(flightList, pathFlight);

        flightList.statistic();
        // flightList.output();
    }    
}
