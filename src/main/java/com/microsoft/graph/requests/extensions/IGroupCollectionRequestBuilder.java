// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.extensions.AssignedLicense;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequest;
import com.microsoft.graph.requests.extensions.IGroupEvaluateDynamicMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Collection Request Builder.
 */
public interface IGroupCollectionRequestBuilder extends IRequestBuilder {

    IGroupCollectionRequest buildRequest();

    IGroupCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IGroupRequestBuilder byId(final String id);

    IGroupEvaluateDynamicMembershipRequestBuilder evaluateDynamicMembership(final String memberId, final String membershipRule);

    IGroupDeltaCollectionRequestBuilder delta();

	IGroupDeltaCollectionRequestBuilder delta(final String deltaLink);
}
