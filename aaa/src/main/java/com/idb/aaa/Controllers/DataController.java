package com.idb.aaa.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.idb.aaa.Entities.ChienDich;
import com.idb.aaa.Services.DataService;
//import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/Data")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping (
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveAll() {
        ResponseEntity<Object> entity;

        entity = new ResponseEntity<>(dataService.retrieveAll(), HttpStatus.OK);

        return entity;
    }

    @GetMapping(
        value = "/cddt",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveByChienDich(String chienDich) {

        ResponseEntity<Object>  entity;

        entity = new ResponseEntity<>(dataService.retrieveByChienDich(chienDich), HttpStatus.OK);

        return entity;
    }
    
}
