package com.elevator;


public class Engine {
    public static void main(String[] args) {
        int minFloorsCount = 5;
        int maxFloorsCount = 20;

        int minPeopleCount = 0;
        int maxPeopleCount = 10;

        Building building = new Building(minPeopleCount, maxPeopleCount, minFloorsCount, maxFloorsCount);
        Elevator elevator = new Elevator(building);

        elevator.startElevator();

    }
}
