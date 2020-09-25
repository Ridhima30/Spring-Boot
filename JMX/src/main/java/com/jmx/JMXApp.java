package com.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class JMXApp {
	
	public static void main(String[] args) throws Exception{
		
		HelloMBean hello=new Hello();
		MBeanServer mbs =ManagementFactory.getPlatformMBeanServer();
		ObjectName objName=new ObjectName("com.jmx.HelloMBean:type=helloMBeanRef");
		mbs.registerMBean(hello, objName);
		System.out.println("MBean Server Started");
		Thread.sleep(Long.MAX_VALUE);
	}
	
}
