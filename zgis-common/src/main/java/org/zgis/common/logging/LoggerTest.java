package org.zgis.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//logger
public class LoggerTest {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    public static void main(String args[]) {
        logger.debug("tttt");
    }
}
