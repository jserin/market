package com.cojar.market.member;

import com.cojar.market.answer.Answer;
import com.cojar.market.base.entity.BaseEntity;
import com.cojar.market.market.Market;
import com.cojar.market.product.Product;
import com.cojar.market.quesiton.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;

    private String password;
    private String nickname;
    private String email;

    @OneToOne
    private Market market;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}
