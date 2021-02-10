// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MobileApp;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Reference Request Builder.
 */
public interface IMobileAppReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppReferenceRequest instance
     */
    IMobileAppReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppReferenceRequest instance
     */
    IMobileAppReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
