package com.xworkz.runner;

import com.xworkz.Interface.MallRule;
import com.xworkz.implement.MallRuleImpl;
import com.xworkz.use.OrionMall;

public class MallRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallRule mallRule = new MallRuleImpl();
		OrionMall orionMall = new OrionMall(mallRule);
		orionMall.checkValidId();

	}

}
