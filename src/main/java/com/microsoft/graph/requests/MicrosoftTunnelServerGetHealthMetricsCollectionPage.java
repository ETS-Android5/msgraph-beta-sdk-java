// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.KeyLongValuePair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricsCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricsCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Get Health Metrics Collection Page.
 */
public class MicrosoftTunnelServerGetHealthMetricsCollectionPage extends BaseCollectionPage<KeyLongValuePair, MicrosoftTunnelServerGetHealthMetricsCollectionRequestBuilder> {

    /**
     * A collection page for KeyLongValuePair.
     *
     * @param response The serialized MicrosoftTunnelServerGetHealthMetricsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public MicrosoftTunnelServerGetHealthMetricsCollectionPage(@Nonnull final MicrosoftTunnelServerGetHealthMetricsCollectionResponse response, @Nonnull final MicrosoftTunnelServerGetHealthMetricsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for MicrosoftTunnelServerGetHealthMetrics
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MicrosoftTunnelServerGetHealthMetricsCollectionPage(@Nonnull final java.util.List<KeyLongValuePair> pageContents, @Nullable final MicrosoftTunnelServerGetHealthMetricsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
