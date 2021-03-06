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

package com.google.api.services.homegraph.v1.model;

/**
 * Device information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceInfo extends com.google.api.client.json.GenericJson {

  /**
   * Device hardware version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hwVersion;

  /**
   * Device manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manufacturer;

  /**
   * Device model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Device software version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String swVersion;

  /**
   * Device hardware version.
   * @return value or {@code null} for none
   */
  public java.lang.String getHwVersion() {
    return hwVersion;
  }

  /**
   * Device hardware version.
   * @param hwVersion hwVersion or {@code null} for none
   */
  public DeviceInfo setHwVersion(java.lang.String hwVersion) {
    this.hwVersion = hwVersion;
    return this;
  }

  /**
   * Device manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getManufacturer() {
    return manufacturer;
  }

  /**
   * Device manufacturer.
   * @param manufacturer manufacturer or {@code null} for none
   */
  public DeviceInfo setManufacturer(java.lang.String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Device model.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Device model.
   * @param model model or {@code null} for none
   */
  public DeviceInfo setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Device software version.
   * @return value or {@code null} for none
   */
  public java.lang.String getSwVersion() {
    return swVersion;
  }

  /**
   * Device software version.
   * @param swVersion swVersion or {@code null} for none
   */
  public DeviceInfo setSwVersion(java.lang.String swVersion) {
    this.swVersion = swVersion;
    return this;
  }

  @Override
  public DeviceInfo set(String fieldName, Object value) {
    return (DeviceInfo) super.set(fieldName, value);
  }

  @Override
  public DeviceInfo clone() {
    return (DeviceInfo) super.clone();
  }

}
