// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.NetworkIPv4ConfigurationManagementCondition;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.ManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv4Configuration Management Condition Request Builder.
 */
public class NetworkIPv4ConfigurationManagementConditionRequestBuilder extends BaseRequestBuilder<NetworkIPv4ConfigurationManagementCondition> {

    /**
     * The request builder for the NetworkIPv4ConfigurationManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NetworkIPv4ConfigurationManagementConditionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the NetworkIPv4ConfigurationManagementConditionRequest instance
     */
    @Nonnull
    public NetworkIPv4ConfigurationManagementConditionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the NetworkIPv4ConfigurationManagementConditionRequest instance
     */
    @Nonnull
    public NetworkIPv4ConfigurationManagementConditionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.NetworkIPv4ConfigurationManagementConditionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagementConditionStatement collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementConditionStatementCollectionWithReferencesRequestBuilder managementConditionStatements() {
        return new ManagementConditionStatementCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementConditionStatement item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementConditionStatementWithReferenceRequestBuilder managementConditionStatements(@Nonnull final String id) {
        return new ManagementConditionStatementWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements") + "/" + id, getClient(), null);
    }
}
