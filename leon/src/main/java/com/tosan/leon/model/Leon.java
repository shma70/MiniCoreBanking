package com.tosan.leon.model;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Transactional
@Table(name = "cutomers")
public class Leon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Type Of Leon")
    private LeonType leonType;

    @Column(name = "Interest Rate")
    private Float interestRate;

    @Column(name = "Leon Opening Date")
    private Date leonOpeningDate;

    @Column(name = "Leon Status")
    private LeonStatus leonStatus;

    @Column(name = "The Principal Amount Of The Leon")
    private BigDecimal principalAmount;

    @Column(name = "Total Number Of Installements")
    private Integer totalInstallementsNumber;

    @Column(name = "Number Of Remaining Installments")
    private Integer remainingInstallementsNumber;

    @Column(name = "Amount Of Every Installement")
    private Long amountEveryInstallement;
}
