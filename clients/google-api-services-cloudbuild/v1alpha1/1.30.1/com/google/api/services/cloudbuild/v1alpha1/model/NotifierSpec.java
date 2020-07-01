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

package com.google.api.services.cloudbuild.v1alpha1.model;

/**
 * NotifierSpec is the configuration container for notifications.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotifierSpec extends com.google.api.client.json.GenericJson {

  /**
   * The configuration of this particular notifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Notification notification;

  /**
   * Configurations for secret resources used by this particular notifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NotifierSecret> secrets;

  static {
    // hack to force ProGuard to consider NotifierSecret used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NotifierSecret.class);
  }

  /**
   * The configuration of this particular notifier.
   * @return value or {@code null} for none
   */
  public Notification getNotification() {
    return notification;
  }

  /**
   * The configuration of this particular notifier.
   * @param notification notification or {@code null} for none
   */
  public NotifierSpec setNotification(Notification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Configurations for secret resources used by this particular notifier.
   * @return value or {@code null} for none
   */
  public java.util.List<NotifierSecret> getSecrets() {
    return secrets;
  }

  /**
   * Configurations for secret resources used by this particular notifier.
   * @param secrets secrets or {@code null} for none
   */
  public NotifierSpec setSecrets(java.util.List<NotifierSecret> secrets) {
    this.secrets = secrets;
    return this;
  }

  @Override
  public NotifierSpec set(String fieldName, Object value) {
    return (NotifierSpec) super.set(fieldName, value);
  }

  @Override
  public NotifierSpec clone() {
    return (NotifierSpec) super.clone();
  }

}
