// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
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

import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequest;
import com.microsoft.graph.requests.ManagedDeviceBulkReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceBulkRestoreCloudPcRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceExecuteActionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMoveDevicesToOURequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceBulkReprovisionCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceBulkRestoreCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceBulkSetCloudPcReviewStatusParameterSet;
import com.microsoft.graph.models.ManagedDeviceExecuteActionParameterSet;
import com.microsoft.graph.models.ManagedDeviceMoveDevicesToOUParameterSet;
import com.microsoft.graph.models.ManagedDeviceResizeCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceRestoreCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceSetCloudPcReviewStatusParameterSet;
import com.microsoft.graph.models.ManagedDeviceOverrideComplianceStateParameterSet;
import com.microsoft.graph.models.ManagedDeviceActivateDeviceEsimParameterSet;
import com.microsoft.graph.models.ManagedDeviceCleanWindowsDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceCreateDeviceLogCollectionRequestParameterSet;
import com.microsoft.graph.models.ManagedDeviceDeleteUserFromSharedAppleDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceDeprovisionParameterSet;
import com.microsoft.graph.models.ManagedDeviceEnableLostModeParameterSet;
import com.microsoft.graph.models.ManagedDevicePlayLostModeSoundParameterSet;
import com.microsoft.graph.models.ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet;
import com.microsoft.graph.models.ManagedDeviceSetDeviceNameParameterSet;
import com.microsoft.graph.models.ManagedDeviceTriggerConfigurationManagerActionParameterSet;
import com.microsoft.graph.models.ManagedDeviceUpdateWindowsDeviceAccountParameterSet;
import com.microsoft.graph.models.ManagedDeviceWindowsDefenderScanParameterSet;
import com.microsoft.graph.models.ManagedDeviceWipeParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Request Builder.
 */
public class ManagedDeviceCollectionRequestBuilder extends BaseCollectionRequestBuilder<ManagedDevice, ManagedDeviceRequestBuilder, ManagedDeviceCollectionResponse, ManagedDeviceCollectionPage, ManagedDeviceCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceRequestBuilder.class, ManagedDeviceCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceBulkReprovisionCloudPcRequestBuilder bulkReprovisionCloudPc(@Nonnull final ManagedDeviceBulkReprovisionCloudPcParameterSet parameters) {
        return new ManagedDeviceBulkReprovisionCloudPcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bulkReprovisionCloudPc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceBulkRestoreCloudPcRequestBuilder bulkRestoreCloudPc(@Nonnull final ManagedDeviceBulkRestoreCloudPcParameterSet parameters) {
        return new ManagedDeviceBulkRestoreCloudPcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bulkRestoreCloudPc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder bulkSetCloudPcReviewStatus(@Nonnull final ManagedDeviceBulkSetCloudPcReviewStatusParameterSet parameters) {
        return new ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bulkSetCloudPcReviewStatus"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceExecuteActionRequestBuilder executeAction(@Nonnull final ManagedDeviceExecuteActionParameterSet parameters) {
        return new ManagedDeviceExecuteActionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.executeAction"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceMoveDevicesToOURequestBuilder moveDevicesToOU(@Nonnull final ManagedDeviceMoveDevicesToOUParameterSet parameters) {
        return new ManagedDeviceMoveDevicesToOURequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.moveDevicesToOU"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
