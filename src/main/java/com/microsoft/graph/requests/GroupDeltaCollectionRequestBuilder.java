// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Group;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.GroupDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupDeltaCollectionRequest;
import com.microsoft.graph.requests.GroupDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Delta Collection Request Builder.
 */
public class GroupDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Group, GroupDeltaCollectionRequestBuilder, GroupDeltaCollectionResponse, GroupDeltaCollectionPage, GroupDeltaCollectionRequest> {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupDeltaCollectionRequestBuilder.class, GroupDeltaCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the GroupDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public GroupDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
