package com.company;
/**
 * lab5.LuxSeat
 * @author Oleinych Danyil
 * @vesrsion 1.0
 * @since 2020-11-6|20.00
 */
public class LuxSeat implements IProfit{
    private int ticketPrice;
    private int passengers;
    private int services;

    public LuxSeat() {
    }

    public LuxSeat(int ticketPrice, int passengers, int services) {
        if(ticketPrice>0 && passengers>0 && services>=0)
        {
            this.ticketPrice = ticketPrice;
            this.passengers = passengers;
            this.services = services;
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
        else throw new IllegalArgumentException("wrong data");
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

    public int getServices() {
        return services;
    }

    public void setServices(int services) {
        if(services>=0)
            this.services = services;
        else
            throw new IllegalArgumentException("wrong data");
    }
    public  int getProfit(){
        return (this.getPassengers()*this.getTicketPrice()+this.services);
    }
    @Override
    public String toString() {
        return "LuxSeat{" +
                "ticketPrice=" + ticketPrice +
                ", passengers=" + passengers +
                ", services=" + services +
                '}';
    }
}
