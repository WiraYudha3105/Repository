package com.interview.wira.service.impl;

import com.interview.wira.entity.PurchaseDetail;
import com.interview.wira.repository.PurchaseDetailRepository;
import com.interview.wira.service.PurchaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseDetailServiceImpl implements PurchaseDetailService {

    @Autowired
    PurchaseDetailRepository purchaseDetailRepository;

    @Override
    public PurchaseDetail savePurchaseDetail(PurchaseDetail purchaseDetail) {
        return purchaseDetailRepository.save(purchaseDetail);
    }

    @Override
    public List<PurchaseDetail> getAllPurchaseDetail() {
        return purchaseDetailRepository.findAll();
    }
}
