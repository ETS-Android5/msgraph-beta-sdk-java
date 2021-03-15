// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.DeviceManagementScript;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionResponse;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Collection Request.
 */
public class DeviceManagementScriptCollectionRequest extends BaseEntityCollectionRequest<DeviceManagementScript, DeviceManagementScriptCollectionResponse, DeviceManagementScriptCollectionPage> {

    /**
     * The request builder for this collection of DeviceManagementScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptCollectionResponse.class, DeviceManagementScriptCollectionPage.class, DeviceManagementScriptCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DeviceManagementScript
     * @param newDeviceManagementScript the DeviceManagementScript to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScript> postAsync(@Nonnull final DeviceManagementScript newDeviceManagementScript) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newDeviceManagementScript);
    }

    /**
     * Creates a new DeviceManagementScript
     * @param newDeviceManagementScript the DeviceManagementScript to create
     * @return the newly created object
     */
    @Nonnull
    public DeviceManagementScript post(@Nonnull final DeviceManagementScript newDeviceManagementScript) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementScript);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementScriptCollectionRequest expand(@Nonnull final String value) {
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
    public DeviceManagementScriptCollectionRequest filter(@Nonnull final String value) {
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
    public DeviceManagementScriptCollectionRequest orderBy(@Nonnull final String value) {
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
    public DeviceManagementScriptCollectionRequest select(@Nonnull final String value) {
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
    public DeviceManagementScriptCollectionRequest top(final int value) {
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
    public DeviceManagementScriptCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementScriptCollectionRequest count() {
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
    public DeviceManagementScriptCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementScriptCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

