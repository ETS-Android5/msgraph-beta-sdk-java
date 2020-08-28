// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Collection Page.
 */
public class DeviceManagementDerivedCredentialSettingsCollectionPage extends BaseCollectionPage<DeviceManagementDerivedCredentialSettings, IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder> implements IDeviceManagementDerivedCredentialSettingsCollectionPage {

    /**
     * A collection page for DeviceManagementDerivedCredentialSettings
     *
     * @param response the serialized DeviceManagementDerivedCredentialSettingsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementDerivedCredentialSettingsCollectionPage(final DeviceManagementDerivedCredentialSettingsCollectionResponse response, final IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
