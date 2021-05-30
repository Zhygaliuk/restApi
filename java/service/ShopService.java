package ua.lviv.iot.Shoppingproject.controllers.service;


import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.Shoppingproject.models.Keyboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class ShopService {
    private final AtomicInteger id = new AtomicInteger(0);
    @Getter
    private Map<Integer, Keyboard> shopsMap = new HashMap<Integer,Keyboard>();

    public Keyboard addKeyboard( Keyboard keyboard){
       keyboard.setId(id.incrementAndGet());
       shopsMap.put(keyboard.getId(),keyboard);
        return keyboard;
    }
    public  Keyboard updateKeyboard(Keyboard keyboard,final Integer id){
        keyboard.setId(id);
        return  shopsMap.put(id,keyboard);
    }


    public List<Keyboard> getKeyboards(){

        return new ArrayList<>(shopsMap.values());
    }

    public Keyboard getKeyboard(Integer id) {

        return shopsMap.get(id);
    }

    public Keyboard deleteKeyboard(final Integer id){
        return shopsMap.remove(id);
    }


}
