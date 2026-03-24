package com.pos.dto;

import lombok.Data;
import com.pos.enums.DocumentStatus;
import com.pos.enums.PaymentMethod;
import java.math.BigDecimal;

@Data
public class OrderResponseDTO {
    private Long id;
    private String orderNo;
    private DocumentStatus status;
    private BigDecimal netAmount;
    private PaymentMethod paymentMethod;
}
