// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan With Reference Request.
 */
public interface IPlannerPlanWithReferenceRequest extends IHttpRequest {

    void post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload, final ICallback<? super PlannerPlan> callback);

    PlannerPlan post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super PlannerPlan> callback);

    PlannerPlan get() throws ClientException;

	void delete(final ICallback<? super PlannerPlan> callback);

	void delete() throws ClientException;

	void patch(final PlannerPlan sourcePlannerPlan, final ICallback<? super PlannerPlan> callback);

	PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException;

    IPlannerPlanWithReferenceRequest select(final String value);

    IPlannerPlanWithReferenceRequest expand(final String value);

}
