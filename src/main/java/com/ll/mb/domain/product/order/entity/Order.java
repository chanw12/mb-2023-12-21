package com.ll.mb.domain.product.order.entity;

import com.ll.mb.domain.memebr.member.entity.Member;
import com.ll.mb.domain.product.cart.entity.CartItem;
import com.ll.mb.global.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
@Table(name = "order_")
public class Order extends BaseEntity {
    @ManyToOne
    private Member buyer;

    @Builder.Default
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    private boolean isPaid; // 결제여부
    private boolean isCanceled; // 취소여부
    private boolean isRefunded; // 환불여부


    public void addItem(CartItem cartItem) {
        OrderItem orderItem = OrderItem.builder()
                .order(this)
                .product(cartItem.getProduct())
                .build();

        orderItems.add(orderItem);
    }
}