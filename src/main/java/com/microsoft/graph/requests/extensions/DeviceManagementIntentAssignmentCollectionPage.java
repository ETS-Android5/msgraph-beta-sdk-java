// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Assignment Collection Page.
 */
public class DeviceManagementIntentAssignmentCollectionPage extends BaseCollectionPage<DeviceManagementIntentAssignment, IDeviceManagementIntentAssignmentCollectionRequestBuilder> implements IDeviceManagementIntentAssignmentCollectionPage {

    /**
     * A collection page for DeviceManagementIntentAssignment
     *
     * @param response the serialized DeviceManagementIntentAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementIntentAssignmentCollectionPage(final DeviceManagementIntentAssignmentCollectionResponse response, final IDeviceManagementIntentAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
