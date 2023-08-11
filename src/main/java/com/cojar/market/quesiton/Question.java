package com.cojar.market.quesiton;

import com.cojar.market.answer.Answer;
import com.cojar.market.base.entity.BaseEntity;
import com.cojar.market.member.Member;
import com.cojar.market.product.Product;
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
public class Question extends BaseEntity {
    private String title;
    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
