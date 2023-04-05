package com.madhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.madhu.comp.BillGenerator;
import com.madhu.comp.ItemsInfo;

@SpringBootApplication
public class ValueAnnotationApp1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ValueAnnotationApp1Application.class, args);
//	
//		ItemsInfo itemsInfo = context.getBean(ItemsInfo.class);
//		System.out.println(itemsInfo);
		
		BillGenerator bill = context.getBean(BillGenerator.class);
		System.out.println("bill:"+bill);
		
	((ConfigurableApplicationContext) context).close();
	
	}

}
