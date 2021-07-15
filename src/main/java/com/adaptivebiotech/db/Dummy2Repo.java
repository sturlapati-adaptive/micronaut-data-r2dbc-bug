package com.adaptivebiotech.db;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.r2dbc.repository.ReactorCrudRepository;

@R2dbcRepository(dialect = Dialect.POSTGRES)
public interface Dummy2Repo extends ReactorCrudRepository<DummyTable2, Long> {
}
