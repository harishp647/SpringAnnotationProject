package com.telusko.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("samsung")
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Samsung [cpu=" + cpu + "]";
	}

	public void config()
	{
		System.out.println("Octa Core,4gb Ram,12 Mp camera");
	    cpu.process();
	
	}

}
