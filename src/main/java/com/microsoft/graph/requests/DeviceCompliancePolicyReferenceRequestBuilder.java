
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.ScheduledRetireState;
import com.microsoft.graph.models.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.RetireScheduledManagedDevice;
import com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Reference Request Builder.
 */
public class DeviceCompliancePolicyReferenceRequestBuilder extends BaseReferenceRequestBuilder<DeviceCompliancePolicy, DeviceCompliancePolicyReferenceRequest> {

    /**
     * The request builder for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyReferenceRequest.class);
    }
}
