// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ConnectorGroup;
import com.microsoft.graph.requests.ApplicationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ApplicationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.ConnectorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Group Request Builder.
 */
public class ConnectorGroupRequestBuilder extends BaseRequestBuilder<ConnectorGroup> {

    /**
     * The request builder for the ConnectorGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectorGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ConnectorGroupRequest instance
     */
    @Nonnull
    public ConnectorGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ConnectorGroupRequest instance
     */
    @Nonnull
    public ConnectorGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ConnectorGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequestBuilder applications() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("applications"), getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationWithReferenceRequestBuilder applications(@Nonnull final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("applications") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Connector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConnectorCollectionRequestBuilder members() {
        return new ConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    /**
     * Gets a request builder for the Connector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConnectorRequestBuilder members(@Nonnull final String id) {
        return new ConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
}
