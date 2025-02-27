// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TimeSlot;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request Tentatively Accept Parameter Set.
 */
public class EventMessageRequestTentativelyAcceptParameterSet {
    /**
     * The proposed New Time.
     * 
     */
    @SerializedName(value = "proposedNewTime", alternate = {"ProposedNewTime"})
    @Expose
	@Nullable
    public TimeSlot proposedNewTime;

    /**
     * The send Response.
     * 
     */
    @SerializedName(value = "sendResponse", alternate = {"SendResponse"})
    @Expose
	@Nullable
    public Boolean sendResponse;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new EventMessageRequestTentativelyAcceptParameterSet
     */
    public EventMessageRequestTentativelyAcceptParameterSet() {}
    /**
     * Instiaciates a new EventMessageRequestTentativelyAcceptParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected EventMessageRequestTentativelyAcceptParameterSet(@Nonnull final EventMessageRequestTentativelyAcceptParameterSetBuilder builder) {
        this.proposedNewTime = builder.proposedNewTime;
        this.sendResponse = builder.sendResponse;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static EventMessageRequestTentativelyAcceptParameterSetBuilder newBuilder() {
        return new EventMessageRequestTentativelyAcceptParameterSetBuilder();
    }
    /**
     * Fluent builder for the EventMessageRequestTentativelyAcceptParameterSet
     */
    public static final class EventMessageRequestTentativelyAcceptParameterSetBuilder {
        /**
         * The proposedNewTime parameter value
         */
        @Nullable
        protected TimeSlot proposedNewTime;
        /**
         * Sets the ProposedNewTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventMessageRequestTentativelyAcceptParameterSetBuilder withProposedNewTime(@Nullable final TimeSlot val) {
            this.proposedNewTime = val;
            return this;
        }
        /**
         * The sendResponse parameter value
         */
        @Nullable
        protected Boolean sendResponse;
        /**
         * Sets the SendResponse
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventMessageRequestTentativelyAcceptParameterSetBuilder withSendResponse(@Nullable final Boolean val) {
            this.sendResponse = val;
            return this;
        }
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
        public EventMessageRequestTentativelyAcceptParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * Instanciates a new EventMessageRequestTentativelyAcceptParameterSetBuilder
         */
        @Nullable
        protected EventMessageRequestTentativelyAcceptParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public EventMessageRequestTentativelyAcceptParameterSet build() {
            return new EventMessageRequestTentativelyAcceptParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.proposedNewTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("proposedNewTime", proposedNewTime));
        }
        if(this.sendResponse != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sendResponse", sendResponse));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        return result;
    }
}
