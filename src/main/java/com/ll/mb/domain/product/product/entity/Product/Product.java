package com.ll.mb.domain.product.product.entity.Product;

import com.ll.mb.domain.memebr.member.entity.Member;
import com.ll.mb.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;


@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Product extends BaseEntity {
    @ManyToOne
    private Member maker;
    private String relTypeCode; // book || post
    private long relId; // 1 || 2 || 3...
    private String name;
    private int price;
}
