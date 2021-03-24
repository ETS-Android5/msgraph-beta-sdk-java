// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Has Payload Links Parameter Set.
 */
public class MobileAppHasPayloadLinksParameterSet {
    /**
     * The payload Ids.
     * 
     */
    @SerializedName(value = "payloadIds", alternate = {"PayloadIds"})
    @Expose
	@Nullable
    public java.util.List<String> payloadIds;


    /**
     * Instiaciates a new MobileAppHasPayloadLinksParameterSet
     */
    public MobileAppHasPayloadLinksParameterSet() {}
    /**
     * Instiaciates a new MobileAppHasPayloadLinksParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MobileAppHasPayloadLinksParameterSet(@Nonnull final MobileAppHasPayloadLinksParameterSetBuilder builder) {
        this.payloadIds = builder.payloadIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MobileAppHasPayloadLinksParameterSetBuilder newBuilder() {
        return new MobileAppHasPayloadLinksParameterSetBuilder();
    }
    /**
     * Fluent builder for the MobileAppHasPayloadLinksParameterSet
     */
    public static final class MobileAppHasPayloadLinksParameterSetBuilder {
        /**
         * The payloadIds parameter value
         */
        @Nullable
        protected java.util.List<String> payloadIds;
        /**
         * Sets the PayloadIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppHasPayloadLinksParameterSetBuilder withPayloadIds(@Nullable final java.util.List<String> val) {
            this.payloadIds = val;
            return this;
        }
        /**
         * Instanciates a new MobileAppHasPayloadLinksParameterSetBuilder
         */
        @Nullable
        protected MobileAppHasPayloadLinksParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MobileAppHasPayloadLinksParameterSet build() {
            return new MobileAppHasPayloadLinksParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.payloadIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("payloadIds", payloadIds));
        }
        return result;
    }
}
