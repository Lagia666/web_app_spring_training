package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import static java.util.UUID.*;
@Component
public class ApplicationIdentifierFilter implements javax.servlet.Filter{
    private String popol;



    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse toto = (HttpServletResponse) servletResponse;
        toto.setHeader("Instance-Id", popol );
        filterChain.doFilter(servletRequest, servletResponse);
    }


    public ApplicationIdentifierFilter() {
        popol = randomUUID().toString();
    }
}
