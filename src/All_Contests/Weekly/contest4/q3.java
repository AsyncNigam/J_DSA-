package All_Contests.Weekly.contest4;

import java.util.HashMap;

//https://leetcode.com/contest/weekly-contest-523/problems/design-bus-seat-booking-system/
public class q3 {
    class BusBooking {
        HashMap<String, Integer> booked;
        int total_time;

        public BusBooking(int n) {
            booked=new HashMap<>();
            total_time=0;
        }

        public void toggle(String seat) {
            char col=seat.charAt(0);
            String row=seat.substring(1);
            if(booked.containsKey(seat)){
                int cost=booked.remove(seat);
                total_time-=cost;
            }
            else{
                int cost=1;
                if(col=='A' && booked.containsKey("B"+row))cost=3;
                else if(col=='D' && booked.containsKey("C"+row))cost=3;
                booked.put(seat,cost);
                total_time+=cost;
            }
        }

        public int getTotalTime() {
            return total_time;
        }

        public int getMinTime() {
            return booked.size();
        }
    }

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */
}
