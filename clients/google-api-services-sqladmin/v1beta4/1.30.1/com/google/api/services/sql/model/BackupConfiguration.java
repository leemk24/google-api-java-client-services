/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sql.model;

/**
 * Database instance backup configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackupConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must
   * be disabled as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean binaryLogEnabled;

  /**
   * Whether this configuration is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * This is always sql#backupConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Location of the backup
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pointInTimeRecoveryEnabled;

  /**
   * Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean replicationLogArchivingEnabled;

  /**
   * Start time for the daily backup configuration in UTC timezone in the 24 hour format - HH:MM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must
   * be disabled as well.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBinaryLogEnabled() {
    return binaryLogEnabled;
  }

  /**
   * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must
   * be disabled as well.
   * @param binaryLogEnabled binaryLogEnabled or {@code null} for none
   */
  public BackupConfiguration setBinaryLogEnabled(java.lang.Boolean binaryLogEnabled) {
    this.binaryLogEnabled = binaryLogEnabled;
    return this;
  }

  /**
   * Whether this configuration is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether this configuration is enabled.
   * @param enabled enabled or {@code null} for none
   */
  public BackupConfiguration setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * This is always sql#backupConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#backupConfiguration.
   * @param kind kind or {@code null} for none
   */
  public BackupConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Location of the backup
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the backup
   * @param location location or {@code null} for none
   */
  public BackupConfiguration setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPointInTimeRecoveryEnabled() {
    return pointInTimeRecoveryEnabled;
  }

  /**
   * Reserved for future use.
   * @param pointInTimeRecoveryEnabled pointInTimeRecoveryEnabled or {@code null} for none
   */
  public BackupConfiguration setPointInTimeRecoveryEnabled(java.lang.Boolean pointInTimeRecoveryEnabled) {
    this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    return this;
  }

  /**
   * Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReplicationLogArchivingEnabled() {
    return replicationLogArchivingEnabled;
  }

  /**
   * Reserved for future use.
   * @param replicationLogArchivingEnabled replicationLogArchivingEnabled or {@code null} for none
   */
  public BackupConfiguration setReplicationLogArchivingEnabled(java.lang.Boolean replicationLogArchivingEnabled) {
    this.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
    return this;
  }

  /**
   * Start time for the daily backup configuration in UTC timezone in the 24 hour format - HH:MM.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * Start time for the daily backup configuration in UTC timezone in the 24 hour format - HH:MM.
   * @param startTime startTime or {@code null} for none
   */
  public BackupConfiguration setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public BackupConfiguration set(String fieldName, Object value) {
    return (BackupConfiguration) super.set(fieldName, value);
  }

  @Override
  public BackupConfiguration clone() {
    return (BackupConfiguration) super.clone();
  }

}
