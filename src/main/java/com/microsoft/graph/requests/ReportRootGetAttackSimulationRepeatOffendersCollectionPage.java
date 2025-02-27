// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationRepeatOffender;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetAttackSimulationRepeatOffendersCollectionPage;
import com.microsoft.graph.requests.ReportRootGetAttackSimulationRepeatOffendersCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Attack Simulation Repeat Offenders Collection Page.
 */
public class ReportRootGetAttackSimulationRepeatOffendersCollectionPage extends BaseCollectionPage<AttackSimulationRepeatOffender, ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder> {

    /**
     * A collection page for AttackSimulationRepeatOffender.
     *
     * @param response The serialized ReportRootGetAttackSimulationRepeatOffendersCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetAttackSimulationRepeatOffendersCollectionPage(@Nonnull final ReportRootGetAttackSimulationRepeatOffendersCollectionResponse response, @Nonnull final ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetAttackSimulationRepeatOffenders
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetAttackSimulationRepeatOffendersCollectionPage(@Nonnull final java.util.List<AttackSimulationRepeatOffender> pageContents, @Nullable final ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
