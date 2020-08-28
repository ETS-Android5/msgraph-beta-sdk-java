// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestMyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestMyCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request My Collection Page.
 */
public class AccessPackageAssignmentRequestMyCollectionPage extends BaseCollectionPage<AccessPackageAssignmentRequest, IAccessPackageAssignmentRequestMyCollectionRequestBuilder> implements IAccessPackageAssignmentRequestMyCollectionPage {

    /**
     * A collection page for AccessPackageAssignmentRequest.
     *
     * @param response The serialized AccessPackageAssignmentRequestMyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageAssignmentRequestMyCollectionPage(final AccessPackageAssignmentRequestMyCollectionResponse response, final IAccessPackageAssignmentRequestMyCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
