// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.Tag;
import com.microsoft.graph.ediscovery.requests.TagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.TagWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag Reference Request.
 */
public class TagReferenceRequest extends BaseReferenceRequest<Tag> {

    /**
     * The request for the Tag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TagReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Tag.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public TagReferenceRequest select(@Nonnull final String value) {
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
    public TagReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the Tag
     *
     * @param srcTag the Tag reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Tag> putAsync(@Nonnull final Tag srcTag) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/compliance/ediscovery/{id}/cases/{id}/tags/" + srcTag.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the Tag
     *
     * @param srcTag the Tag reference to PUT
     * @return the Tag
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Tag put(@Nonnull final Tag srcTag) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/compliance/ediscovery/{id}/cases/{id}/tags/" + srcTag.id));
        return send(HttpMethod.PUT, payload);
    }
}
