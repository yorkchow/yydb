package com.yydb.listener;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <p>Logback config listener</p>
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/26
 * Time: 21:43
 */
public class LogbackConfigListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(LogbackConfigListener.class);

    private static final String CONFIG_LOCATION = "logbackConfigLocation";

    private LoggerContext loggerContext;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // Load logback config file from web.xml
        String logbackConfigLocation = event.getServletContext().getInitParameter(CONFIG_LOCATION);
        String fn = event.getServletContext().getRealPath(logbackConfigLocation);
        try {
            loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
            loggerContext.reset();
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            joranConfigurator.doConfigure(fn);
            logger.debug("Loaded slf4j configure file from {}", fn);
        } catch (JoranException e) {
            logger.error("Failed to load slf4j configure file from " + fn, e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        servletContext.log("Shutting down logback");

        loggerContext.stop();
    }
}
