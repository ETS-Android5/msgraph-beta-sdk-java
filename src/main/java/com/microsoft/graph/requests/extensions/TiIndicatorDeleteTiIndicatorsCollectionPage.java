// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TiIndicatorDeleteTiIndicatorsCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorDeleteTiIndicatorsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Delete Ti Indicators Collection Page.
 */
public class TiIndicatorDeleteTiIndicatorsCollectionPage extends BaseCollectionPage<ResultInfo, ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder> implements ITiIndicatorDeleteTiIndicatorsCollectionPage {

    /**
     * A collection page for ResultInfo.
     *
     * @param response The serialized TiIndicatorDeleteTiIndicatorsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TiIndicatorDeleteTiIndicatorsCollectionPage(final TiIndicatorDeleteTiIndicatorsCollectionResponse response, final ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
