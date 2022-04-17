package com.tosan.customer.model;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Transactional
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class NationalCode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "NationalCode", unique = true)
    private Integer nationalCode;


    public Integer getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }
}

