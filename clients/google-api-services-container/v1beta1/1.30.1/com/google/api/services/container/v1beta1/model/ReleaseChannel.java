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

package com.google.api.services.container.v1beta1.model;

/**
 * ReleaseChannel indicates which release channel a cluster is subscribed to. Release channels are
 * arranged in order of risk.
 *
 * When a cluster is subscribed to a release channel, Google maintains both the master version and
 * the node version. Node auto-upgrade defaults to true and cannot be disabled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReleaseChannel extends com.google.api.client.json.GenericJson {

  /**
   * channel specifies which release channel the cluster is subscribed to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channel;

  /**
   * channel specifies which release channel the cluster is subscribed to.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * channel specifies which release channel the cluster is subscribed to.
   * @param channel channel or {@code null} for none
   */
  public ReleaseChannel setChannel(java.lang.String channel) {
    this.channel = channel;
    return this;
  }

  @Override
  public ReleaseChannel set(String fieldName, Object value) {
    return (ReleaseChannel) super.set(fieldName, value);
  }

  @Override
  public ReleaseChannel clone() {
    return (ReleaseChannel) super.clone();
  }

}
