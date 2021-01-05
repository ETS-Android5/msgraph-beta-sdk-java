// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Lob App Provisioning Configuration Collection Request Builder.
 */
public interface IIosLobAppProvisioningConfigurationCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IIosLobAppProvisioningConfigurationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IIosLobAppProvisioningConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IIosLobAppProvisioningConfigurationRequestBuilder byId(final String id);


    IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(final java.util.List<String> payloadIds);
}
