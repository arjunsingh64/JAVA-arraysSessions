package com.arjun;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Myfilter implements Filter{

	@Override
	public void destroy() {		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Before Filter calls"); // pre processing before servlet runs
		chain.doFilter(request, response);
		System.out.println("after servlet"); //post processing after servlet runs
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}
