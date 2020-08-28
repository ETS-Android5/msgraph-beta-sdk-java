// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.models.extensions.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequest;
import com.microsoft.graph.requests.extensions.IEducationClassDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Class Collection Request Builder.
 */
public interface IEducationClassCollectionRequestBuilder extends IRequestBuilder {

    IEducationClassCollectionRequest buildRequest();

    IEducationClassCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IEducationClassRequestBuilder byId(final String id);


    IEducationClassDeltaCollectionRequestBuilder delta();

	IEducationClassDeltaCollectionRequestBuilder delta(final String deltaLink);
}
