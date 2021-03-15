// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.models.DriveItemUploadableProperties;
import com.microsoft.graph.models.UploadSession;
import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.graph.models.Permission;
import com.microsoft.graph.models.ItemPreviewInfo;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.DriveItemCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DriveItemRestoreParameterSet;
import com.microsoft.graph.models.DriveItemCopyParameterSet;
import com.microsoft.graph.models.DriveItemCreateUploadSessionParameterSet;
import com.microsoft.graph.models.DriveItemCheckinParameterSet;
import com.microsoft.graph.models.DriveItemCreateLinkParameterSet;
import com.microsoft.graph.models.DriveItemInviteParameterSet;
import com.microsoft.graph.models.DriveItemPreviewParameterSet;
import com.microsoft.graph.models.DriveItemValidatePermissionParameterSet;
import com.microsoft.graph.models.DriveItemDeltaParameterSet;
import com.microsoft.graph.models.DriveItemGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.models.DriveItemSearchParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Collection Request Builder.
 */
public class DriveItemCollectionRequestBuilder extends BaseCollectionRequestBuilder<DriveItem, DriveItemRequestBuilder, DriveItemCollectionResponse, DriveItemCollectionPage, DriveItemCollectionRequest> {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemRequestBuilder.class, DriveItemCollectionRequest.class);
    }

    /**
     * Gets a request builder to the AppRoot folder.
     * @return a request builder to the AppRoot folder
     */
    @Nonnull
    public DriveItemRequestBuilder appRoot() {
    	return new DriveItemRequestBuilder(this.getRequestUrlWithAdditionalSegment("approot"), this.getClient(), null);
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
