package com.xworkz.equalsandtostring;

public class CreditCard {

	private String holderName;
	private int holderAge;
	private int limit;
	private String bank;
	private String security;
	private int gracePeriod;

	public CreditCard(String holderName, int holderAge, int limit, String bank, String security, int gracePeriod) {
		super();
		this.holderName = holderName;
		this.holderAge = holderAge;
		this.limit = limit;
		this.bank = bank;
		this.security = security;
		this.gracePeriod = gracePeriod;
	}

	@Override
	public String toString() {
		return "CreditCard [holderName=" + holderName + ", holderAge=" + holderAge + ", limit=" + limit + ", bank="
				+ bank + ", security=" + security + ", gracePeriod=" + gracePeriod + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a Euqlas in CreditCard");
		if (obj != null) {
			if (obj instanceof CreditCard) {
				CreditCard casted = (CreditCard) obj;
				if (this.holderName.equals(casted.holderName) && this.limit == casted.limit) {
					System.out.println("++++++++++");
				}
			} else {
				System.out.println("Obj is a not Credit Card");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}

}
