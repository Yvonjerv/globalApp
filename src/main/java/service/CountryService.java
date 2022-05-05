package service;

import model.TCountry;

import java.util.List;

public interface CountryService {

    public List<TCountry> getCountries();
    public TCountry getCountryById(String alpha);
}
