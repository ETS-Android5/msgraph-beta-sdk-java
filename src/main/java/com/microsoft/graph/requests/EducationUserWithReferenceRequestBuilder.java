// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.EducationRubricCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationRubricRequestBuilder;
import com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UserWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User With Reference Request Builder.
 */
public class EducationUserWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<EducationUser, EducationUserWithReferenceRequest, EducationUserReferenceRequestBuilder> {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUserWithReferenceRequest.class, EducationUserReferenceRequestBuilder.class);
    }
}
