package io.bootique.kafka.client_0_8;

import com.nhl.bootique.test.junit.BQModuleProviderChecker;
import org.junit.Test;

public class KafkaClient_0_8_ModuleProviderTest {

    @Test
    public void testPresentInJar() {
        BQModuleProviderChecker.testPresentInJar(KafkaClient_0_8_ModuleProvider.class);
    }
}