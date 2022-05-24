package com.interview.wira.service;

import com.interview.wira.entity.PurchaseDetail;

import java.util.List;

public interface PurchaseDetailService {
    PurchaseDetail savePurchaseDetail(PurchaseDetail purchaseDetail);

    List<PurchaseDetail> getAllPurchaseDetail();
}
