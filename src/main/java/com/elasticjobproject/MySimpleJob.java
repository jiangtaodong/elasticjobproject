package com.elasticjobproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MySimpleJob implements SimpleJob{

	public void execute(ShardingContext shardingContext) {
		
		System.out.println("elasticJob ************************** ");
		
	}

}
