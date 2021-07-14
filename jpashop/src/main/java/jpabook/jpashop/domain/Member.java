package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String name;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
