package com.tosan.customer.model;


import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Transactional
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer<nationalCode> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Customer Code")
    private Long customerCode;

    @Column(name = "First Name")
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "National Code", unique = true)
    private NationalCode nationalCode;

    @Column(name = "Date of Birthday")
    private Date dateOfBirthday;

    @Column(name = "Customer Status")
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;

    @Column(name = "Customer Type")
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @Column(name = "Phone Number")
    private Long phoneNumber;

    @Column(name = "Customer Definition Date")
    private Date customerDefinitionDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer<?> customer = (Customer<?>) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}