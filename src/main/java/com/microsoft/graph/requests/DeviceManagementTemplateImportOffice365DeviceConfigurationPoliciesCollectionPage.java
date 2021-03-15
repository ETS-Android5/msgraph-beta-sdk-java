// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementIntent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Import Office365Device Configuration Policies Collection Page.
 */
public class DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionPage extends BaseCollectionPage<DeviceManagementIntent, DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementIntent.
     *
     * @param response The serialized DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionPage(@Nonnull final DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionResponse response, @Nonnull final DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceManagementTemplateImportOffice365DeviceConfigurationPolicies
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionPage(@Nonnull final java.util.List<DeviceManagementIntent> pageContents, @Nullable final DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
