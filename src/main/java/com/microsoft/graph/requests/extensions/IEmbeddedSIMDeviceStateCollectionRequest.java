// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePool;
import com.microsoft.graph.models.extensions.EmbeddedSIMDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Embedded SIMDevice State Collection Request.
 */
public interface IEmbeddedSIMDeviceStateCollectionRequest {

    void get(final ICallback<IEmbeddedSIMDeviceStateCollectionPage> callback);

    IEmbeddedSIMDeviceStateCollectionPage get() throws ClientException;

    void post(final EmbeddedSIMDeviceState newEmbeddedSIMDeviceState, final ICallback<EmbeddedSIMDeviceState> callback);

    EmbeddedSIMDeviceState post(final EmbeddedSIMDeviceState newEmbeddedSIMDeviceState) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmbeddedSIMDeviceStateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmbeddedSIMDeviceStateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IEmbeddedSIMDeviceStateCollectionRequest top(final int value);

}
