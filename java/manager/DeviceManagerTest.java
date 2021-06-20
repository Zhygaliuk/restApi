package manager;

import models.Device;
import models.Keyboard;
import models.Monitor;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DeviceManagerTest {
    List<Device> deviceList = List.of(new Keyboard("A=1", 100, "Logitech", "Chine", "Eng"),
                new Monitor("Aboba", 90, "HuperX", "English", 23),
                new Keyboard("Axuba", 150, "KOrsar", "Ukraine", "Us") );
    DeviceManager deviceManager = new DeviceManager(deviceList);

    @Test
    void searchByName() {

         final String name ="Aboba";
        List<Device> test =deviceList.stream().filter(device -> device.getName()  == name).collect(Collectors.toList());
        assertEquals(test,deviceManager.searchByName(name));

    }

    @Test
    void sortByPrice() {
        DeviceManager deviceManager = new DeviceManager(deviceList);

        deviceList.sort(Comparator.comparing(Device::getPrice).reversed());
        assertEquals(deviceList,deviceManager.sortByPrice(false));
    }

    @Test
    void searchByProduce() {
        final String produce = "Ukraine";
        List<Device> test =deviceList.stream().filter(device -> device.getProduce()  == produce).collect(Collectors.toList());
        assertEquals(test,deviceManager.searchByProduce(produce));
    }

    @Test
    void sortByProduce() {
    }


    }
