// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.GovernanceSchedule;
import com.microsoft.graph.models.GovernanceRoleAssignmentRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Request Update Request Parameter Set.
 */
public class GovernanceRoleAssignmentRequestUpdateRequestParameterSet {
    /**
     * The decision.
     * 
     */
    @SerializedName(value = "decision", alternate = {"Decision"})
    @Expose
	@Nullable
    public String decision;

    /**
     * The assignment State.
     * 
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
	@Nullable
    public String assignmentState;

    /**
     * The schedule.
     * 
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public GovernanceSchedule schedule;

    /**
     * The reason.
     * 
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
	@Nullable
    public String reason;


    /**
     * Instiaciates a new GovernanceRoleAssignmentRequestUpdateRequestParameterSet
     */
    public GovernanceRoleAssignmentRequestUpdateRequestParameterSet() {}
    /**
     * Instiaciates a new GovernanceRoleAssignmentRequestUpdateRequestParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GovernanceRoleAssignmentRequestUpdateRequestParameterSet(@Nonnull final GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder builder) {
        this.decision = builder.decision;
        this.assignmentState = builder.assignmentState;
        this.schedule = builder.schedule;
        this.reason = builder.reason;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder newBuilder() {
        return new GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder();
    }
    /**
     * Fluent builder for the GovernanceRoleAssignmentRequestUpdateRequestParameterSet
     */
    public static final class GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder {
        /**
         * The decision parameter value
         */
        @Nullable
        protected String decision;
        /**
         * Sets the Decision
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder withDecision(@Nullable final String val) {
            this.decision = val;
            return this;
        }
        /**
         * The assignmentState parameter value
         */
        @Nullable
        protected String assignmentState;
        /**
         * Sets the AssignmentState
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder withAssignmentState(@Nullable final String val) {
            this.assignmentState = val;
            return this;
        }
        /**
         * The schedule parameter value
         */
        @Nullable
        protected GovernanceSchedule schedule;
        /**
         * Sets the Schedule
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder withSchedule(@Nullable final GovernanceSchedule val) {
            this.schedule = val;
            return this;
        }
        /**
         * The reason parameter value
         */
        @Nullable
        protected String reason;
        /**
         * Sets the Reason
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder withReason(@Nullable final String val) {
            this.reason = val;
            return this;
        }
        /**
         * Instanciates a new GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder
         */
        @Nullable
        protected GovernanceRoleAssignmentRequestUpdateRequestParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GovernanceRoleAssignmentRequestUpdateRequestParameterSet build() {
            return new GovernanceRoleAssignmentRequestUpdateRequestParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.decision != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decision", decision));
        }
        if(this.assignmentState != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignmentState", assignmentState));
        }
        if(this.schedule != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("schedule", schedule));
        }
        if(this.reason != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("reason", reason));
        }
        return result;
    }
}
