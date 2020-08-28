// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.extensions.AppLogCollectionRequest;
import com.microsoft.graph.models.extensions.AppLogCollectionDownloadDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Log Collection Request Collection Request.
 */
public interface IAppLogCollectionRequestCollectionRequest {

    void get(final ICallback<IAppLogCollectionRequestCollectionPage> callback);

    IAppLogCollectionRequestCollectionPage get() throws ClientException;

    void post(final AppLogCollectionRequest newAppLogCollectionRequest, final ICallback<AppLogCollectionRequest> callback);

    AppLogCollectionRequest post(final AppLogCollectionRequest newAppLogCollectionRequest) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppLogCollectionRequestCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppLogCollectionRequestCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAppLogCollectionRequestCollectionRequest top(final int value);

}
