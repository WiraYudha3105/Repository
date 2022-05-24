package com.interview.wira.controller;

import com.interview.wira.constant.APIURLConstant;
import com.interview.wira.entity.PurchaseDetail;
import com.interview.wira.service.PurchaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(APIURLConstant.PURCHASEDETAIL)
public class PurchaseDetailController {

    @Autowired
    PurchaseDetailService purchaseDetailService;

    @PostMapping
    public PurchaseDetail savePurchaseDetail(@RequestBody PurchaseDetail purchaseDetail) {
        return purchaseDetailService.savePurchaseDetail(purchaseDetail);
    }

    @GetMapping
    public List<PurchaseDetail> getAllPurchaseDetail(){
        return purchaseDetailService.getAllPurchaseDetail();
    }
}
