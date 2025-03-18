package com.springcore.lifecyclemethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements  InitializingBean , DisposableBean{

    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void initPepsi() {  // ✅ Matches init-method in XML
        System.out.println("Inside init method: Pepsi is being served.");
    }

    public void destroyPepsi() {  // ✅ Matches destroy-method in XML
        System.out.println("Inside destroy method: Pepsi is finished.");
    }

    @Override
    public String toString() {
        return "Pepsi is ready to drink! Price: " + price;
    }

    
    
    //unimplemented method after click used for init
    @Override
	public void afterPropertiesSet() throws Exception {
    	//init
		System.out.println("taking Pepsi : init");
		
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottle back to shop : destory");
		
	}
}
