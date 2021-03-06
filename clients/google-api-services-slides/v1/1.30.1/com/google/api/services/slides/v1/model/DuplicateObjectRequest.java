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

package com.google.api.services.slides.v1.model;

/**
 * Duplicates a slide or page element.
 *
 * When duplicating a slide, the duplicate slide will be created immediately following the specified
 * slide. When duplicating a page element, the duplicate will be placed on the same page at the same
 * position as the original.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DuplicateObjectRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the object to duplicate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The object being duplicated may contain other objects, for example when duplicating a slide or
   * a group page element. This map defines how the IDs of duplicated objects are generated: the
   * keys are the IDs of the original objects and its values are the IDs that will be assigned to
   * the corresponding duplicate object. The ID of the source object's duplicate may be specified in
   * this map as well, using the same value of the `object_id` field as a key and the newly desired
   * ID as the value.
   *
   * All keys must correspond to existing IDs in the presentation. All values must be unique in the
   * presentation and must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the new ID must not be less than 5 or greater than 50.
   *
   * If any IDs of source objects are omitted from the map, a new random ID will be assigned. If the
   * map is empty or unset, all duplicate objects will receive a new random ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> objectIds;

  /**
   * The ID of the object to duplicate.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The ID of the object to duplicate.
   * @param objectId objectId or {@code null} for none
   */
  public DuplicateObjectRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The object being duplicated may contain other objects, for example when duplicating a slide or
   * a group page element. This map defines how the IDs of duplicated objects are generated: the
   * keys are the IDs of the original objects and its values are the IDs that will be assigned to
   * the corresponding duplicate object. The ID of the source object's duplicate may be specified in
   * this map as well, using the same value of the `object_id` field as a key and the newly desired
   * ID as the value.
   *
   * All keys must correspond to existing IDs in the presentation. All values must be unique in the
   * presentation and must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the new ID must not be less than 5 or greater than 50.
   *
   * If any IDs of source objects are omitted from the map, a new random ID will be assigned. If the
   * map is empty or unset, all duplicate objects will receive a new random ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getObjectIds() {
    return objectIds;
  }

  /**
   * The object being duplicated may contain other objects, for example when duplicating a slide or
   * a group page element. This map defines how the IDs of duplicated objects are generated: the
   * keys are the IDs of the original objects and its values are the IDs that will be assigned to
   * the corresponding duplicate object. The ID of the source object's duplicate may be specified in
   * this map as well, using the same value of the `object_id` field as a key and the newly desired
   * ID as the value.
   *
   * All keys must correspond to existing IDs in the presentation. All values must be unique in the
   * presentation and must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the new ID must not be less than 5 or greater than 50.
   *
   * If any IDs of source objects are omitted from the map, a new random ID will be assigned. If the
   * map is empty or unset, all duplicate objects will receive a new random ID.
   * @param objectIds objectIds or {@code null} for none
   */
  public DuplicateObjectRequest setObjectIds(java.util.Map<String, java.lang.String> objectIds) {
    this.objectIds = objectIds;
    return this;
  }

  @Override
  public DuplicateObjectRequest set(String fieldName, Object value) {
    return (DuplicateObjectRequest) super.set(fieldName, value);
  }

  @Override
  public DuplicateObjectRequest clone() {
    return (DuplicateObjectRequest) super.clone();
  }

}
