// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Assignment Collection Request Builder.
 */
public class DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceManagementResourceAccessProfileAssignment, DeviceManagementResourceAccessProfileAssignmentRequestBuilder, DeviceManagementResourceAccessProfileAssignmentCollectionResponse, DeviceManagementResourceAccessProfileAssignmentCollectionPage, DeviceManagementResourceAccessProfileAssignmentCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagementResourceAccessProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementResourceAccessProfileAssignmentRequestBuilder.class, DeviceManagementResourceAccessProfileAssignmentCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
