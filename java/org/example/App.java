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
                new Keyboard("A=1", 111, "Logitech", "Chine", "Eng"),
                new Monitor("Aboba", 153, "HuperX", "English", 23),
                new Keyboard("Axuba", 56, "KOrsar", "Ukraine", "Us")
        );
        DeviceManager deviceManager = new DeviceManager(allObjects);

        System.out.println("Sorting by name\n");
        DeviceManager.printSortedObjects(deviceManager.searchByName("Aboba"));
        System.out.println("--------------------------------------------");

        System.out.println("Sorting by price");
        DeviceManager.printSortedObjects(deviceManager.sortByPrice(true));
        System.out.println("--------------------------------------------");

        System.out.println("Search by produce");
        DeviceManager.printSortedObjects(deviceManager.searchByProduce("Chine"));
        System.out.println("----------------------------------------------");

    }
}