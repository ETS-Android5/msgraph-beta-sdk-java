// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.VirtualEndpoint;
import com.microsoft.graph.models.CloudPcUserSetting;
import com.microsoft.graph.models.CloudPcUserSettingAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionResponse;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc User Setting Collection Request.
 */
public class CloudPcUserSettingCollectionRequest extends BaseEntityCollectionRequest<CloudPcUserSetting, CloudPcUserSettingCollectionResponse, CloudPcUserSettingCollectionPage> {

    /**
     * The request builder for this collection of CloudPcUserSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcUserSettingCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudPcUserSettingCollectionResponse.class, CloudPcUserSettingCollectionPage.class, CloudPcUserSettingCollectionRequestBuilder.class);
    }

    /**
     * Creates a new CloudPcUserSetting
     * @param newCloudPcUserSetting the CloudPcUserSetting to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcUserSetting> postAsync(@Nonnull final CloudPcUserSetting newCloudPcUserSetting) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CloudPcUserSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCloudPcUserSetting);
    }

    /**
     * Creates a new CloudPcUserSetting
     * @param newCloudPcUserSetting the CloudPcUserSetting to create
     * @return the newly created object
     */
    @Nonnull
    public CloudPcUserSetting post(@Nonnull final CloudPcUserSetting newCloudPcUserSetting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CloudPcUserSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCloudPcUserSetting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CloudPcUserSettingCollectionRequest expand(@Nonnull final String value) {
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
    public CloudPcUserSettingCollectionRequest filter(@Nonnull final String value) {
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
    public CloudPcUserSettingCollectionRequest orderBy(@Nonnull final String value) {
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
    public CloudPcUserSettingCollectionRequest select(@Nonnull final String value) {
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
    public CloudPcUserSettingCollectionRequest top(final int value) {
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
    public CloudPcUserSettingCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CloudPcUserSettingCollectionRequest count() {
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
    public CloudPcUserSettingCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CloudPcUserSettingCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

