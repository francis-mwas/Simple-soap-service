package com.fram.calc;

import javax.jws.WebService;

@WebService
public interface CalculateServiceInterface {
	public int add(int a, int b);
	public int multiply(int a, int b);
	public int subtract(int a, int b);
}
