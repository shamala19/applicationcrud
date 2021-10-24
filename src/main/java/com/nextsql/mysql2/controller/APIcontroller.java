package com.nextsql.mysql2.controller;


import com.nextsql.mysql2.model.buyer;
import com.nextsql.mysql2.repository.buyerREPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIcontroller {

  @Autowired
  private buyerREPO buyerREPO;


  @GetMapping(value = "/buyers")
  public List<buyer> getbuyer(){

    return buyerREPO.findAll();
  }
  @PostMapping(value ="/save")
  public String saveBuyer(@RequestBody buyer buyer){

    buyerREPO.save(buyer);
    return "saved...";

  }

  public String updatebuyer(@PathVariable long id, @RequestBody buyer buyer){
    buyer updatedBuyer=buyerREPO.findById(id).get();
    updatedBuyer.setBookname((buyer.getBookname()));
    updatedBuyer.setAuthor((buyer.getAuthor()));
    updatedBuyer.setBookno((buyer.getBookno()));
    buyerREPO.save(updatedBuyer);
    return "updated...";

  }
  @DeleteMapping(value = "/delete/{id}")
  public String deletebuyer(@PathVariable long id){
    buyer deletebuyer=buyerREPO.findById(id).get();
    buyerREPO.delete(deletebuyer);
    return "Deleted buyer with the id : " +id;

  }
}




