package chapter10;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter {
	public void doFilter(
			ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

	}
}
