// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.AssignmentFilterSupportedProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Get Platform Supported Properties Collection Page.
 */
public class DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionPage extends BaseCollectionPage<AssignmentFilterSupportedProperty, DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionRequestBuilder> {

    /**
     * A collection page for AssignmentFilterSupportedProperty.
     *
     * @param response The serialized DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionPage(@Nonnull final DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionResponse response, @Nonnull final DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceAndAppManagementAssignmentFilterGetPlatformSupportedProperties
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionPage(@Nonnull final java.util.List<AssignmentFilterSupportedProperty> pageContents, @Nullable final DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
