package com.swt_iran.heartmonitortest;

import com.swt_iran.heartmonitor.HeartMonitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartMonitorTest {
    @Test
    public void testSomething() throws Exception {
        HeartMonitor monitor = new HeartMonitor();

        monitor.doSomething();
    }
}