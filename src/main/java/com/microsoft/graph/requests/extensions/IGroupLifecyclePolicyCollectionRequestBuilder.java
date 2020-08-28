// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRenewGroupRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Lifecycle Policy Collection Request Builder.
 */
public interface IGroupLifecyclePolicyCollectionRequestBuilder extends IRequestBuilder {

    IGroupLifecyclePolicyCollectionRequest buildRequest();

    IGroupLifecyclePolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IGroupLifecyclePolicyRequestBuilder byId(final String id);

    IGroupLifecyclePolicyRenewGroupRequestBuilder renewGroup(final String groupId);
}
