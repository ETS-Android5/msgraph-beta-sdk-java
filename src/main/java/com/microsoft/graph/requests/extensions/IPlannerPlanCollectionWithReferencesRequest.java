// Template Source: IBaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerRoster;
import com.microsoft.graph.models.extensions.PlannerPlan;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan Collection With References Request.
 */
public interface IPlannerPlanCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IPlannerPlanCollectionWithReferencesPage> callback);

    IPlannerPlanCollectionWithReferencesPage get() throws ClientException;

    IPlannerPlanCollectionWithReferencesRequest expand(final String value);
    
    IPlannerPlanCollectionWithReferencesRequest select(final String value);

    IPlannerPlanCollectionWithReferencesRequest top(final int value);

}
