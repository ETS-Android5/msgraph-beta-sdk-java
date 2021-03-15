// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceHealthScript;
import com.microsoft.graph.requests.DeviceHealthScriptCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceHealthScriptCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Collection Page.
 */
public class DeviceHealthScriptCollectionPage extends BaseCollectionPage<DeviceHealthScript, DeviceHealthScriptCollectionRequestBuilder> {

    /**
     * A collection page for DeviceHealthScript
     *
     * @param response the serialized DeviceHealthScriptCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceHealthScriptCollectionPage(@Nonnull final DeviceHealthScriptCollectionResponse response, @Nonnull final DeviceHealthScriptCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceHealthScript
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceHealthScriptCollectionPage(@Nonnull final java.util.List<DeviceHealthScript> pageContents, @Nullable final DeviceHealthScriptCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
