package com.ouhamza.ecommerce.dto;

import com.ouhamza.ecommerce.entity.Address;
import com.ouhamza.ecommerce.entity.Customer;
import com.ouhamza.ecommerce.entity.Order;
import com.ouhamza.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getShippingAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getBillingAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<OrderItem> getOrderItems() {
		// TODO Auto-generated method stub
		return null;
	}
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}
}

