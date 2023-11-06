package homeworkweek9;

import java.util.HashMap;

/**
 * Write a java program that tells you which line passes through particular stations.
 * just use Zone 1 stations name
 */
public class Program_10_TubeLineStation {

    public static void main(String[] args) {
        //Create HashMap to map stations to their corresponding tube lines
        HashMap<String,String > stationToLine = new HashMap<>();
        //Zone 1 Stations and their associated lines
        stationToLine.put("Baker Street","Bakerloo,Circle,Hammersmith & City,Jubilee,Metropolitan");
        stationToLine.put("Waterloo","Bakerloo,Jubilee,Northern,Waterloo & City");
        stationToLine.put("Kings Cross St Pancras","Circle,Hammersmith & City,Metropolitan,Northern,Piccadilly,Victoria");
        stationToLine.put("Oxford Circus","Bakerloo,Central,Victoria");
        stationToLine.put("Victoria","Circle,District,Victoria");
        //Specify the zone 1 station you want to inquire about
        String targetStation = "Oxford Circus";
        //Check if the station is in the Hashmap and get the associated lines
        if (stationToLine.containsKey(targetStation)){
            String lines = stationToLine.get(targetStation);
            System.out.println("The Following tube lines pass through " + targetStation + " : " +lines);
        }else {
            System.out.println("Sorry," + targetStation + " is not a Zone 1 station in this example.");
        }


    }
}
