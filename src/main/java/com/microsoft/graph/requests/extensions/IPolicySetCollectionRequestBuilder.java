// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.PolicySet;
import com.microsoft.graph.models.extensions.PolicySetItem;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPolicySetRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetCollectionRequest;
import com.microsoft.graph.requests.extensions.IPolicySetGetPolicySetsCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Policy Set Collection Request Builder.
 */
public interface IPolicySetCollectionRequestBuilder extends IRequestBuilder {

    IPolicySetCollectionRequest buildRequest();

    IPolicySetCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPolicySetRequestBuilder byId(final String id);


    IPolicySetGetPolicySetsCollectionRequestBuilder getPolicySets(final java.util.List<String> policySetIds);
}
