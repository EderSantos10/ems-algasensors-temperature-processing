package com.algaworks.algasensors.temperature.processing;

import com.algaworks.algasensors.temperature.processing.common.IdGenerator;
import com.algaworks.algasensors.temperature.processing.common.UUIDv7Utils;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7(){
        UUID uuid1 = IdGenerator.generatorTimeBasedUUID();
        UUID uuid2 = IdGenerator.generatorTimeBasedUUID();

        System.out.println(uuid1);
        System.out.println(uuid2);
        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid1));
        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid2));

    }
}