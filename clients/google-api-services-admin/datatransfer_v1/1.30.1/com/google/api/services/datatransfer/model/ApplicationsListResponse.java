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

package com.google.api.services.datatransfer.model;

/**
 * Template for a collection of Applications.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Data Transfer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of applications that support data transfer and are also installed for the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Application> applications;

  static {
    // hack to force ProGuard to consider Application used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Application.class);
  }

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifies the resource as a collection of Applications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Continuation token which will be used to specify next page in list API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of applications that support data transfer and are also installed for the customer.
   * @return value or {@code null} for none
   */
  public java.util.List<Application> getApplications() {
    return applications;
  }

  /**
   * List of applications that support data transfer and are also installed for the customer.
   * @param applications applications or {@code null} for none
   */
  public ApplicationsListResponse setApplications(java.util.List<Application> applications) {
    this.applications = applications;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public ApplicationsListResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifies the resource as a collection of Applications.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a collection of Applications.
   * @param kind kind or {@code null} for none
   */
  public ApplicationsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Continuation token which will be used to specify next page in list API.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token which will be used to specify next page in list API.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ApplicationsListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ApplicationsListResponse set(String fieldName, Object value) {
    return (ApplicationsListResponse) super.set(fieldName, value);
  }

  @Override
  public ApplicationsListResponse clone() {
    return (ApplicationsListResponse) super.clone();
  }

}