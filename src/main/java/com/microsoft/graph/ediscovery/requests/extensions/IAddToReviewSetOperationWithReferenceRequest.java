// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.AddToReviewSetOperation;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ISourceCollectionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.AddToReviewSetOperation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Add To Review Set Operation With Reference Request.
 */
public interface IAddToReviewSetOperationWithReferenceRequest extends IHttpRequest {

    void post(final AddToReviewSetOperation newAddToReviewSetOperation, final IJsonBackedObject payload, final ICallback<? super AddToReviewSetOperation> callback);

    AddToReviewSetOperation post(final AddToReviewSetOperation newAddToReviewSetOperation, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AddToReviewSetOperation> callback);

    AddToReviewSetOperation get() throws ClientException;

	void delete(final ICallback<? super AddToReviewSetOperation> callback);

	void delete() throws ClientException;

	void patch(final AddToReviewSetOperation sourceAddToReviewSetOperation, final ICallback<? super AddToReviewSetOperation> callback);

	AddToReviewSetOperation patch(final AddToReviewSetOperation sourceAddToReviewSetOperation) throws ClientException;

    IAddToReviewSetOperationWithReferenceRequest select(final String value);

    IAddToReviewSetOperationWithReferenceRequest expand(final String value);

}
