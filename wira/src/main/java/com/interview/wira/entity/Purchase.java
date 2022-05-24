package com.interview.wira.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trx_purchase")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "purchase_id")
    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date purchaseDate;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseDetail> purchaseDetails = new ArrayList<>();
}
