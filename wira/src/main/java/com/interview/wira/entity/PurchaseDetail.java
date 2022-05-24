package com.interview.wira.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "trx_purchase_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDetail {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "purchase_detail_id")
    private String id;
    private Integer priceSell;
    private Integer quantity;
    @JsonIgnoreProperties("purchaseDetails")
    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Book book;
}
