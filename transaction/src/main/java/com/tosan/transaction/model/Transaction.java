package com.tosan.transaction.model;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Transactional
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Date Of Transaction")
    private Date dateOfTransaction;

    @Column(name = "Transaction Amount")
    private BigDecimal transactionAmount;

    @Column(name = "Transaction Status")
    private TransactionStatus transactionStatus;

    @Column(name = "Type Of Transaction")
    private TransactionType transactionType;

    @Column(name = "Origin Deposit Number", unique = true)
    private Long originDepositNumber;

    @Column(name = "Destination Deposit Number", unique = true)
    private Long destinationDepositNumber;

    @Column(name = "Issue Tracking", unique = true)
    private Long issueTracking;
}
