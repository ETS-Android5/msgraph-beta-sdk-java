// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IAddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IEstimateStatisticsOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Source Collection Reference Request Builder.
 */
public interface ISourceCollectionReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISourceCollectionReferenceRequest instance
     */
    ISourceCollectionReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISourceCollectionReferenceRequest instance
     */
    ISourceCollectionReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
