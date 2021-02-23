package com.fram.calc;

import javax.jws.WebService;

@WebService(endpointInterface="com.fram.calc.CalculateServiceInterface")
public class CalculateServiceInterfaceImpl implements CalculateServiceInterface {

	@Override
	public int add(int a, int b) {
		int ans = a + b;
		return ans;
	}

	@Override
	public int multiply(int a, int b) {
		int ans = a * b;
		return ans;
	}

	@Override
	public int subtract(int a, int b) {
		int ans = a - b;
		return ans;
	}

}
