// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementExportJob;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Export Job Collection Page.
 */
public class DeviceManagementExportJobCollectionPage extends BaseCollectionPage<DeviceManagementExportJob, IDeviceManagementExportJobCollectionRequestBuilder> implements IDeviceManagementExportJobCollectionPage {

    /**
     * A collection page for DeviceManagementExportJob
     *
     * @param response the serialized DeviceManagementExportJobCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementExportJobCollectionPage(final DeviceManagementExportJobCollectionResponse response, final IDeviceManagementExportJobCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
