// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RolePermission;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetEffectivePermissionsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementGetEffectivePermissionsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Effective Permissions Collection Page.
 */
public class DeviceManagementGetEffectivePermissionsCollectionPage extends BaseCollectionPage<String, IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder> implements IDeviceManagementGetEffectivePermissionsCollectionPage {

    /**
     * A collection page for String.
     *
     * @param response The serialized DeviceManagementGetEffectivePermissionsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementGetEffectivePermissionsCollectionPage(final DeviceManagementGetEffectivePermissionsCollectionResponse response, final IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
