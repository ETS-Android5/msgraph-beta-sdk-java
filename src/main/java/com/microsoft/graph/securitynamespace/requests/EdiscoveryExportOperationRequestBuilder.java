// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryExportOperation;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetQueryWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Export Operation Request Builder.
 */
public class EdiscoveryExportOperationRequestBuilder extends BaseRequestBuilder<EdiscoveryExportOperation> {

    /**
     * The request builder for the EdiscoveryExportOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryExportOperationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryExportOperationRequest instance
     */
    @Nonnull
    public EdiscoveryExportOperationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryExportOperationRequest instance
     */
    @Nonnull
    public EdiscoveryExportOperationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.EdiscoveryExportOperationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for EdiscoveryReviewSet
     *
     * @return the EdiscoveryReviewSetWithReferenceRequestBuilder instance
     */
    @Nonnull
    public EdiscoveryReviewSetWithReferenceRequestBuilder reviewSet() {
        return new EdiscoveryReviewSetWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSet"), getClient(), null);
    }

    /**
     * Gets the request builder for EdiscoveryReviewSetQuery
     *
     * @return the EdiscoveryReviewSetQueryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public EdiscoveryReviewSetQueryWithReferenceRequestBuilder reviewSetQuery() {
        return new EdiscoveryReviewSetQueryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSetQuery"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryExportOperationGetDownloadUrlRequestBuilder getDownloadUrl() {
        return new EdiscoveryExportOperationGetDownloadUrlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.getDownloadUrl"), getClient(), null);
    }
}
