package ru.netology.Homework9Task1;

public class Radio {

    // Громкость
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Станция
    public int currentRadioStationNumber;
    public int minStation = 0;
    public int maxStation = 9;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minStation) {
            return;
        }
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    // Увеличение громкости на 1
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшение громкости на 1
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    // Переключение на след. станцию
    public void nextStation() {
        if (currentRadioStationNumber == maxStation) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    // Переключение на пред. станцию
    public void prevStation() {
        if (currentRadioStationNumber == minStation) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }
}