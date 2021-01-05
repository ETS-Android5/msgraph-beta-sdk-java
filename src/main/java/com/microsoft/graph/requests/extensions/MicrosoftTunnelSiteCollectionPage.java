// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelSite;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Site Collection Page.
 */
public class MicrosoftTunnelSiteCollectionPage extends BaseCollectionPage<MicrosoftTunnelSite, IMicrosoftTunnelSiteCollectionRequestBuilder> implements IMicrosoftTunnelSiteCollectionPage {

    /**
     * A collection page for MicrosoftTunnelSite
     *
     * @param response the serialized MicrosoftTunnelSiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelSiteCollectionPage(final MicrosoftTunnelSiteCollectionResponse response, final IMicrosoftTunnelSiteCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
