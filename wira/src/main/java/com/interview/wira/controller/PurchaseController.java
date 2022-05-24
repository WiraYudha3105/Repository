package com.interview.wira.controller;

import com.interview.wira.constant.APIURLConstant;
import com.interview.wira.entity.Purchase;
import com.interview.wira.service.PurchaseService;
import com.interview.wira.service.impl.PurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @PostMapping("/purchases")
    public Purchase transaction(@RequestBody Purchase purchase){
        return purchaseService.transaction(purchase);
    }
}
