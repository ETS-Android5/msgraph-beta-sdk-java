// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MicrosoftTunnelConfiguration;
import com.microsoft.graph.requests.MicrosoftTunnelConfigurationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MicrosoftTunnelConfigurationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Configuration Collection Page.
 */
public class MicrosoftTunnelConfigurationCollectionPage extends BaseCollectionPage<MicrosoftTunnelConfiguration, MicrosoftTunnelConfigurationCollectionRequestBuilder> {

    /**
     * A collection page for MicrosoftTunnelConfiguration
     *
     * @param response the serialized MicrosoftTunnelConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelConfigurationCollectionPage(@Nonnull final MicrosoftTunnelConfigurationCollectionResponse response, @Nonnull final MicrosoftTunnelConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MicrosoftTunnelConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MicrosoftTunnelConfigurationCollectionPage(@Nonnull final java.util.List<MicrosoftTunnelConfiguration> pageContents, @Nullable final MicrosoftTunnelConfigurationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
