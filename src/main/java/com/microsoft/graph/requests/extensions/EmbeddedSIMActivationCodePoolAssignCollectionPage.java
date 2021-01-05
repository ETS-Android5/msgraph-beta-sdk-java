// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePoolAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignCollectionPage;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Assign Collection Page.
 */
public class EmbeddedSIMActivationCodePoolAssignCollectionPage extends BaseCollectionPage<EmbeddedSIMActivationCodePoolAssignment, IEmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder> implements IEmbeddedSIMActivationCodePoolAssignCollectionPage {

    /**
     * A collection page for EmbeddedSIMActivationCodePoolAssignment.
     *
     * @param response The serialized EmbeddedSIMActivationCodePoolAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public EmbeddedSIMActivationCodePoolAssignCollectionPage(final EmbeddedSIMActivationCodePoolAssignCollectionResponse response, final IEmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
