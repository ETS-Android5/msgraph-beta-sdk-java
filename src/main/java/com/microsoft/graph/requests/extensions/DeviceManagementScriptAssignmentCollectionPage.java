// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Assignment Collection Page.
 */
public class DeviceManagementScriptAssignmentCollectionPage extends BaseCollectionPage<DeviceManagementScriptAssignment, IDeviceManagementScriptAssignmentCollectionRequestBuilder> implements IDeviceManagementScriptAssignmentCollectionPage {

    /**
     * A collection page for DeviceManagementScriptAssignment
     *
     * @param response the serialized DeviceManagementScriptAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptAssignmentCollectionPage(final DeviceManagementScriptAssignmentCollectionResponse response, final IDeviceManagementScriptAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
