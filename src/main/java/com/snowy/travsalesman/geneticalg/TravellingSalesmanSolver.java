package com.snowy.travsalesman.geneticalg;

import java.util.Set;

public interface TravellingSalesmanSolver {
    public Route solve(Set<City> cities, City initial);
}
