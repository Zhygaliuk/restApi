package org.example;

import enums.Aspect;
import manager.DeviceManager;
import models.Monitor;
import models.Device;
import models.Keyboard;


import java.util.List;


public class App {
    public static void main(final String[] args) {
        List<Device> allObjects = List.of(
                new Keyboard("A-1", 100, "Logitech", "Chine", "Eng"),
                new Monitor("F-2", 90, "HuperX", "English", 23),
                new Keyboard("D-3", 150, "KOrsar", "Ukraine", "Us")
        );
        DeviceManager deviceManager = new DeviceManager(allObjects);

        System.out.println("Sorting by name\n");
        DeviceManager.printSortedObjects(deviceManager.searchByName("Aboba"));
        System.out.println("--------------------------------------------");

        System.out.println("Sorting by price");
        DeviceManager.printSortedObjects(deviceManager.sortByPrice(false));
        System.out.println("--------------------------------------------");

        System.out.println("Search by produce");
        DeviceManager.printSortedObjects(deviceManager.searchByProduce("Chine"));
        System.out.println("----------------------------------------------");

    }
}