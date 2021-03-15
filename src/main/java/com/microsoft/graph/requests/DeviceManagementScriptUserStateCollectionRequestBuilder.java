// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceShellScript;
import com.microsoft.graph.models.DeviceManagementScriptUserState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptUserStateCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State Collection Request Builder.
 */
public class DeviceManagementScriptUserStateCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceManagementScriptUserState, DeviceManagementScriptUserStateRequestBuilder, DeviceManagementScriptUserStateCollectionResponse, DeviceManagementScriptUserStateCollectionPage, DeviceManagementScriptUserStateCollectionRequest> {

    /**
     * The request builder for this collection of DeviceShellScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptUserStateCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptUserStateRequestBuilder.class, DeviceManagementScriptUserStateCollectionRequest.class);
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
