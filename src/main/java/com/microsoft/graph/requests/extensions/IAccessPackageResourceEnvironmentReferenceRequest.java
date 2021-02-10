// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResourceEnvironment;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AccessPackageResourceEnvironment;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Environment Reference Request.
 */
public interface IAccessPackageResourceEnvironmentReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AccessPackageResourceEnvironment> callback);

    AccessPackageResourceEnvironment delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceEnvironmentReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceEnvironmentReferenceRequest expand(final String value);

    /**
     * Puts the AccessPackageResourceEnvironment
     *
     * @param srcAccessPackageResourceEnvironment the AccessPackageResourceEnvironment to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AccessPackageResourceEnvironment srcAccessPackageResourceEnvironment, final ICallback<? super AccessPackageResourceEnvironment> callback);

    /**
     * Puts the AccessPackageResourceEnvironment
     *
     * @param srcAccessPackageResourceEnvironment the AccessPackageResourceEnvironment to PUT
     * @return the AccessPackageResourceEnvironment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AccessPackageResourceEnvironment put(AccessPackageResourceEnvironment srcAccessPackageResourceEnvironment) throws ClientException;
}
