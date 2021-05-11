// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DetectedApp;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.CloudPcRemoteActionResult;
import com.microsoft.graph.models.DeviceCompliancePolicySettingState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ManagedDeviceWithReferenceRequest;
import com.microsoft.graph.requests.ManagedDeviceReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionWithReferencesRequest;
import com.microsoft.graph.requests.ManagedDeviceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Reference Request.
 */
public class ManagedDeviceCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ManagedDevice, ManagedDeviceWithReferenceRequest, ManagedDeviceReferenceRequestBuilder, ManagedDeviceWithReferenceRequestBuilder, ManagedDeviceCollectionResponse, ManagedDeviceCollectionWithReferencesPage, ManagedDeviceCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceCollectionResponse.class, ManagedDeviceCollectionWithReferencesPage.class, ManagedDeviceCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new ManagedDevice
     * @param newManagedDevice the ManagedDevice to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> postAsync(@Nonnull final ManagedDevice newManagedDevice) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managedDevices/" + newManagedDevice.id);
        return new ManagedDeviceWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newManagedDevice, body);
    }

    /**
     * Creates a new ManagedDevice
     * @param newManagedDevice the ManagedDevice to create
     * @return the newly created object
     */
    @Nonnull
    public ManagedDevice post(@Nonnull final ManagedDevice newManagedDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managedDevices/" + newManagedDevice.id);
        return new ManagedDeviceWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newManagedDevice, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public ManagedDeviceCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public ManagedDeviceCollectionReferenceRequest select(@Nonnull final String value) {
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
    public ManagedDeviceCollectionReferenceRequest top(final int value) {
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
    public ManagedDeviceCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
