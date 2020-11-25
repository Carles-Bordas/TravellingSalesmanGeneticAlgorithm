package com.snowy.travsalesman.geneticalg;

import java.util.Collection;
import java.util.Set;

public interface TravellingSalesmanSolver {
    public Route solve(Collection<City> cities, City initial);
}
