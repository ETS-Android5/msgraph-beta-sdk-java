// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.UserGetLoggedOnManagedDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.UserGetLoggedOnManagedDevicesCollectionPage;
import com.microsoft.graph.requests.UserGetLoggedOnManagedDevicesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Logged On Managed Devices Collection Page.
 */
public class UserGetLoggedOnManagedDevicesCollectionPage extends BaseCollectionPage<ManagedDevice, UserGetLoggedOnManagedDevicesCollectionRequestBuilder> {

    /**
     * A collection page for ManagedDevice.
     *
     * @param response The serialized UserGetLoggedOnManagedDevicesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetLoggedOnManagedDevicesCollectionPage(@Nonnull final UserGetLoggedOnManagedDevicesCollectionResponse response, @Nonnull final UserGetLoggedOnManagedDevicesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserGetLoggedOnManagedDevices
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserGetLoggedOnManagedDevicesCollectionPage(@Nonnull final java.util.List<ManagedDevice> pageContents, @Nullable final UserGetLoggedOnManagedDevicesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
