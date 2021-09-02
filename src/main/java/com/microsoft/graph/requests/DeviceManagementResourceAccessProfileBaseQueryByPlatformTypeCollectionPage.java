// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PolicyPlatformType;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionPage;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Base Query By Platform Type Collection Page.
 */
public class DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionPage extends BaseCollectionPage<DeviceManagementResourceAccessProfileBase, DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementResourceAccessProfileBase.
     *
     * @param response The serialized DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionPage(@Nonnull final DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionResponse response, @Nonnull final DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceManagementResourceAccessProfileBaseQueryByPlatformType
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionPage(@Nonnull final java.util.List<DeviceManagementResourceAccessProfileBase> pageContents, @Nullable final DeviceManagementResourceAccessProfileBaseQueryByPlatformTypeCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
