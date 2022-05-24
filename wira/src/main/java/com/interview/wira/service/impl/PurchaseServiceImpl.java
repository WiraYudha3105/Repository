package com.interview.wira.service.impl;

import com.interview.wira.entity.Purchase;
import com.interview.wira.repository.PurchaseRepository;
import com.interview.wira.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    @Override
    public Purchase transaction(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
