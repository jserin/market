package com.cojar.market.answer;

import com.cojar.market.base.entity.BaseEntity;
import com.cojar.market.member.Member;
import com.cojar.market.quesiton.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer extends BaseEntity {

    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Question question;
}
