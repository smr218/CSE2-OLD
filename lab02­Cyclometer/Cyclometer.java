/*
Stephan Reyes
Cyclometer Java Program
Records the time elapsed in seconds and the number of rotation of the front wheel during that time. 
My bicycle cyclometer (meant to measure speed, distance, etc.)
records two kinds of data, the time elapsed in seconds, and the number of rotations
of the front wheel during that time. For two trips, given time and rotation count, your
program should
a. print the number of minutes for each trip
b. print the number of counts for each tirp
c. print the distance of each trip in miles
d. print the distance for the two trips combined
*/
public class Cyclometer 
{
    public static void main(String[] args) 
    {
        int secsTrip1=480;// # of seconds to finish the first trip
        int secsTrip2=3220;// # of seconds to finish the second trip
        int countsTrip1=1561;// # of rotations of the front wheel during the first trip
        int countsTrip2=9037;// # of rotations of the front wheel during the second trip
        double wheelDiameter=27.0,// Diameter of the front wheel
        PI=3.14159,// pi's value
        feetPerMile=5280,// conversion rate of how many feet are in a mile
        inchesPerFoot=12,// conversion rate of how many inches are in a foot
        secondsPerMinute=60;// conversion rate of how many seconds are in a minute
        double distanceTrip1, distanceTrip2, totalDistance;// variable for the distances
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ countsTrip1 +" counts ");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+ countsTrip2 +" counts ");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;// Gives distance in miles of the first trip
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;// does the same as distancetrip1 on one line of code
        totalDistance = distanceTrip1 + distanceTrip2;// adds up all the information for the total distance of the trip
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    } 
} 