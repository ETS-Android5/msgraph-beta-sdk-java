// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.AccessPackageResourceRoleScope;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Role Scope Collection Request.
 */
public interface IAccessPackageResourceRoleScopeCollectionRequest {

    void get(final ICallback<IAccessPackageResourceRoleScopeCollectionPage> callback);

    IAccessPackageResourceRoleScopeCollectionPage get() throws ClientException;

    void post(final AccessPackageResourceRoleScope newAccessPackageResourceRoleScope, final ICallback<AccessPackageResourceRoleScope> callback);

    AccessPackageResourceRoleScope post(final AccessPackageResourceRoleScope newAccessPackageResourceRoleScope) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceRoleScopeCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceRoleScopeCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAccessPackageResourceRoleScopeCollectionRequest top(final int value);

}
