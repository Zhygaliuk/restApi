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
        return allObjects.stream().filter(device -> device.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Device> sortByPrice(boolean sortOrder) {
        return sortBy(sortOrder,Comparator.comparing(Device::getPrice));
    }

    public List<Device> searchByProduce(String produce) {
        return allObjects.stream().filter(device -> device.getProduce().equals(produce)).collect(Collectors.toList());
    }

    public List<Device> sortByProduce(boolean sortOrder) {
        return sortBy(sortOrder, Comparator.comparing(Device::getProduce));


    }

    public List<Device> sortBy(boolean sortOrder, Comparator comparator) {
        List<Device> allObjectsSorted = new ArrayList<>(allObjects);
        if (sortOrder) {
            allObjectsSorted.sort(comparator);
        } else {
            allObjectsSorted.sort(comparator.reversed());
        }
        return allObjectsSorted;

    }

    public static void printSortedObjects(List<Device> allObjects) {
        allObjects.forEach(System.out::println);
    }
}
