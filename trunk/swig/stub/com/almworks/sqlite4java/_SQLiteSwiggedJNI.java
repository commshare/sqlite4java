/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.almworks.sqlite4java;

class _SQLiteSwiggedJNI {
  public final static native int sqlite3_initialize();
  public final static native int sqlite3_shutdown();
  public final static native int sqlite3_extended_errcode(long jarg1);
  public final static native String sqlite3_libversion();
  public final static native String sqlite3_sourceid();
  public final static native int sqlite3_libversion_number();
  public final static native int sqlite3_compileoption_used(String jarg1);
  public final static native String sqlite3_compileoption_get(int jarg1);
  public final static native int sqlite3_threadsafe();
  public final static native int sqlite3_close(long jarg1);
  public final static native int sqlite3_extended_result_codes(long jarg1, int jarg2);
  public final static native long sqlite3_last_insert_rowid(long jarg1);
  public final static native int sqlite3_changes(long jarg1);
  public final static native int sqlite3_total_changes(long jarg1);
  public final static native void sqlite3_interrupt(long jarg1);
  public final static native int sqlite3_complete(String jarg1);
  public final static native int sqlite3_busy_timeout(long jarg1, int jarg2);
  public final static native long sqlite3_memory_used();
  public final static native long sqlite3_memory_highwater(int jarg1);
  public final static native int sqlite3_errcode(long jarg1);
  public final static native String sqlite3_errmsg(long jarg1);
  public final static native int sqlite3_bind_double(long jarg1, int jarg2, double jarg3);
  public final static native int sqlite3_bind_int(long jarg1, int jarg2, int jarg3);
  public final static native int sqlite3_bind_int64(long jarg1, int jarg2, long jarg3);
  public final static native int sqlite3_bind_null(long jarg1, int jarg2);
  public final static native int sqlite3_bind_zeroblob(long jarg1, int jarg2, int jarg3);
  public final static native int sqlite3_bind_parameter_count(long jarg1);
  public final static native String sqlite3_bind_parameter_name(long jarg1, int jarg2);
  public final static native int sqlite3_bind_parameter_index(long jarg1, String jarg2);
  public final static native int sqlite3_clear_bindings(long jarg1);
  public final static native int sqlite3_column_count(long jarg1);
  public final static native String sqlite3_column_name(long jarg1, int jarg2);
  public final static native String sqlite3_column_database_name(long jarg1, int jarg2);
  public final static native String sqlite3_column_table_name(long jarg1, int jarg2);
  public final static native String sqlite3_column_origin_name(long jarg1, int jarg2);
  public final static native String sqlite3_column_decltype(long jarg1, int jarg2);
  public final static native int sqlite3_step(long jarg1);
  public final static native int sqlite3_data_count(long jarg1);
  public final static native double sqlite3_column_double(long jarg1, int jarg2);
  public final static native int sqlite3_column_int(long jarg1, int jarg2);
  public final static native long sqlite3_column_int64(long jarg1, int jarg2);
  public final static native int sqlite3_column_type(long jarg1, int jarg2);
  public final static native int sqlite3_finalize(long jarg1);
  public final static native int sqlite3_reset(long jarg1);
  public final static native int sqlite3_get_autocommit(long jarg1);
  public final static native long sqlite3_db_handle(long jarg1);
  public final static native int sqlite3_enable_shared_cache(int jarg1);
  public final static native int sqlite3_release_memory(int jarg1);
  public final static native long sqlite3_soft_heap_limit64(long jarg1);
  public final static native int sqlite3_blob_close(long jarg1);
  public final static native int sqlite3_blob_bytes(long jarg1);
  public final static native int sqlite3_stmt_readonly(long jarg1);
  public final static native int sqlite3_blob_reopen(long jarg1, long jarg2);
  public final static native long sqlite3_backup_init(long jarg1, String jarg2, long jarg3, String jarg4);
  public final static native int sqlite3_backup_step(long jarg1, int jarg2);
  public final static native int sqlite3_backup_finish(long jarg1);
  public final static native int sqlite3_backup_remaining(long jarg1);
  public final static native int sqlite3_backup_pagecount(long jarg1);
}
