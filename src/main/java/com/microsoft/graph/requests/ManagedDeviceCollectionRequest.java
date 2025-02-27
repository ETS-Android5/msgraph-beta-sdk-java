// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.graph.models.CloudPcReviewStatus;
import com.microsoft.graph.models.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.CloudPcRemoteActionResult;
import com.microsoft.graph.models.DeviceCompliancePolicySettingState;
import com.microsoft.graph.models.OemWarranty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.ManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Request.
 */
public class ManagedDeviceCollectionRequest extends BaseEntityCollectionRequest<ManagedDevice, ManagedDeviceCollectionResponse, ManagedDeviceCollectionPage> {

    /**
     * The request builder for this collection of ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceCollectionResponse.class, ManagedDeviceCollectionPage.class, ManagedDeviceCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ManagedDevice
     * @param newManagedDevice the ManagedDevice to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> postAsync(@Nonnull final ManagedDevice newManagedDevice) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newManagedDevice);
    }

    /**
     * Creates a new ManagedDevice
     * @param newManagedDevice the ManagedDevice to create
     * @return the newly created object
     */
    @Nonnull
    public ManagedDevice post(@Nonnull final ManagedDevice newManagedDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDevice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionRequest expand(@Nonnull final String value) {
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
    public ManagedDeviceCollectionRequest filter(@Nonnull final String value) {
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
    public ManagedDeviceCollectionRequest orderBy(@Nonnull final String value) {
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
    public ManagedDeviceCollectionRequest select(@Nonnull final String value) {
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
    public ManagedDeviceCollectionRequest top(final int value) {
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
    public ManagedDeviceCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionRequest count() {
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
    public ManagedDeviceCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

