package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    private String city;
    private String zipcode;
    private String street;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    //priva
}
