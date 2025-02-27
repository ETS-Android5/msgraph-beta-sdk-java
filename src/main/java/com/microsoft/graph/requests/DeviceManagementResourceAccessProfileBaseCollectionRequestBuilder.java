// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileAssignment;
import com.microsoft.graph.models.PolicyPlatformType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseCollectionRequest;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBaseAssignParameterSet;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Base Collection Request Builder.
 */
public class DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceManagementResourceAccessProfileBase, DeviceManagementResourceAccessProfileBaseRequestBuilder, DeviceManagementResourceAccessProfileBaseCollectionResponse, DeviceManagementResourceAccessProfileBaseCollectionPage, DeviceManagementResourceAccessProfileBaseCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementResourceAccessProfileBaseRequestBuilder.class, DeviceManagementResourceAccessProfileBaseCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder queryByPlatformType(@Nonnull final DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeParameterSet parameters) {
        return new DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.queryByPlatformType"), getClient(), null, parameters);
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
