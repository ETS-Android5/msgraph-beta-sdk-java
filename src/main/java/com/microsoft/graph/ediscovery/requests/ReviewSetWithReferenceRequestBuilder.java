// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.ReviewSet;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.models.DataCollectionScope;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.ExportOptions;
import com.microsoft.graph.ediscovery.models.ExportFileStructure;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set With Reference Request Builder.
 */
public class ReviewSetWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<ReviewSet, ReviewSetWithReferenceRequest, ReviewSetReferenceRequestBuilder> {

    /**
     * The request builder for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReviewSetWithReferenceRequest.class, ReviewSetReferenceRequestBuilder.class);
    }
}
