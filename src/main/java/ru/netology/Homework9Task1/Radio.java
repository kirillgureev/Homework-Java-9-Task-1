package ru.netology.Homework9Task1;

public class Radio {
    // 1. Поля
    // Громкость
    protected int currentVolume;
    protected int minVolume = 0;
    protected int maxVolume = 100;

    // Станция
    protected int currentRadioStationNumber;
    protected int countNumberStation = 10;
    protected int minStation = 0;
    protected int maxStation = countNumberStation - 1;

    // 2. Конструкторы
    // Конструктор с параметром кол-во станций у радио
    public Radio(int countNumberStation) {
        this.countNumberStation = countNumberStation;
    }

    // Конструктор без параметров
    public Radio() {
        this.countNumberStation = getCountNumberStation();
    }

    // 3. Get/Set
    public int getCountNumberStation() {
        return countNumberStation;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    // 4. Методы
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