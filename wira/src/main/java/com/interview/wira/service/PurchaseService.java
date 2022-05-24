package com.interview.wira.service;

import com.interview.wira.entity.Purchase;

public interface PurchaseService {
    Purchase transaction(Purchase purchase);
}
