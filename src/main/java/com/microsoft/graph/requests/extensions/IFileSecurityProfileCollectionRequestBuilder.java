// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IFileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the File Security Profile Collection Request Builder.
 */
public interface IFileSecurityProfileCollectionRequestBuilder extends IRequestBuilder {

    IFileSecurityProfileCollectionRequest buildRequest();

    IFileSecurityProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IFileSecurityProfileRequestBuilder byId(final String id);

}
