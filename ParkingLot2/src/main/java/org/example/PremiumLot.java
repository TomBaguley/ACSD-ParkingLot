package org.example;

public class PremiumLot implements ParkingLot {

    @Override
    public int calculateFee(Ticket ticket) {

        int days = ticket.getDays();
        int hours = (ticket.getHours())%24;
        int minutes = (ticket.getMinutes())%60;

        int costPerHour = 4;
        int costPerDay = 27;
        

            if(minutes > 0){
                hours++;
            }
            if(hours > 6){
                days++;
                hours = 0;
            }

            days = days - days / 7;
            int totalCost = days * costPerDay + hours * costPerHour;
            return totalCost;
        }







// ToDo:  Use TDD to Implement this function
//  You will need to mock the Ticket interface
//  Business rules for this parking lot are as follows:
//        Basic fee is $4 per hour or fraction thereof
//        This means we always round up; ie, 4 hours 2 minutes is billed as 5 hours.
//        There is no pro-ration
//        Daily max is $27
//        Every 7th day or fraction thereof is free.  (ie, a stay of 13 days and 4 hours will be billed for 12 days


    }

