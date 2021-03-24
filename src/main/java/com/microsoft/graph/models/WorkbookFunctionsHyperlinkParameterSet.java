// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hyperlink Parameter Set.
 */
public class WorkbookFunctionsHyperlinkParameterSet {
    /**
     * The link Location.
     * 
     */
    @SerializedName(value = "linkLocation", alternate = {"LinkLocation"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement linkLocation;

    /**
     * The friendly Name.
     * 
     */
    @SerializedName(value = "friendlyName", alternate = {"FriendlyName"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement friendlyName;


    /**
     * Instiaciates a new WorkbookFunctionsHyperlinkParameterSet
     */
    public WorkbookFunctionsHyperlinkParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsHyperlinkParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsHyperlinkParameterSet(@Nonnull final WorkbookFunctionsHyperlinkParameterSetBuilder builder) {
        this.linkLocation = builder.linkLocation;
        this.friendlyName = builder.friendlyName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsHyperlinkParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsHyperlinkParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsHyperlinkParameterSet
     */
    public static final class WorkbookFunctionsHyperlinkParameterSetBuilder {
        /**
         * The linkLocation parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement linkLocation;
        /**
         * Sets the LinkLocation
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsHyperlinkParameterSetBuilder withLinkLocation(@Nullable final com.google.gson.JsonElement val) {
            this.linkLocation = val;
            return this;
        }
        /**
         * The friendlyName parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement friendlyName;
        /**
         * Sets the FriendlyName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsHyperlinkParameterSetBuilder withFriendlyName(@Nullable final com.google.gson.JsonElement val) {
            this.friendlyName = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsHyperlinkParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsHyperlinkParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsHyperlinkParameterSet build() {
            return new WorkbookFunctionsHyperlinkParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.linkLocation != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("linkLocation", linkLocation));
        }
        if(this.friendlyName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("friendlyName", friendlyName));
        }
        return result;
    }
}
