package com.jmx;

import javax.management.ObjectName;
import javax.management.MBeanServerConnection;
import javax.management.JMX;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.JMXConnectorFactory;

public class JMXClient {
	public static void main(String args[]) throws Exception {
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1234/jmxrmi");
		JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
		MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
		
		ObjectName mbeanName = new ObjectName("com.jmx.HelloMBean:type=helloMBeanRef");
		HelloMBean mbeanProxy = JMX.newMBeanProxy(mbsc, mbeanName, HelloMBean.class, true);

		String welcomeStr = mbeanProxy.sayHello("Ridhima");
		System.out.println("MBean says: " + welcomeStr);
		jmxc.close();
		System.out.println("Done."); 
		
	}
}
