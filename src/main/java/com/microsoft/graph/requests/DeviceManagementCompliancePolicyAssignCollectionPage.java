// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceManagementCompliancePolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementCompliancePolicyAssignCollectionPage;
import com.microsoft.graph.requests.DeviceManagementCompliancePolicyAssignCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Compliance Policy Assign Collection Page.
 */
public class DeviceManagementCompliancePolicyAssignCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationPolicyAssignment, DeviceManagementCompliancePolicyAssignCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementConfigurationPolicyAssignment.
     *
     * @param response The serialized DeviceManagementCompliancePolicyAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementCompliancePolicyAssignCollectionPage(@Nonnull final DeviceManagementCompliancePolicyAssignCollectionResponse response, @Nonnull final DeviceManagementCompliancePolicyAssignCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceManagementCompliancePolicyAssign
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementCompliancePolicyAssignCollectionPage(@Nonnull final java.util.List<DeviceManagementConfigurationPolicyAssignment> pageContents, @Nullable final DeviceManagementCompliancePolicyAssignCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
