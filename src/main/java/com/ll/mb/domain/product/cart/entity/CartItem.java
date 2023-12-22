package com.ll.mb.domain.product.cart.entity;


import com.ll.mb.domain.memebr.member.entity.Member;
import com.ll.mb.domain.product.product.entity.Product.Product;
import com.ll.mb.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class CartItem extends BaseEntity {
    @ManyToOne
    private Member buyer;
    @OneToOne
    private Product product;
}