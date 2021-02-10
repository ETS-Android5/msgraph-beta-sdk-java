// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Value Reference Request Builder.
 */
public interface IGroupPolicyDefinitionValueReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionValueReferenceRequest instance
     */
    IGroupPolicyDefinitionValueReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionValueReferenceRequest instance
     */
    IGroupPolicyDefinitionValueReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
