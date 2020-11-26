package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        NormalSeat chernivtsi_lvivN = new NormalSeat(90,60);
        NormalSeat chernivtsi_kyivN = new NormalSeat(120, 100);
        NormalSeat khmel_khersonN = new NormalSeat(100,70);

        LuxSeat chernivtsi_lvivL = new LuxSeat(150,30,1000);
        LuxSeat chernivtsi_kyivL = new LuxSeat(210,50,4000);
        LuxSeat khmel_khersonL = new LuxSeat(175, 45,5000);

        List<IProfit> trains = new ArrayList<>();
        trains.add(chernivtsi_lvivN);
        trains.add(chernivtsi_kyivN);
        trains.add(khmel_khersonN);
        trains.add(chernivtsi_lvivL);
        trains.add(chernivtsi_kyivL);
        trains.add(khmel_khersonL);

        int normalSum;
        normalSum = (int)trains.stream().filter(item -> item instanceof NormalSeat)
                .mapToInt(item->item.getProfit()).sum();
        System.out.println("Normal seat profits: " + normalSum);

        int luxSum;
        luxSum = (int)trains.stream().filter(item -> item instanceof LuxSeat)
                .mapToInt(item->item.getProfit()).sum();
        System.out.println("Luxury seats profits: " + luxSum);

        int sumOverall;
        sumOverall = (int)trains.stream().mapToInt(item-> item.getProfit()).sum();
        System.out.println("Overall profits: " + sumOverall);

        int normalMax = (int)trains.stream().filter(item -> item instanceof NormalSeat)
                .mapToInt(item->item.getProfit()).max().orElseThrow(NoSuchElementException::new);
        int luxMax = (int)trains.stream().filter(item -> item instanceof LuxSeat)
                .mapToInt(item->item.getProfit()).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Normal seats max: " + normalMax);
        System.out.println("Luxury seats max: " + luxMax);
        System.out.println(normalSum>luxSum?"Normal earns more":"Lux earns more");

    }
}
