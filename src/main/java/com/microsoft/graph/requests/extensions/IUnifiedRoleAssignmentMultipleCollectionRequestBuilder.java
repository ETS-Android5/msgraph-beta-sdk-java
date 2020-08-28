// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplicationMultiple;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentMultipleRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentMultipleCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Multiple Collection Request Builder.
 */
public interface IUnifiedRoleAssignmentMultipleCollectionRequestBuilder extends IRequestBuilder {

    IUnifiedRoleAssignmentMultipleCollectionRequest buildRequest();

    IUnifiedRoleAssignmentMultipleCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IUnifiedRoleAssignmentMultipleRequestBuilder byId(final String id);

}
