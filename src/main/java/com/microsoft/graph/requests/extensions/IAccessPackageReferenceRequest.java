// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Reference Request.
 */
public interface IAccessPackageReferenceRequest extends IHttpRequest {

    void delete(final ICallback<AccessPackage> callback);

    AccessPackage delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageReferenceRequest expand(final String value);

    /**
     * Puts the AccessPackage
     *
     * @param srcAccessPackage the AccessPackage to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AccessPackage srcAccessPackage, final ICallback<AccessPackage> callback);

    /**
     * Puts the AccessPackage
     *
     * @param srcAccessPackage the AccessPackage to PUT
     * @return the AccessPackage
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AccessPackage put(AccessPackage srcAccessPackage) throws ClientException;
}
