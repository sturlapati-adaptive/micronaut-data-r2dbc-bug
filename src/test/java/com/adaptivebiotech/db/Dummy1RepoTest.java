package com.adaptivebiotech.db;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@MicronautTest
class DummyRepoTest {
    @Inject
    Dummy1Repo dummy1Repo;
    @Inject
    Dummy2Repo dummy2Repo;

    @Test
    void check_bulk_save_1() {
        DummyTable1 dt1 = new DummyTable1(null, "dt1");
        DummyTable1 dt2 = new DummyTable1(null, "dt2");
        List<DummyTable1> dummies = List.of(dt1, dt2);
        List<DummyTable1> actual = dummy1Repo.saveAll(dummies)
                .doOnNext(dt -> System.out.println(dt.toString()))
                .collectList()
                .block();
        assertNotNull(actual);
        assertEquals(dummies.size(), actual.size());
    }

    @Test
    void check_bulk_save_2() {
        DummyTable2 dt1 = new DummyTable2(1L, "dt1");
        DummyTable2 dt2 = new DummyTable2(2L, "dt2");
        List<DummyTable2> dummies = List.of(dt1, dt2);
        List<DummyTable2> actual = dummy2Repo.saveAll(dummies)
                .doOnNext(dt -> System.out.println(dt.toString()))
                .collectList()
                .block();
        assertNotNull(actual);
        assertEquals(dummies.size(), actual.size());
    }
}
