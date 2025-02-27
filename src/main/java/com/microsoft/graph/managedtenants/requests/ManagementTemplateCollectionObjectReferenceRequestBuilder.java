
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagementTemplateCollectionObject;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Collection Object Reference Request Builder.
 */
public class ManagementTemplateCollectionObjectReferenceRequestBuilder extends BaseReferenceRequestBuilder<ManagementTemplateCollectionObject, ManagementTemplateCollectionObjectReferenceRequest> {

    /**
     * The request builder for the ManagementTemplateCollectionObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementTemplateCollectionObjectReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementTemplateCollectionObjectReferenceRequest.class);
    }
}
