package com.cojar.market.product;

import com.cojar.market.base.entity.BaseEntity;
import com.cojar.market.market.Market;
import com.cojar.market.member.Member;
import com.cojar.market.quesiton.Question;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {

    private String name;
    private int price;
    private int hitCount;

    private String isActive;
    private String Description;

    @ManyToOne
    private Market market;

    @ManyToOne
    private Member member;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Question> questionList;
}
