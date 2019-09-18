package com.ibm.controller;

import com.ibm.model.ClientePJEntity;
import com.ibm.model.ContaEntity;
import com.ibm.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping("/listar")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(contaService.findAll(), HttpStatus.OK);}

    @PostMapping("/salvar")
    public ResponseEntity<?> save (@RequestBody ContaEntity contaEntity){
        return new ResponseEntity<>(contaService.save(contaEntity), HttpStatus.OK);}

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {contaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);}

    @PutMapping  ("/atualizar")
    public ResponseEntity<?> update(@RequestBody ContaEntity contaEntity){
        contaService.save(contaEntity); return new ResponseEntity<>(HttpStatus.OK);}
}
