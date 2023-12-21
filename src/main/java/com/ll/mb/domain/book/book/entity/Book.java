package com.ll.mb.domain.book.book.entity;

import com.ll.mb.domain.memebr.member.entity.Member;
import com.ll.mb.domain.product.product.entity.Product.Product;
import com.ll.mb.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Book extends BaseEntity {
    @ManyToOne
    private Member author;

    @OneToOne
    private Product product;

    private String title;
    private String body;
    private int price;


}