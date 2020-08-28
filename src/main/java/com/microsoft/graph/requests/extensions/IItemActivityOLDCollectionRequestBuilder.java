// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemActivityOLD;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IItemActivityOLDRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityOLDCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity OLDCollection Request Builder.
 */
public interface IItemActivityOLDCollectionRequestBuilder extends IRequestBuilder {

    IItemActivityOLDCollectionRequest buildRequest();

    IItemActivityOLDCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IItemActivityOLDRequestBuilder byId(final String id);

}
