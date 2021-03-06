/*
 * This file is generated by jOOQ.
 */
package io.github.bennofs.wdumper.jooq.tables.records;


import io.github.bennofs.wdumper.jooq.enums.DB_ZenodoTarget;
import io.github.bennofs.wdumper.jooq.tables.DB_Zenodo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DB_ZenodoRecord extends UpdatableRecordImpl<DB_ZenodoRecord> implements Record9<Integer, Integer, Integer, String, DB_ZenodoTarget, LocalDateTime, LocalDateTime, LocalDateTime, Long> {

    private static final long serialVersionUID = 647488455;

    /**
     * Setter for <code>zenodo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>zenodo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>zenodo.deposit_id</code>.
     */
    public void setDepositId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>zenodo.deposit_id</code>.
     */
    public Integer getDepositId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>zenodo.dump_id</code>.
     */
    public void setDumpId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>zenodo.dump_id</code>.
     */
    public Integer getDumpId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>zenodo.doi</code>.
     */
    public void setDoi(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>zenodo.doi</code>.
     */
    public String getDoi() {
        return (String) get(3);
    }

    /**
     * Setter for <code>zenodo.target</code>.
     */
    public void setTarget(DB_ZenodoTarget value) {
        set(4, value);
    }

    /**
     * Getter for <code>zenodo.target</code>.
     */
    public DB_ZenodoTarget getTarget() {
        return (DB_ZenodoTarget) get(4);
    }

    /**
     * Setter for <code>zenodo.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>zenodo.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>zenodo.started_at</code>.
     */
    public void setStartedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>zenodo.started_at</code>.
     */
    public LocalDateTime getStartedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>zenodo.completed_at</code>.
     */
    public void setCompletedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>zenodo.completed_at</code>.
     */
    public LocalDateTime getCompletedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>zenodo.uploaded_bytes</code>.
     */
    public void setUploadedBytes(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>zenodo.uploaded_bytes</code>.
     */
    public Long getUploadedBytes() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, String, DB_ZenodoTarget, LocalDateTime, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, String, DB_ZenodoTarget, LocalDateTime, LocalDateTime, LocalDateTime, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DB_Zenodo.ZENODO.ID;
    }

    @Override
    public Field<Integer> field2() {
        return DB_Zenodo.ZENODO.DEPOSIT_ID;
    }

    @Override
    public Field<Integer> field3() {
        return DB_Zenodo.ZENODO.DUMP_ID;
    }

    @Override
    public Field<String> field4() {
        return DB_Zenodo.ZENODO.DOI;
    }

    @Override
    public Field<DB_ZenodoTarget> field5() {
        return DB_Zenodo.ZENODO.TARGET;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return DB_Zenodo.ZENODO.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return DB_Zenodo.ZENODO.STARTED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return DB_Zenodo.ZENODO.COMPLETED_AT;
    }

    @Override
    public Field<Long> field9() {
        return DB_Zenodo.ZENODO.UPLOADED_BYTES;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getDepositId();
    }

    @Override
    public Integer component3() {
        return getDumpId();
    }

    @Override
    public String component4() {
        return getDoi();
    }

    @Override
    public DB_ZenodoTarget component5() {
        return getTarget();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component7() {
        return getStartedAt();
    }

    @Override
    public LocalDateTime component8() {
        return getCompletedAt();
    }

    @Override
    public Long component9() {
        return getUploadedBytes();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getDepositId();
    }

    @Override
    public Integer value3() {
        return getDumpId();
    }

    @Override
    public String value4() {
        return getDoi();
    }

    @Override
    public DB_ZenodoTarget value5() {
        return getTarget();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value7() {
        return getStartedAt();
    }

    @Override
    public LocalDateTime value8() {
        return getCompletedAt();
    }

    @Override
    public Long value9() {
        return getUploadedBytes();
    }

    @Override
    public DB_ZenodoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value2(Integer value) {
        setDepositId(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value3(Integer value) {
        setDumpId(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value4(String value) {
        setDoi(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value5(DB_ZenodoTarget value) {
        setTarget(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value6(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value7(LocalDateTime value) {
        setStartedAt(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value8(LocalDateTime value) {
        setCompletedAt(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord value9(Long value) {
        setUploadedBytes(value);
        return this;
    }

    @Override
    public DB_ZenodoRecord values(Integer value1, Integer value2, Integer value3, String value4, DB_ZenodoTarget value5, LocalDateTime value6, LocalDateTime value7, LocalDateTime value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DB_ZenodoRecord
     */
    public DB_ZenodoRecord() {
        super(DB_Zenodo.ZENODO);
    }

    /**
     * Create a detached, initialised DB_ZenodoRecord
     */
    public DB_ZenodoRecord(Integer id, Integer depositId, Integer dumpId, String doi, DB_ZenodoTarget target, LocalDateTime createdAt, LocalDateTime startedAt, LocalDateTime completedAt, Long uploadedBytes) {
        super(DB_Zenodo.ZENODO);

        set(0, id);
        set(1, depositId);
        set(2, dumpId);
        set(3, doi);
        set(4, target);
        set(5, createdAt);
        set(6, startedAt);
        set(7, completedAt);
        set(8, uploadedBytes);
    }
}
