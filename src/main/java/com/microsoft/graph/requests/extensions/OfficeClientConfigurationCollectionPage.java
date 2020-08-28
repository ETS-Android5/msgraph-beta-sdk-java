// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Collection Page.
 */
public class OfficeClientConfigurationCollectionPage extends BaseCollectionPage<OfficeClientConfiguration, IOfficeClientConfigurationCollectionRequestBuilder> implements IOfficeClientConfigurationCollectionPage {

    /**
     * A collection page for OfficeClientConfiguration
     *
     * @param response the serialized OfficeClientConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OfficeClientConfigurationCollectionPage(final OfficeClientConfigurationCollectionResponse response, final IOfficeClientConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
