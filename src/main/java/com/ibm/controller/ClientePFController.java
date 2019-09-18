package com.ibm.controller;

import com.ibm.model.ClientePFEntity;
import com.ibm.service.ClientePFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientepf")
public class ClientePFController {
    @Autowired
    ClientePFService clientePFService;

    @GetMapping("/listar")
    public ResponseEntity<?> findAll(){return new ResponseEntity<>(clientePFService.findAll(), HttpStatus.OK);}

    @PostMapping("/salvar")
    public ResponseEntity<?> save(@RequestBody ClientePFEntity clientePFEntity){
        return new ResponseEntity<>(clientePFService.save(clientePFEntity), HttpStatus.OK);}

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){clientePFService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);}
    @PutMapping  ("/atualizar")
    public ResponseEntity<?> update(@RequestBody ClientePFEntity clientePFEntity){
        clientePFService.save(clientePFEntity); return new ResponseEntity<>(HttpStatus.OK);}
}
