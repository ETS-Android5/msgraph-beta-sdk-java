// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OutlookTask;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.models.AttachmentItem;
import com.microsoft.graph.models.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AttachmentRequestBuilder;
import com.microsoft.graph.requests.AttachmentCollectionRequest;
import com.microsoft.graph.requests.AttachmentCreateUploadSessionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.AttachmentCreateUploadSessionParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Collection Request Builder.
 */
public class AttachmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<Attachment, AttachmentRequestBuilder, AttachmentCollectionResponse, AttachmentCollectionPage, AttachmentCollectionRequest> {

    /**
     * The request builder for this collection of OutlookTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AttachmentRequestBuilder.class, AttachmentCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AttachmentCreateUploadSessionRequestBuilder createUploadSession(@Nonnull final AttachmentCreateUploadSessionParameterSet parameters) {
        return new AttachmentCreateUploadSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createUploadSession"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
