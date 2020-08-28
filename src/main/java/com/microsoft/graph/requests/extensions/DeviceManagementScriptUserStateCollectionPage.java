// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScriptUserState;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State Collection Page.
 */
public class DeviceManagementScriptUserStateCollectionPage extends BaseCollectionPage<DeviceManagementScriptUserState, IDeviceManagementScriptUserStateCollectionRequestBuilder> implements IDeviceManagementScriptUserStateCollectionPage {

    /**
     * A collection page for DeviceManagementScriptUserState
     *
     * @param response the serialized DeviceManagementScriptUserStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptUserStateCollectionPage(final DeviceManagementScriptUserStateCollectionResponse response, final IDeviceManagementScriptUserStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
