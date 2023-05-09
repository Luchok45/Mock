package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    public void testLocaleRussian(){
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.RUSSIA);
        String  expected = "Добро пожаловать";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLocaleUsa(){
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.BRAZIL);
        String  expected = "Welcome";

        Assertions.assertEquals(expected, actual);
    }


}