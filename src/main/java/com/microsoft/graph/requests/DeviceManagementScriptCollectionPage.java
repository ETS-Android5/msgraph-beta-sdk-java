// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementScript;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Collection Page.
 */
public class DeviceManagementScriptCollectionPage extends BaseCollectionPage<DeviceManagementScript, DeviceManagementScriptCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementScript
     *
     * @param response the serialized DeviceManagementScriptCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptCollectionPage(@Nonnull final DeviceManagementScriptCollectionResponse response, @Nonnull final DeviceManagementScriptCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementScript
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementScriptCollectionPage(@Nonnull final java.util.List<DeviceManagementScript> pageContents, @Nullable final DeviceManagementScriptCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
