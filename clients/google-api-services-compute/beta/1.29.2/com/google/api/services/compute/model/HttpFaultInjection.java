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

package com.google.api.services.compute.model;

/**
 * The specification for fault injection introduced into traffic to test the resiliency of clients
 * to backend service failure. As part of fault injection, when clients send requests to a backend
 * service, delays can be introduced by Loadbalancer on a percentage of requests before sending
 * those request to the backend service. Similarly requests from clients can be aborted by the
 * Loadbalancer for a percentage of requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpFaultInjection extends com.google.api.client.json.GenericJson {

  /**
   * The specification for how client requests are aborted as part of fault injection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpFaultAbort abort;

  /**
   * The specification for how client requests are delayed as part of fault injection, before being
   * sent to a backend service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpFaultDelay delay;

  /**
   * The specification for how client requests are aborted as part of fault injection.
   * @return value or {@code null} for none
   */
  public HttpFaultAbort getAbort() {
    return abort;
  }

  /**
   * The specification for how client requests are aborted as part of fault injection.
   * @param abort abort or {@code null} for none
   */
  public HttpFaultInjection setAbort(HttpFaultAbort abort) {
    this.abort = abort;
    return this;
  }

  /**
   * The specification for how client requests are delayed as part of fault injection, before being
   * sent to a backend service.
   * @return value or {@code null} for none
   */
  public HttpFaultDelay getDelay() {
    return delay;
  }

  /**
   * The specification for how client requests are delayed as part of fault injection, before being
   * sent to a backend service.
   * @param delay delay or {@code null} for none
   */
  public HttpFaultInjection setDelay(HttpFaultDelay delay) {
    this.delay = delay;
    return this;
  }

  @Override
  public HttpFaultInjection set(String fieldName, Object value) {
    return (HttpFaultInjection) super.set(fieldName, value);
  }

  @Override
  public HttpFaultInjection clone() {
    return (HttpFaultInjection) super.clone();
  }

}