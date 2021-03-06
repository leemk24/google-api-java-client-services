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

package com.google.api.services.datastore.v1beta1.model;

/**
 * Metadata for Index operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1IndexOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Metadata common to all Datastore Admin operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1CommonMetadata common;

  /**
   * The index resource ID that this operation is acting on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String indexId;

  /**
   * An estimate of the number of entities processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1Progress progressEntities;

  /**
   * Metadata common to all Datastore Admin operations.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata getCommon() {
    return common;
  }

  /**
   * Metadata common to all Datastore Admin operations.
   * @param common common or {@code null} for none
   */
  public GoogleDatastoreAdminV1IndexOperationMetadata setCommon(GoogleDatastoreAdminV1CommonMetadata common) {
    this.common = common;
    return this;
  }

  /**
   * The index resource ID that this operation is acting on.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndexId() {
    return indexId;
  }

  /**
   * The index resource ID that this operation is acting on.
   * @param indexId indexId or {@code null} for none
   */
  public GoogleDatastoreAdminV1IndexOperationMetadata setIndexId(java.lang.String indexId) {
    this.indexId = indexId;
    return this;
  }

  /**
   * An estimate of the number of entities processed.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1Progress getProgressEntities() {
    return progressEntities;
  }

  /**
   * An estimate of the number of entities processed.
   * @param progressEntities progressEntities or {@code null} for none
   */
  public GoogleDatastoreAdminV1IndexOperationMetadata setProgressEntities(GoogleDatastoreAdminV1Progress progressEntities) {
    this.progressEntities = progressEntities;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1IndexOperationMetadata set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1IndexOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1IndexOperationMetadata clone() {
    return (GoogleDatastoreAdminV1IndexOperationMetadata) super.clone();
  }

}
