// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
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

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device With Reference Request Builder.
 */
public class ManagedDeviceWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<ManagedDevice, ManagedDeviceWithReferenceRequest, ManagedDeviceReferenceRequestBuilder> {

    /**
     * The request builder for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceWithReferenceRequest.class, ManagedDeviceReferenceRequestBuilder.class);
    }
}
