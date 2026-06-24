package com.myhr;

import org.springframework.stereotype.Component;

@Component
public class salary {
	double basic = 45400.70;
	double hra = 6000;
	double da = 5000;
	double sa = 15000;

	public double getBasic() {
		return basic;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getSa() {
		return sa;
	}
}
