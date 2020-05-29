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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * A client resource represents a client buyeran agency, a brand, or an advertiser customer of the
 * sponsor buyer. Users associated with the client buyer have restricted access to the Marketplace
 * and certain other sections of the Authorized Buyers UI based on the role granted to the client
 * buyer. All fields are required unless otherwise specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Client extends com.google.api.client.json.GenericJson {

  /**
   * The globally-unique numerical ID of the client. The value of this field is ignored in create
   * and update operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long clientAccountId;

  /**
   * Name used to represent this client to publishers. You may have multiple clients that map to the
   * same entity, but for each client the combination of `clientName` and entity must be unique. You
   * can specify this field as empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientName;

  /**
   * Numerical identifier of the client entity. The entity can be an advertiser, a brand, or an
   * agency. This identifier is unique among all the entities with the same type. The value of this
   * field is ignored if the entity type is not provided.
   *
   * A list of all known advertisers with their identifiers is available in the
   * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt) file.
   *
   * A list of all known brands with their identifiers is available in the
   * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt) file.
   *
   * A list of all known agencies with their identifiers is available in the
   * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt) file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long entityId;

  /**
   * The name of the entity. This field is automatically fetched based on the type and ID. The value
   * of this field is ignored in create and update operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityName;

  /**
   * An optional field for specifying the type of the client entity: `ADVERTISER`, `BRAND`, or
   * `AGENCY`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityType;

  /**
   * Optional arbitrary unique identifier of this client buyer from the standpoint of its Ad
   * Exchange sponsor buyer.
   *
   * This field can be used to associate a client buyer with the identifier in the namespace of its
   * sponsor buyer, lookup client buyers by that identifier and verify whether an Ad Exchange
   * counterpart of a given client buyer already exists.
   *
   * If present, must be unique among all the client buyers for its Ad Exchange sponsor buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerClientId;

  /**
   * The role which is assigned to the client buyer. Each role implies a set of permissions granted
   * to the client. Must be one of `CLIENT_DEAL_VIEWER`, `CLIENT_DEAL_NEGOTIATOR` or
   * `CLIENT_DEAL_APPROVER`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * The status of the client buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Whether the client buyer will be visible to sellers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean visibleToSeller;

  /**
   * The globally-unique numerical ID of the client. The value of this field is ignored in create
   * and update operations.
   * @return value or {@code null} for none
   */
  public java.lang.Long getClientAccountId() {
    return clientAccountId;
  }

  /**
   * The globally-unique numerical ID of the client. The value of this field is ignored in create
   * and update operations.
   * @param clientAccountId clientAccountId or {@code null} for none
   */
  public Client setClientAccountId(java.lang.Long clientAccountId) {
    this.clientAccountId = clientAccountId;
    return this;
  }

  /**
   * Name used to represent this client to publishers. You may have multiple clients that map to the
   * same entity, but for each client the combination of `clientName` and entity must be unique. You
   * can specify this field as empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientName() {
    return clientName;
  }

  /**
   * Name used to represent this client to publishers. You may have multiple clients that map to the
   * same entity, but for each client the combination of `clientName` and entity must be unique. You
   * can specify this field as empty.
   * @param clientName clientName or {@code null} for none
   */
  public Client setClientName(java.lang.String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Numerical identifier of the client entity. The entity can be an advertiser, a brand, or an
   * agency. This identifier is unique among all the entities with the same type. The value of this
   * field is ignored if the entity type is not provided.
   *
   * A list of all known advertisers with their identifiers is available in the
   * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt) file.
   *
   * A list of all known brands with their identifiers is available in the
   * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt) file.
   *
   * A list of all known agencies with their identifiers is available in the
   * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt) file.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEntityId() {
    return entityId;
  }

  /**
   * Numerical identifier of the client entity. The entity can be an advertiser, a brand, or an
   * agency. This identifier is unique among all the entities with the same type. The value of this
   * field is ignored if the entity type is not provided.
   *
   * A list of all known advertisers with their identifiers is available in the
   * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt) file.
   *
   * A list of all known brands with their identifiers is available in the
   * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt) file.
   *
   * A list of all known agencies with their identifiers is available in the
   * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt) file.
   * @param entityId entityId or {@code null} for none
   */
  public Client setEntityId(java.lang.Long entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The name of the entity. This field is automatically fetched based on the type and ID. The value
   * of this field is ignored in create and update operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityName() {
    return entityName;
  }

  /**
   * The name of the entity. This field is automatically fetched based on the type and ID. The value
   * of this field is ignored in create and update operations.
   * @param entityName entityName or {@code null} for none
   */
  public Client setEntityName(java.lang.String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * An optional field for specifying the type of the client entity: `ADVERTISER`, `BRAND`, or
   * `AGENCY`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * An optional field for specifying the type of the client entity: `ADVERTISER`, `BRAND`, or
   * `AGENCY`.
   * @param entityType entityType or {@code null} for none
   */
  public Client setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Optional arbitrary unique identifier of this client buyer from the standpoint of its Ad
   * Exchange sponsor buyer.
   *
   * This field can be used to associate a client buyer with the identifier in the namespace of its
   * sponsor buyer, lookup client buyers by that identifier and verify whether an Ad Exchange
   * counterpart of a given client buyer already exists.
   *
   * If present, must be unique among all the client buyers for its Ad Exchange sponsor buyer.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerClientId() {
    return partnerClientId;
  }

  /**
   * Optional arbitrary unique identifier of this client buyer from the standpoint of its Ad
   * Exchange sponsor buyer.
   *
   * This field can be used to associate a client buyer with the identifier in the namespace of its
   * sponsor buyer, lookup client buyers by that identifier and verify whether an Ad Exchange
   * counterpart of a given client buyer already exists.
   *
   * If present, must be unique among all the client buyers for its Ad Exchange sponsor buyer.
   * @param partnerClientId partnerClientId or {@code null} for none
   */
  public Client setPartnerClientId(java.lang.String partnerClientId) {
    this.partnerClientId = partnerClientId;
    return this;
  }

  /**
   * The role which is assigned to the client buyer. Each role implies a set of permissions granted
   * to the client. Must be one of `CLIENT_DEAL_VIEWER`, `CLIENT_DEAL_NEGOTIATOR` or
   * `CLIENT_DEAL_APPROVER`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The role which is assigned to the client buyer. Each role implies a set of permissions granted
   * to the client. Must be one of `CLIENT_DEAL_VIEWER`, `CLIENT_DEAL_NEGOTIATOR` or
   * `CLIENT_DEAL_APPROVER`.
   * @param role role or {@code null} for none
   */
  public Client setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * The status of the client buyer.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the client buyer.
   * @param status status or {@code null} for none
   */
  public Client setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the client buyer will be visible to sellers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVisibleToSeller() {
    return visibleToSeller;
  }

  /**
   * Whether the client buyer will be visible to sellers.
   * @param visibleToSeller visibleToSeller or {@code null} for none
   */
  public Client setVisibleToSeller(java.lang.Boolean visibleToSeller) {
    this.visibleToSeller = visibleToSeller;
    return this;
  }

  @Override
  public Client set(String fieldName, Object value) {
    return (Client) super.set(fieldName, value);
  }

  @Override
  public Client clone() {
    return (Client) super.clone();
  }

}
