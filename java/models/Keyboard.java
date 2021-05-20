package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Keyboard extends Device {
    private String layout;

    public Keyboard(String name, int price, String brand, String produce, String layout) {
        super(name, price, brand, produce);
        this.layout = layout;

    }
}
