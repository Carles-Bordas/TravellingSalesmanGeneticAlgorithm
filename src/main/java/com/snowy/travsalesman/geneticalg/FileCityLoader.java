package com.snowy.travsalesman.geneticalg;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.HashSet;

/**
 * Snowy maricon.
 */
public class FileCityLoader implements CityLoader {

    private String CityFile;

    public FileCityLoader(String CityFile) {
        this.CityFile = CityFile;
    }

    @Override
    public Set<City> loadCities() {
        Set<City> cities = new HashSet<City>();
        File file = new File(CityFile);
        FileInputStream fileStream;
        try {
            fileStream = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Ahí no hay nada bobo!!");
            Set<City> emptySet = new HashSet();
            return emptySet;
        }
        Scanner sc = new Scanner(fileStream);
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            String[] cityLine = nextLine.split(" ");
            String cityName = cityLine[0];
            double cityX = Double.parseDouble(cityLine[1]);
            double cityY = Double.parseDouble(cityLine[2]);
            SimpleVector2 XY = new SimpleVector2(cityX, cityY);
            SimpleCity city = new SimpleCity(cityName, XY);
            cities.add(city);
        }
        return cities;
    }
}
