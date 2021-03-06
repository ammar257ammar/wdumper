/*
 * This file is generated by jOOQ.
 */
package io.github.bennofs.wdumper.jooq;


import io.github.bennofs.wdumper.jooq.tables.DB_Dump;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index DUMP_IX_DUMP_CREATED_AT = Indexes0.DUMP_IX_DUMP_CREATED_AT;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index DUMP_IX_DUMP_CREATED_AT = Internal.createIndex("ix_dump_created_at", DB_Dump.DUMP, new OrderField[] { DB_Dump.DUMP.CREATED_AT }, false);
    }
}
