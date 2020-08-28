// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemActivityOLD;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity OLDCollection Request.
 */
public interface IItemActivityOLDCollectionRequest {

    void get(final ICallback<IItemActivityOLDCollectionPage> callback);

    IItemActivityOLDCollectionPage get() throws ClientException;

    void post(final ItemActivityOLD newItemActivityOLD, final ICallback<ItemActivityOLD> callback);

    ItemActivityOLD post(final ItemActivityOLD newItemActivityOLD) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemActivityOLDCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemActivityOLDCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IItemActivityOLDCollectionRequest top(final int value);

}
