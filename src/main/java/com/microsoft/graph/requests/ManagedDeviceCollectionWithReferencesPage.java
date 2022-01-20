// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DetectedApp;
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
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ManagedDeviceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionWithReferencesPage;
import com.microsoft.graph.requests.ManagedDeviceCollectionResponse;
import com.microsoft.graph.models.ManagedDevice;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection With References Page.
 */
public class ManagedDeviceCollectionWithReferencesPage extends BaseCollectionPage<ManagedDevice, ManagedDeviceCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for ManagedDevice
     *
     * @param response the serialized ManagedDeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceCollectionWithReferencesPage(@Nonnull final ManagedDeviceCollectionResponse response, @Nullable final ManagedDeviceCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for ManagedDevice
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedDeviceCollectionWithReferencesPage(@Nonnull final java.util.List<ManagedDevice> pageContents, @Nullable final ManagedDeviceCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
