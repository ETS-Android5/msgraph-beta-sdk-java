// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.models.IdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Collection Request Builder.
 * @deprecated The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs.
 */
@Deprecated
public class IdentityUserFlowCollectionRequestBuilder extends BaseCollectionRequestBuilder<IdentityUserFlow, IdentityUserFlowRequestBuilder, IdentityUserFlowCollectionResponse, IdentityUserFlowCollectionPage, IdentityUserFlowCollectionRequest> {

    /**
     * The request builder for this collection of IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityUserFlowRequestBuilder.class, IdentityUserFlowCollectionRequest.class);
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
