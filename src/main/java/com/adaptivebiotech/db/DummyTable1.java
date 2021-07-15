package com.adaptivebiotech.db;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.reactivex.annotations.Nullable;
@MappedEntity
public record DummyTable1(@Id @GeneratedValue @Nullable Long id, String name) {
}
