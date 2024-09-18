package com.xworkz.runner;

import com.xworkz.Interface.TrafficRule;
import com.xworkz.implement.BikeTrafficRule;
import com.xworkz.use.TrafficRuleProcessor;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficRule trafficRule = new BikeTrafficRule();
		TrafficRuleProcessor trafficRuleProcessor = new TrafficRuleProcessor();
		trafficRuleProcessor.setTrafficRule(trafficRule);
		trafficRuleProcessor.start();

	}

}
