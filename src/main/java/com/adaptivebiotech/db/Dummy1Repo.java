package com.adaptivebiotech.db;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.r2dbc.repository.ReactorCrudRepository;
@R2dbcRepository(dialect = Dialect.POSTGRES)
public interface Dummy1Repo extends ReactorCrudRepository<DummyTable1, Long> {
}
