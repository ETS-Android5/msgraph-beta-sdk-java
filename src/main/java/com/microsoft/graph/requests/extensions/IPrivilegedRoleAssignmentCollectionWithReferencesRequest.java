// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Collection With References Request.
 */
public interface IPrivilegedRoleAssignmentCollectionWithReferencesRequest {

    void get(final ICallback<IPrivilegedRoleAssignmentCollectionWithReferencesPage> callback);

    IPrivilegedRoleAssignmentCollectionWithReferencesPage get() throws ClientException;

    IPrivilegedRoleAssignmentCollectionWithReferencesRequest expand(final String value);
    
    IPrivilegedRoleAssignmentCollectionWithReferencesRequest select(final String value);

    IPrivilegedRoleAssignmentCollectionWithReferencesRequest top(final int value);

}
