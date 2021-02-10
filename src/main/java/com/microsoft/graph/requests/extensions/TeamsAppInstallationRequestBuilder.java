// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.requests.extensions.ITeamsAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Installation Request Builder.
 */
public class TeamsAppInstallationRequestBuilder extends BaseRequestBuilder implements ITeamsAppInstallationRequestBuilder {

    /**
     * The request builder for the TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppInstallationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppInstallationRequest instance
     */
    public ITeamsAppInstallationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppInstallationRequest instance
     */
    public ITeamsAppInstallationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TeamsAppInstallationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for TeamsApp
     *
     * @return the ITeamsAppWithReferenceRequestBuilder instance
     */
    public ITeamsAppWithReferenceRequestBuilder teamsApp() {
        return new TeamsAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teamsApp"), getClient(), null);
    }

    /**
     * Gets the request builder for TeamsAppDefinition
     *
     * @return the ITeamsAppDefinitionWithReferenceRequestBuilder instance
     */
    public ITeamsAppDefinitionWithReferenceRequestBuilder teamsAppDefinition() {
        return new TeamsAppDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teamsAppDefinition"), getClient(), null);
    }

    public ITeamsAppInstallationUpgradeRequestBuilder upgrade() {
        return new TeamsAppInstallationUpgradeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.upgrade"), getClient(), null);
    }
}
