// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Update Message Favorite Parameter Set.
 */
public class ServiceUpdateMessageFavoriteParameterSet {
    /**
     * The message Ids.
     * 
     */
    @SerializedName(value = "messageIds", alternate = {"MessageIds"})
    @Expose
	@Nullable
    public java.util.List<String> messageIds;


    /**
     * Instiaciates a new ServiceUpdateMessageFavoriteParameterSet
     */
    public ServiceUpdateMessageFavoriteParameterSet() {}
    /**
     * Instiaciates a new ServiceUpdateMessageFavoriteParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ServiceUpdateMessageFavoriteParameterSet(@Nonnull final ServiceUpdateMessageFavoriteParameterSetBuilder builder) {
        this.messageIds = builder.messageIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServiceUpdateMessageFavoriteParameterSetBuilder newBuilder() {
        return new ServiceUpdateMessageFavoriteParameterSetBuilder();
    }
    /**
     * Fluent builder for the ServiceUpdateMessageFavoriteParameterSet
     */
    public static final class ServiceUpdateMessageFavoriteParameterSetBuilder {
        /**
         * The messageIds parameter value
         */
        @Nullable
        protected java.util.List<String> messageIds;
        /**
         * Sets the MessageIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServiceUpdateMessageFavoriteParameterSetBuilder withMessageIds(@Nullable final java.util.List<String> val) {
            this.messageIds = val;
            return this;
        }
        /**
         * Instanciates a new ServiceUpdateMessageFavoriteParameterSetBuilder
         */
        @Nullable
        protected ServiceUpdateMessageFavoriteParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServiceUpdateMessageFavoriteParameterSet build() {
            return new ServiceUpdateMessageFavoriteParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.messageIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("messageIds", messageIds));
        }
        return result;
    }
}
