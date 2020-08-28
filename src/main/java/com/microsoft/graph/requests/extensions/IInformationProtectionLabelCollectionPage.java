// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtectionPolicy;
import com.microsoft.graph.models.extensions.InformationProtectionLabel;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.InformationProtectionContentLabel;
import com.microsoft.graph.models.extensions.LabelingOptions;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.ClassificationResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.requests.extensions.IInformationProtectionLabelCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Label Collection Page.
 */
public interface IInformationProtectionLabelCollectionPage extends IBaseCollectionPage<InformationProtectionLabel, IInformationProtectionLabelCollectionRequestBuilder> {
}
