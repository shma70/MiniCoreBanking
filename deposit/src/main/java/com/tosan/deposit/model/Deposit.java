package com.tosan.deposit.model;


import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Transactional
@Table(name = "cutomers")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Deposit Type")
    private DepositType depositType;

    @Column(name = "Deposit Title")
    private String depositTitle;

    @Column(name = "Deposit Status")
    private DepositStatus depositStatus;

    @Column(name = "Deposit Number",unique = true)
    private Integer depositNumber;

    @Column(name = "Deposit Currency")
    private DepositCurrency depositCurrency;

    @Column(name = "Deposit Balance")
    private BigDecimal depositBalance;

    @Column(name = "Validity Start Date")
    private Date validityStartDate;

    @Column(name = "Credit Expiration Date")
    private Date creditExpirationDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Deposit deposit = (Deposit) o;
        return id != null && Objects.equals(id, deposit.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
