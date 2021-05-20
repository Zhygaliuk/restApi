package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import enums.Aspect;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Monitor extends Device {
    private float size;

    public Monitor(String name, int price, String brand, String produce, float size) {
        super(name, price, brand, produce);
        this.size = size;
    }


}

