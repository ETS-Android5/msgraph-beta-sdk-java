// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.DeviceManagementExchangeOnPremisesPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyCollectionResponse;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange On Premises Policy Collection Request.
 */
public class DeviceManagementExchangeOnPremisesPolicyCollectionRequest extends BaseEntityCollectionRequest<DeviceManagementExchangeOnPremisesPolicy, DeviceManagementExchangeOnPremisesPolicyCollectionResponse, DeviceManagementExchangeOnPremisesPolicyCollectionPage> {

    /**
     * The request builder for this collection of DeviceManagementExchangeOnPremisesPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementExchangeOnPremisesPolicyCollectionResponse.class, DeviceManagementExchangeOnPremisesPolicyCollectionPage.class, DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DeviceManagementExchangeOnPremisesPolicy
     * @param newDeviceManagementExchangeOnPremisesPolicy the DeviceManagementExchangeOnPremisesPolicy to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementExchangeOnPremisesPolicy> postAsync(@Nonnull final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Creates a new DeviceManagementExchangeOnPremisesPolicy
     * @param newDeviceManagementExchangeOnPremisesPolicy the DeviceManagementExchangeOnPremisesPolicy to create
     * @return the newly created object
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicy post(@Nonnull final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

