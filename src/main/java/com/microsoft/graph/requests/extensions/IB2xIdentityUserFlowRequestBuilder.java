// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.B2xIdentityUserFlow;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the B2x Identity User Flow Request Builder.
 */
public interface IB2xIdentityUserFlowRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IB2xIdentityUserFlowRequest instance
     */
    IB2xIdentityUserFlowRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IB2xIdentityUserFlowRequest instance
     */
    IB2xIdentityUserFlowRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IIdentityProviderCollectionWithReferencesRequestBuilder identityProviders();

    IIdentityProviderWithReferenceRequestBuilder identityProviders(final String id);

    IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder userAttributeAssignments();

    IIdentityUserFlowAttributeAssignmentRequestBuilder userAttributeAssignments(final String id);

}