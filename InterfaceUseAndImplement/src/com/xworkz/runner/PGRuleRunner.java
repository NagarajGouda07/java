package com.xworkz.runner;

import com.xworkz.Interface.PGRule;
import com.xworkz.implement.PGRuleImplement;
import com.xworkz.use.KhushiPG;

public class PGRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PGRule pgRule = new PGRuleImplement();
		KhushiPG khushiPg=new KhushiPG();
		khushiPg.setPGRule(pgRule);
		khushiPg.checkCostAndWifi();

	}

}
