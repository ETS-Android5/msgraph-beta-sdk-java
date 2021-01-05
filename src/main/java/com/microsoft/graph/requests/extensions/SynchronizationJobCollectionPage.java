// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.requests.extensions.ISynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Collection Page.
 */
public class SynchronizationJobCollectionPage extends BaseCollectionPage<SynchronizationJob, ISynchronizationJobCollectionRequestBuilder> implements ISynchronizationJobCollectionPage {

    /**
     * A collection page for SynchronizationJob
     *
     * @param response the serialized SynchronizationJobCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SynchronizationJobCollectionPage(final SynchronizationJobCollectionResponse response, final ISynchronizationJobCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
