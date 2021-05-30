package ua.lviv.iot.Shoppingproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Shoppingproject.models.Keyboard;
import ua.lviv.iot.Shoppingproject.controllers.service.ShopService;

import java.util.List;

//localhost:8080/keyboard
@RestController
@RequestMapping(path = "/keyboard")
public class ShoppingController {

    @Autowired
    private ShopService shopService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Keyboard> getKeyboard(@PathVariable Integer id) {
        if (shopService.getKeyboard(id) != null) {
            return new ResponseEntity<>(shopService.getKeyboard(id), HttpStatus.OK);
        } else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping
    public ResponseEntity<List<Keyboard>> getKeyboards() {

        return new ResponseEntity<>(shopService.getKeyboards(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Keyboard> createKeyboard(@RequestBody final Keyboard keyboard) {

        return new ResponseEntity<Keyboard>(shopService.addKeyboard(keyboard), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Keyboard> updateKeyboard(@RequestBody Keyboard keyboard, @PathVariable final Integer id) {
        if (shopService.getKeyboard(keyboard.getId()) != null) {
            return new ResponseEntity<Keyboard>(shopService.updateKeyboard(keyboard, id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Keyboard> deleteKeyboard(@PathVariable Integer id) {
        if (shopService.getShopsMap().containsKey(id)) {
            return new ResponseEntity<>(shopService.deleteKeyboard(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
