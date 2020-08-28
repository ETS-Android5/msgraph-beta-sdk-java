// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SynchronizationSchema;
import com.microsoft.graph.models.extensions.DirectoryDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Definition Collection Request.
 */
public interface IDirectoryDefinitionCollectionRequest {

    void get(final ICallback<IDirectoryDefinitionCollectionPage> callback);

    IDirectoryDefinitionCollectionPage get() throws ClientException;

    void post(final DirectoryDefinition newDirectoryDefinition, final ICallback<DirectoryDefinition> callback);

    DirectoryDefinition post(final DirectoryDefinition newDirectoryDefinition) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDirectoryDefinitionCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDirectoryDefinitionCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDirectoryDefinitionCollectionRequest top(final int value);

}
