package com.adaptivebiotech.db;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public record DummyTable2(@Id Long id, String name) {
}
