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
 * The class for the Event Cancel Parameter Set.
 */
public class EventCancelParameterSet {
    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new EventCancelParameterSet
     */
    public EventCancelParameterSet() {}
    /**
     * Instiaciates a new EventCancelParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected EventCancelParameterSet(@Nonnull final EventCancelParameterSetBuilder builder) {
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static EventCancelParameterSetBuilder newBuilder() {
        return new EventCancelParameterSetBuilder();
    }
    /**
     * Fluent builder for the EventCancelParameterSet
     */
    public static final class EventCancelParameterSetBuilder {
        /**
         * The comment parameter value
         */
        @Nullable
        protected String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventCancelParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * Instanciates a new EventCancelParameterSetBuilder
         */
        @Nullable
        protected EventCancelParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public EventCancelParameterSet build() {
            return new EventCancelParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        return result;
    }
}
