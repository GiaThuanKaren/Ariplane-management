package ThiHK1;
import java.io.*;
import java.util.*;

public class TestFlightTicket {
    public static void main(String[] args) throws IOException {
        RWFile rwFile = new RWFile();
        String pathFlightTicket = "D:\\JAVA\\First\\src\\Bao\\Code\\flightTicket.txt";
        String pathWrite = "D:\\JAVA\\First\\src\\flightTicketBin.txt";
        FlightTicketList flightTicketList = new FlightTicketList();
//        rwFile.readFile(flightTicketList, pathFlightTicket);
//        flightTicketList.output();
//         flightTicketList.input();
         try {
             FileReader fr = new FileReader(pathFlightTicket);
             BufferedReader br = new BufferedReader(fr);

             String line = br.readLine();
             while(line != null) {
                 String[] arr = line.split(";");
                 int flag = Integer.parseInt(arr[0]);
                 String flightTicketId = arr[1];
                 String flightId = arr[2];
                 int ticketType = Integer.parseInt(arr[3]);
                 int ticketPrice = Integer.parseInt(arr[4]);
                 if(flag == 0){ //eco
                     String chairNumber = arr[5];
                     EconomyClassTicket ect = new EconomyClassTicket(flightTicketId, flightId, ticketType, ticketPrice, chairNumber);
                     flightTicketList.addElement(ect);
                     ect.output();
                 } else if(flag == 1) { //bus
                     String waitingRoomId = arr[5];
                     String businessClassId = arr[6];
                     BusinessClassTicket bct = new BusinessClassTicket(flightTicketId, flightId, ticketType, ticketPrice, waitingRoomId, businessClassId);
                     flightTicketList.addElement(bct);
                     bct.output();
                 }
                 line = br.readLine();
             }
         } catch(Exception e) {
             System.out.println(e.getMessage());
         }
         rwFile.writeFile(flightTicketList, pathWrite);
//        flightTicketList.remove();
//        flightTicketList.output();
    }
}
