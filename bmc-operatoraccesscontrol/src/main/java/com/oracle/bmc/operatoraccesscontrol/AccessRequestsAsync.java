/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Operator Access Control enables you to control the time duration and the actions an Oracle operator can perform on your Exadata Cloud@Customer infrastructure.
 * Using logging service, you can view a near real-time audit report of all actions performed by an Oracle operator.
 *
 * Use the table of contents and search tool to explore the OperatorAccessControl API.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface AccessRequestsAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Approves an access request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ApproveAccessRequestResponse> approveAccessRequest(
            ApproveAccessRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApproveAccessRequestRequest, ApproveAccessRequestResponse>
                    handler);

    /**
     * Gets details of an access request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAccessRequestResponse> getAccessRequest(
            GetAccessRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAccessRequestRequest, GetAccessRequestResponse>
                    handler);

    /**
     * Returns a history of all status associated with the accessRequestId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAccessRequestHistoriesResponse> listAccessRequestHistories(
            ListAccessRequestHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRequestHistoriesRequest, ListAccessRequestHistoriesResponse>
                    handler);

    /**
     * Lists all access requests in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAccessRequestsResponse> listAccessRequests(
            ListAccessRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRequestsRequest, ListAccessRequestsResponse>
                    handler);

    /**
     * Rejects an access request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RejectAccessRequestResponse> rejectAccessRequest(
            RejectAccessRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RejectAccessRequestRequest, RejectAccessRequestResponse>
                    handler);

    /**
     * Revokes an already approved access request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RevokeAccessRequestResponse> revokeAccessRequest(
            RevokeAccessRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RevokeAccessRequestRequest, RevokeAccessRequestResponse>
                    handler);
}
