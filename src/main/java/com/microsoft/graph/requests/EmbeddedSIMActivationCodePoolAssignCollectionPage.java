// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmbeddedSIMActivationCodePoolAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignCollectionPage;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Assign Collection Page.
 */
public class EmbeddedSIMActivationCodePoolAssignCollectionPage extends BaseCollectionPage<EmbeddedSIMActivationCodePoolAssignment, EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder> {

    /**
     * A collection page for EmbeddedSIMActivationCodePoolAssignment.
     *
     * @param response The serialized EmbeddedSIMActivationCodePoolAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public EmbeddedSIMActivationCodePoolAssignCollectionPage(@Nonnull final EmbeddedSIMActivationCodePoolAssignCollectionResponse response, @Nonnull final EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for EmbeddedSIMActivationCodePoolAssign
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EmbeddedSIMActivationCodePoolAssignCollectionPage(@Nonnull final java.util.List<EmbeddedSIMActivationCodePoolAssignment> pageContents, @Nullable final EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
