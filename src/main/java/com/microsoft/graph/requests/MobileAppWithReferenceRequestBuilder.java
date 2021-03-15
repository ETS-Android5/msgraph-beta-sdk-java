// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MobileApp;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.MobileAppRelationshipState;
import com.microsoft.graph.requests.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallSummaryRequestBuilder;
import com.microsoft.graph.requests.MobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.UserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.UserAppInstallStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App With Reference Request Builder.
 */
public class MobileAppWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<MobileApp, MobileAppWithReferenceRequest, MobileAppReferenceRequestBuilder> {

    /**
     * The request builder for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppWithReferenceRequest.class, MobileAppReferenceRequestBuilder.class);
    }
}
