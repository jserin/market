package com.cojar.market.market;

import com.cojar.market.base.entity.BaseEntity;
import com.cojar.market.member.Member;
import com.cojar.market.product.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Market extends BaseEntity {

    private String email;
    private String name;
    private String info;

    @OneToOne
    private Member member;

    @OneToMany(mappedBy = "market", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}
