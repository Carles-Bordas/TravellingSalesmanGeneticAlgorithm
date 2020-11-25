package com.snowy.travsalesman.geneticalg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TravellingSalesmanGeneticAlgorithmSolver implements TravellingSalesmanSolver {
    private int iterations;
    private int entityCount;
    private Random random = new Random();

    public TravellingSalesmanGeneticAlgorithmSolver(int entityCount, int iterations) {
        this.iterations = iterations;
        this.entityCount = entityCount;
    }

    @Override
    public Route solve(Collection<City> cities, City initial) {

        List<City> cityList = new ArrayList<>(cities);
        List<Route> routes = generateRandomRoutes(cityList, initial, entityCount);

        for (int i = 0; i < iterations; i++) {
            routes.sort(new RouteDistanceComparator());

            probabilisticRouteRemoval(routes);

            generateNewRoutes(routes);
        }

        return null;
    }

    private void generateNewRoutes(List<Route> routes) {
        int remainingRoutes = routes.size();
        while (routes.size() < entityCount) {
            int routeIndex = random.nextInt(remainingRoutes);
            Route baseRoute = routes.get(routeIndex);
            routes.add(generateMutation(baseRoute));
        }
    }

    private void probabilisticRouteRemoval(List<Route> routes) {
        Iterator<Route> it = routes.iterator();
        int index = 0;
        while (it.hasNext()) {
            double prob = (double) index / routes.size();
            if (random.nextDouble() < prob) {
                it.remove();
            }
            index++;
        }
    }

    private Route generateMutation(Route baseRoute) {
        Route newRoute = baseRoute.clone();

        int index1 = random.nextInt(newRoute.length());
        int index2 = random.nextInt(newRoute.length());
        newRoute.permutate(index1, index2);
        return newRoute;
    }

    public List<Route> generateRandomRoutes(List<City> cities, City initial, int count) {
        List<Route> routes = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            routes.add(generateRandomRoute(cities, initial));
        }
        return routes;
    }

    public Route generateRandomRoute(List<City> cities, City initial) {
        int initialIndex = cities.indexOf(initial);
        if (initialIndex == -1) {
            throw new RuntimeException();
        }

        List<City> citiesCopy = new ArrayList<>(cities);

        Collections.shuffle(citiesCopy);

        return new SimpleRoute(citiesCopy);
    }

}
