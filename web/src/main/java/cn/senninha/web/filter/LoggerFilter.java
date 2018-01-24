package cn.senninha.web.filter;

import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
        LoggerManager.getLogger(LoggerSystem.WEB_INTERFACE_ACCESS).info("{}:{}访问了{}", servletRequest.getRemoteAddr(), servletRequest.getRemotePort(), ((HttpServletRequest)servletRequest).getRequestURL());
    }

    @Override
    public void destroy() {

    }
}
