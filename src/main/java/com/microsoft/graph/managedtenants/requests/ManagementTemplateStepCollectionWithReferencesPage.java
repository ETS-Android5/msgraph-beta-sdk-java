// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagementTemplate;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStep;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionWithReferencesPage;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionResponse;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Step Collection With References Page.
 */
public class ManagementTemplateStepCollectionWithReferencesPage extends BaseCollectionPage<ManagementTemplateStep, ManagementTemplateStepCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for ManagementTemplateStep
     *
     * @param response the serialized ManagementTemplateStepCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagementTemplateStepCollectionWithReferencesPage(@Nonnull final ManagementTemplateStepCollectionResponse response, @Nullable final ManagementTemplateStepCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for ManagementTemplateStep
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagementTemplateStepCollectionWithReferencesPage(@Nonnull final java.util.List<ManagementTemplateStep> pageContents, @Nullable final ManagementTemplateStepCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
