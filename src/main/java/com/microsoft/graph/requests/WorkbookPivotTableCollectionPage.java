// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookPivotTable;
import com.microsoft.graph.requests.WorkbookPivotTableCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WorkbookPivotTableCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Collection Page.
 */
public class WorkbookPivotTableCollectionPage extends BaseCollectionPage<WorkbookPivotTable, WorkbookPivotTableCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookPivotTable
     *
     * @param response the serialized WorkbookPivotTableCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookPivotTableCollectionPage(@Nonnull final WorkbookPivotTableCollectionResponse response, @Nonnull final WorkbookPivotTableCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookPivotTable
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookPivotTableCollectionPage(@Nonnull final java.util.List<WorkbookPivotTable> pageContents, @Nullable final WorkbookPivotTableCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
