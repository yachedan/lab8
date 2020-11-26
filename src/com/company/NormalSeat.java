package com.company;
/**
 * lab5.NormalSeat
 * @author Oleinych Danyil
 * @vesrsion 1.0
 * @since 2020-11-6|20.00
 */
public class NormalSeat implements IProfit{
    private int ticketPrice;
    private int passengers;

    public NormalSeat() {
    }

    public NormalSeat(int ticketPrice, int passengers) {
        if (ticketPrice>0 && passengers>0)
        {
            this.ticketPrice = ticketPrice;
            this.passengers = passengers;
        }
       else
           throw new IllegalArgumentException("wrong data");
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        if(ticketPrice>0)
            this.ticketPrice = ticketPrice;
        else
            throw new IllegalArgumentException("wrong data");
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if(passengers>0)
            this.passengers = passengers;
        else
            throw new IllegalArgumentException("wrong data");
    }
    public int getProfit(){
        return(this.getPassengers()*this.getTicketPrice());
    }
    @Override
    public String toString() {
        return "NormalSeat{" +
                "ticketPrice=" + ticketPrice +
                ", passengers=" + passengers +
                '}';
    }
}
