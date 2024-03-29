package ru.netology.Homework9Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolumeIfMaxVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfLess10() {
        Radio radio = new Radio();
        radio.currentVolume = 3;

        radio.increaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMinVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMore0() {
        Radio radio = new Radio();
        radio.currentVolume = 7;

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfCurrent9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 9;

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfCurrent0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 3;

        radio.prevStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Выставление станции
    @Test
    public void shouldStationIfLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-13);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationIfMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(13);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationIfBetweenMinAndMaxStations() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}