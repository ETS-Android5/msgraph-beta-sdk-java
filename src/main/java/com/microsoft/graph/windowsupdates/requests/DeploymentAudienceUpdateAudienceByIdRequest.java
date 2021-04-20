// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;
import com.microsoft.graph.windowsupdates.models.DeploymentAudience;
import com.microsoft.graph.windowsupdates.requests.DeploymentAudienceUpdateAudienceByIdRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.windowsupdates.models.DeploymentAudienceUpdateAudienceByIdParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Deployment Audience Update Audience By Id Request.
 */
public class DeploymentAudienceUpdateAudienceByIdRequest extends BaseRequest<Void> {
    /**
     * The request for this DeploymentAudienceUpdateAudienceById
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeploymentAudienceUpdateAudienceByIdRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
    }

	/** The body for the method */
    @Nullable
    public DeploymentAudienceUpdateAudienceByIdParameterSet body;
    /**
     * Creates the DeploymentAudienceUpdateAudienceById
     *
     * @return a future for the operation
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Void> postAsync() {
        return this.sendAsync(HttpMethod.POST, body);
    }

    /**
     * Creates the DeploymentAudienceUpdateAudienceById
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public void post() throws ClientException {
        this.send(HttpMethod.POST, body);
    }
}
