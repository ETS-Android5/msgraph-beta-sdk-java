// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.ComanagementEligibleDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.ComanagementEligibleDeviceCollectionResponse;
import com.microsoft.graph.requests.ComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ComanagementEligibleDeviceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comanagement Eligible Device Collection Request.
 */
public class ComanagementEligibleDeviceCollectionRequest extends BaseEntityCollectionRequest<ComanagementEligibleDevice, ComanagementEligibleDeviceCollectionResponse, ComanagementEligibleDeviceCollectionPage> {

    /**
     * The request builder for this collection of ComanagementEligibleDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ComanagementEligibleDeviceCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComanagementEligibleDeviceCollectionResponse.class, ComanagementEligibleDeviceCollectionPage.class, ComanagementEligibleDeviceCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ComanagementEligibleDevice
     * @param newComanagementEligibleDevice the ComanagementEligibleDevice to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComanagementEligibleDevice> postAsync(@Nonnull final ComanagementEligibleDevice newComanagementEligibleDevice) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ComanagementEligibleDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newComanagementEligibleDevice);
    }

    /**
     * Creates a new ComanagementEligibleDevice
     * @param newComanagementEligibleDevice the ComanagementEligibleDevice to create
     * @return the newly created object
     */
    @Nonnull
    public ComanagementEligibleDevice post(@Nonnull final ComanagementEligibleDevice newComanagementEligibleDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ComanagementEligibleDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newComanagementEligibleDevice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ComanagementEligibleDeviceCollectionRequest expand(@Nonnull final String value) {
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
    public ComanagementEligibleDeviceCollectionRequest filter(@Nonnull final String value) {
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
    public ComanagementEligibleDeviceCollectionRequest orderBy(@Nonnull final String value) {
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
    public ComanagementEligibleDeviceCollectionRequest select(@Nonnull final String value) {
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
    public ComanagementEligibleDeviceCollectionRequest top(final int value) {
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
    public ComanagementEligibleDeviceCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ComanagementEligibleDeviceCollectionRequest count() {
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
    public ComanagementEligibleDeviceCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ComanagementEligibleDeviceCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

