package com.madhu.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="bill")
public class BillGenerator {
	@Value("#{info.idlyPrice+info.dosaPrice+info.vadaPrice}")
	private float billAmount;
	
	@Value("UDIPIHOTEL")
	private String hotelName;
	@Autowired
	private ItemsInfo itemsInfo;
	
	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", hotelName=" + hotelName + ", info=" + itemsInfo + "]";
	}
	
	
	
	

}
