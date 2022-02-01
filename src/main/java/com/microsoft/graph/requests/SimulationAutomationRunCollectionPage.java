// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.SimulationAutomationRun;
import com.microsoft.graph.requests.SimulationAutomationRunCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.SimulationAutomationRunCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Simulation Automation Run Collection Page.
 */
public class SimulationAutomationRunCollectionPage extends BaseCollectionPage<SimulationAutomationRun, SimulationAutomationRunCollectionRequestBuilder> {

    /**
     * A collection page for SimulationAutomationRun
     *
     * @param response the serialized SimulationAutomationRunCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SimulationAutomationRunCollectionPage(@Nonnull final SimulationAutomationRunCollectionResponse response, @Nonnull final SimulationAutomationRunCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SimulationAutomationRun
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SimulationAutomationRunCollectionPage(@Nonnull final java.util.List<SimulationAutomationRun> pageContents, @Nullable final SimulationAutomationRunCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
