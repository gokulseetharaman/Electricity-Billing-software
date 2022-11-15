package com.Electricity.calculate;

import lombok.Data;

@Data
public class Calculator {
	private double units;
	private double cunits = 1;

	public double getUnits() {
		return units;
	}

	public void setUnits(double units) {
		this.units = units;
	}

	public double calculaatee() {
		if (units <= 100) {
			cunits = 0;
			return cunits;
		} else if (units > 100 && units <= 200) {
			units = units - 100;
			cunits = units * 2.25;
			return cunits;
		} else if (units > 200 && units <= 400) {
			units = units - 200;
			cunits = 225 + (units * 4.50);
			return cunits;
		} else if (units > 400 && units <= 500) {
			units = units - 400;
			cunits = 225 + 900 + (units * 6.0);
			return cunits;
		} else if (units > 500 && units <= 600) {
			units = units - 500;
			cunits = 450 + 900 + 600 + (units * 8.0);
			return cunits;
		} else if (units > 600 && units <= 800) {
			units = units - 600;
			cunits = 450 + 900 + 600 + 800 + (units * 9.0);
			return cunits;
		} else if (units > 800 && units <= 1000) {
			units = units - 800;
			cunits = 450 + 900 + 600 + 800 + 1800 + (units * 10.0);
			return cunits;
		} else {
			units = units - 1000;
			cunits = 450 + 900 + 600 + 800 + 1800 + 2000 + (units * 11.0);
			return cunits;
		}
	}
}
