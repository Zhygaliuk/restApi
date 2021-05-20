package manager;

import enums.Aspect;
import lombok.AllArgsConstructor;
import models.Device;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class DeviceManager {
    private final List<Device> allObjects;

    public List<Device> searchByName(String name) {
        return allObjects.stream().filter(device -> device.getName()  == name).collect(Collectors.toList());
    }

    public List<Device> sortByPrice(boolean sortOrder) {
        List<Device> allObjectsSorted = new ArrayList<>(allObjects);
        if (sortOrder) {
            allObjectsSorted.sort(Comparator.comparing(Device::getPrice));
        } else {
            allObjectsSorted.sort(Comparator.comparing(Device::getPrice).reversed());
        }
        return allObjectsSorted;
    }

    public List<Device> searchByProduce(String produce) {
        return allObjects.stream().filter(device -> device.getProduce() == produce).collect(Collectors.toList());
    }

    public static void printSortedObjects(List<Device> allObjects) {
        allObjects.forEach(System.out::println);
    }
}
