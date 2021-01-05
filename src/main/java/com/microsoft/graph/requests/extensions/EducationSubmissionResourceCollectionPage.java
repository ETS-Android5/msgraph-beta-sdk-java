// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSubmissionResource;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission Resource Collection Page.
 */
public class EducationSubmissionResourceCollectionPage extends BaseCollectionPage<EducationSubmissionResource, IEducationSubmissionResourceCollectionRequestBuilder> implements IEducationSubmissionResourceCollectionPage {

    /**
     * A collection page for EducationSubmissionResource
     *
     * @param response the serialized EducationSubmissionResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSubmissionResourceCollectionPage(final EducationSubmissionResourceCollectionResponse response, final IEducationSubmissionResourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
