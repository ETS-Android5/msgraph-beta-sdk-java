// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationHasPayloadLinksCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Has Payload Links Collection Page.
 */
public class DeviceConfigurationHasPayloadLinksCollectionPage extends BaseCollectionPage<HasPayloadLinkResultItem, DeviceConfigurationHasPayloadLinksCollectionRequestBuilder> {

    /**
     * A collection page for HasPayloadLinkResultItem.
     *
     * @param response The serialized DeviceConfigurationHasPayloadLinksCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceConfigurationHasPayloadLinksCollectionPage(@Nonnull final DeviceConfigurationHasPayloadLinksCollectionResponse response, @Nonnull final DeviceConfigurationHasPayloadLinksCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceConfigurationHasPayloadLinks
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationHasPayloadLinksCollectionPage(@Nonnull final java.util.List<HasPayloadLinkResultItem> pageContents, @Nullable final DeviceConfigurationHasPayloadLinksCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
