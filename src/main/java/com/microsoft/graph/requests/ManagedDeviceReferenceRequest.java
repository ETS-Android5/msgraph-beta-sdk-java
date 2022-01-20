// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.models.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.CloudPcRemoteActionResult;
import com.microsoft.graph.models.DeviceCompliancePolicySettingState;
import com.microsoft.graph.requests.AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineStateCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineStateRequestBuilder;
import com.microsoft.graph.requests.DetectedAppCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DetectedAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceLogCollectionResponseRequestBuilder;
import com.microsoft.graph.requests.UserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.WindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Reference Request.
 */
public class ManagedDeviceReferenceRequest extends BaseReferenceRequest<ManagedDevice> {

    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDevice.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> putAsync(@Nonnull final ManagedDevice srcManagedDevice) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceManagement/comanagedDevices/" + srcManagedDevice.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @return the ManagedDevice
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ManagedDevice put(@Nonnull final ManagedDevice srcManagedDevice) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceManagement/comanagedDevices/" + srcManagedDevice.id));
        return send(HttpMethod.PUT, payload);
    }
}
