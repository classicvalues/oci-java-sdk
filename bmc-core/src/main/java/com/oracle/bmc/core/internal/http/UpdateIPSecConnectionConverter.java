/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class UpdateIPSecConnectionConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(
            RestClient client, UpdateIPSecConnectionRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getIpscId() == null) {
            throw new NullPointerException("ipscId is required");
        }

        if (request.getUpdateIPSecConnectionDetails() == null) {
            throw new NullPointerException("updateIPSecConnectionDetails is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("ipsecConnections")
                        .path(encodePathSegment(request.getIpscId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, UpdateIPSecConnectionResponse> fromResponse() {
        final Function<Response, UpdateIPSecConnectionResponse> transformer =
                new Function<Response, UpdateIPSecConnectionResponse>() {
                    @Override
                    public UpdateIPSecConnectionResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for UpdateIPSecConnectionResponse");
                        Function<Response, WithHeaders<IPSecConnection>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(IPSecConnection.class);

                        WithHeaders<IPSecConnection> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        UpdateIPSecConnectionResponse.Builder builder =
                                UpdateIPSecConnectionResponse.builder();

                        builder.iPSecConnection(response.getItem());

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
                        }

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        UpdateIPSecConnectionResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
