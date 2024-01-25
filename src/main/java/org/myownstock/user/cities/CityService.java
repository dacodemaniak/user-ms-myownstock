package org.myownstock.user.cities;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CityService {
    /**
     * Designated to get all cities
     * @return List<City>
     */
    public List<City> findAll();
    /**
     * Designated method to add a new city
     * @param City city
     * @return City
     */
    public City add(City city);

    /**
     * Designated method to update a well known city
     * @param City city
     * @return ResponseEntity<?>
     */
    public ResponseEntity<?> update(City city);
}
