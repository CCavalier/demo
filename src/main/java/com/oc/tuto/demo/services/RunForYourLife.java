package com.oc.tuto.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oc.tuto.demo.model.AmazingBean;

@Component
@Qualifier("YouBetterRun")
public class RunForYourLife implements CommandLineRunner{
	
	@Autowired
	private AmazingBean jeTaimeMarc;
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("MARRC! MARC!");
		System.out.println(jeTaimeMarc.getInfo());
	}
}
