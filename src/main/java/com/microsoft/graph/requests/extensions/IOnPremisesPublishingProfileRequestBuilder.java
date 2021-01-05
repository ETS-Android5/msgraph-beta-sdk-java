// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the On Premises Publishing Profile Request Builder.
 */
public interface IOnPremisesPublishingProfileRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOnPremisesPublishingProfileRequest instance
     */
    IOnPremisesPublishingProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOnPremisesPublishingProfileRequest instance
     */
    IOnPremisesPublishingProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IOnPremisesAgentGroupCollectionRequestBuilder agentGroups();

    IOnPremisesAgentGroupRequestBuilder agentGroups(final String id);

    IOnPremisesAgentCollectionRequestBuilder agents();

    IOnPremisesAgentRequestBuilder agents(final String id);

    IConnectorGroupCollectionRequestBuilder connectorGroups();

    IConnectorGroupRequestBuilder connectorGroups(final String id);

    IConnectorCollectionRequestBuilder connectors();

    IConnectorRequestBuilder connectors(final String id);

    IPublishedResourceCollectionRequestBuilder publishedResources();

    IPublishedResourceRequestBuilder publishedResources(final String id);

}