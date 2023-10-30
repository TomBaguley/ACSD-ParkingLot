package org.example;

public class LongTermParkingLot implements ParkingLot{
    @Override
    public int calculateFee(Ticket ticket) {
        int days = ticket.getDays();
        int hours = (ticket.getHours())%24;
        int minutes = (ticket.getMinutes())%60;
        int fee = 0;

        if(!(days == 0 && hours == 0 && minutes <= 30)){
            if(minutes > 0){
                hours++;
            }
            if(hours > 7){
                days++;
                hours = 0;
            }
            fee = 15*days + 2*hours;
        }




// ToDo:  Use TDD to Implement this function
//  You will need to mock the Ticket interface
//  Business rules for this parking lot are as follows:
//        Basic fee is $2 per hour or fraction thereof
//        This means we always round up; ie, 4 hours 2 minutes is billed as 5 hours.
//        There is no pro-ration
//        Daily max is $15
//        On the first day, the first half hour is free

        return fee;
    }
}
