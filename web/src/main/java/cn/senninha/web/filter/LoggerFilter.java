package cn.senninha.web.filter;

import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Coded by senninha on 18-1-24
 */
@Component
public class LoggerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        Enumeration<String> e = httpServletRequest.getHeaderNames();
//        while (e.hasMoreElements()) {
//            String element = e.nextElement();
//            System.out.println(element + " " + httpServletRequest.getHeader(element));
//        }
        LoggerManager.getLogger(LoggerSystem.WEB_INTERFACE_ACCESS).info("[{}]-[{}]访问了[{}]", httpServletRequest.getHeader("x-real-ip"), httpServletRequest.getHeader("referer"), httpServletRequest.getRequestURL());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
