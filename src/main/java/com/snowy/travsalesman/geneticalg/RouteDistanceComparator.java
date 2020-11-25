package com.snowy.travsalesman.geneticalg;

import java.util.Comparator;

public class RouteDistanceComparator implements Comparator<Route> {

    @Override
    public int compare(Route o1, Route o2) {
        return Double.compare(o1.totalDistance(), o2.totalDistance());
    }
    
}
