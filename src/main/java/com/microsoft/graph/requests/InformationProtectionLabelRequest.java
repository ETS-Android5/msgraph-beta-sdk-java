// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InformationProtectionLabel;
import com.microsoft.graph.models.ContentInfo;
import com.microsoft.graph.models.LabelingOptions;
import com.microsoft.graph.models.InformationProtectionAction;
import com.microsoft.graph.models.ClassificationResult;
import com.microsoft.graph.models.DowngradeJustification;
import com.microsoft.graph.models.InformationProtectionContentLabel;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Request.
 * @deprecated This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs.
 */
@Deprecated
public class InformationProtectionLabelRequest extends BaseRequest<InformationProtectionLabel> {
	
    /**
     * The request for the InformationProtectionLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabel.class);
    }

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtectionLabel> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @return the InformationProtectionLabel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtectionLabel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtectionLabel> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public InformationProtectionLabel delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtectionLabel> patchAsync(@Nonnull final InformationProtectionLabel sourceInformationProtectionLabel) {
        return sendAsync(HttpMethod.PATCH, sourceInformationProtectionLabel);
    }

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @return the updated InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtectionLabel patch(@Nonnull final InformationProtectionLabel sourceInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.PATCH, sourceInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtectionLabel> postAsync(@Nonnull final InformationProtectionLabel newInformationProtectionLabel) {
        return sendAsync(HttpMethod.POST, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtectionLabel post(@Nonnull final InformationProtectionLabel newInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.POST, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtectionLabel> putAsync(@Nonnull final InformationProtectionLabel newInformationProtectionLabel) {
        return sendAsync(HttpMethod.PUT, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtectionLabel put(@Nonnull final InformationProtectionLabel newInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.PUT, newInformationProtectionLabel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public InformationProtectionLabelRequest select(@Nonnull final String value) {
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
     public InformationProtectionLabelRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

