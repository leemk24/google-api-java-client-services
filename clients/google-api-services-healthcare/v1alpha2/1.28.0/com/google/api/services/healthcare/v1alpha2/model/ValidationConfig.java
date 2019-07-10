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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * This structure contains the configuration for FHIR profiles and validation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether profile validation should be disabled for this FHIR store. Set this to true to disable
   * checking incoming resources for conformance against StructureDefinitions in this FHIR store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableProfileValidation;

  /**
   * A list of ImplementationGuide IDs in this FHIR store that will be used to configure which
   * profiles are used for validation. For example, to enable an implementation guide with ID 1 set
   * `enabled_implementation_guides` to `["1"]`. If `enabled_implementation_guides` is empty or
   * omitted then incoming resources will only be required to conform to the base FHIR profiles.
   * Otherwise, a resource must conform to at least one profile listed in the `global` property of
   * one of the enabled ImplementationGuides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledImplementationGuides;

  /**
   * Whether profile validation should be disabled for this FHIR store. Set this to true to disable
   * checking incoming resources for conformance against StructureDefinitions in this FHIR store.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableProfileValidation() {
    return disableProfileValidation;
  }

  /**
   * Whether profile validation should be disabled for this FHIR store. Set this to true to disable
   * checking incoming resources for conformance against StructureDefinitions in this FHIR store.
   * @param disableProfileValidation disableProfileValidation or {@code null} for none
   */
  public ValidationConfig setDisableProfileValidation(java.lang.Boolean disableProfileValidation) {
    this.disableProfileValidation = disableProfileValidation;
    return this;
  }

  /**
   * A list of ImplementationGuide IDs in this FHIR store that will be used to configure which
   * profiles are used for validation. For example, to enable an implementation guide with ID 1 set
   * `enabled_implementation_guides` to `["1"]`. If `enabled_implementation_guides` is empty or
   * omitted then incoming resources will only be required to conform to the base FHIR profiles.
   * Otherwise, a resource must conform to at least one profile listed in the `global` property of
   * one of the enabled ImplementationGuides.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledImplementationGuides() {
    return enabledImplementationGuides;
  }

  /**
   * A list of ImplementationGuide IDs in this FHIR store that will be used to configure which
   * profiles are used for validation. For example, to enable an implementation guide with ID 1 set
   * `enabled_implementation_guides` to `["1"]`. If `enabled_implementation_guides` is empty or
   * omitted then incoming resources will only be required to conform to the base FHIR profiles.
   * Otherwise, a resource must conform to at least one profile listed in the `global` property of
   * one of the enabled ImplementationGuides.
   * @param enabledImplementationGuides enabledImplementationGuides or {@code null} for none
   */
  public ValidationConfig setEnabledImplementationGuides(java.util.List<java.lang.String> enabledImplementationGuides) {
    this.enabledImplementationGuides = enabledImplementationGuides;
    return this;
  }

  @Override
  public ValidationConfig set(String fieldName, Object value) {
    return (ValidationConfig) super.set(fieldName, value);
  }

  @Override
  public ValidationConfig clone() {
    return (ValidationConfig) super.clone();
  }

}