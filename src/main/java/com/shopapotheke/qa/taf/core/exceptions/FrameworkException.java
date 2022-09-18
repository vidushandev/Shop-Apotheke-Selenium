package com.shopapotheke.qa.taf.core.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FrameworkException extends Exception {
    Logger log = LogManager.getLogger(FrameworkException.class);

    public FrameworkException() {
        super();
    }

    public FrameworkException(String message) {
        super(message);
        log.error(message);
    }

    public FrameworkException(String message, Throwable e) {
        super(message, e);
        log.error(message, e);
    }

}
