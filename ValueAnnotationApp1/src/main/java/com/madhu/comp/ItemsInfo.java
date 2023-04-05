package com.madhu.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="info")
public class ItemsInfo {
	@Value("${item.idli.price}")
	public float idlyPrice;
	@Value("${item.dosa.price}")
	public float dosaPrice;
	@Value("${item.vada.price}")
	public float vadaPrice;
	@Override
	public String toString() {
		return "ItemsInfo [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", vadaPrice=" + vadaPrice + "]";
	}
	

}
