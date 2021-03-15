// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ConfigManagerPolicySummary;
import com.microsoft.graph.models.ConfigManagerCollection;
import com.microsoft.graph.requests.ConfigManagerCollectionGetPolicySummaryRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.ConfigManagerCollectionGetPolicySummaryParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Config Manager Collection Get Policy Summary Request.
 */
public class ConfigManagerCollectionGetPolicySummaryRequest extends BaseRequest<ConfigManagerPolicySummary> {
    /**
     * The request for this ConfigManagerCollectionGetPolicySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConfigManagerCollectionGetPolicySummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConfigManagerPolicySummary.class);
    }

    /**
     * Gets the ConfigManagerPolicySummary
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ConfigManagerPolicySummary
     *
     * @return the ConfigManagerPolicySummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ConfigManagerPolicySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ConfigManagerCollectionGetPolicySummaryRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ConfigManagerCollectionGetPolicySummaryRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
