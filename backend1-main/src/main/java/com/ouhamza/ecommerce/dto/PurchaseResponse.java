package com.ouhamza.ecommerce.dto;



import lombok.Data;
import lombok.NonNull;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */
@Data
public class PurchaseResponse {

    public PurchaseResponse(String orderTrackingNumber2) {
		// TODO Auto-generated constructor stub
	}

	@NonNull
    private String orderTrackingNumber;
}
