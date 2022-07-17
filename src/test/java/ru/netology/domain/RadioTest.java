package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldNotVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldVolumeUnderOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldVolumeUpOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        int actual = rad.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void currentVolumeUpNane() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        int actual = rad.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentVolumeUpTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentVolumeUpEleven() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolumeFromZeroToOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolumeFromOneToTwo() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldChangeVolumeFomNaneToTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolumeAboveTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotChangeVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotChangeVolumeDownOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeVolumeFromOneToZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void currentChangeVolumeFromNaneToEight() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentChangeVolumeFromTenToNine() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldExposeStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldNotExposeStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldExposeStationOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        int actual = rad.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void currentExposeStationNane() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentExposeStationTen() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromNineToNext() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromZeroToNext() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromEightToNext() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromNineToPrev() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromZeroToPrev() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchStationFromEightToPrev() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
}
