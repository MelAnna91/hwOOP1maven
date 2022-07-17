package ru.netology.domain;

public class Radio {
    private int currentVolume;

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            int newCurrentVolume = currentVolume + 1;
            setCurrentVolume(newCurrentVolume);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            int newCurrentVolume = currentVolume - 1;
            setCurrentVolume(newCurrentVolume);
        }
    }

    private int currentStation;

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {

        if (currentStation < 9) {
            int newCurrentStation = currentStation + 1;
            setCurrentStation(newCurrentStation);
        } else {
            currentStation = 0;
            setCurrentStation(currentStation);
        }
    }

    public void prev() {
        if (currentStation > 0) {
            int newCurrentStation = currentStation - 1;
            setCurrentStation(newCurrentStation);
        } else {
            currentStation = 9;
            setCurrentStation(currentStation);
        }
    }
}
