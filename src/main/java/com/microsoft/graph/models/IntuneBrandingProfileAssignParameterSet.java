// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.IntuneBrandingProfileAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Assign Parameter Set.
 */
public class IntuneBrandingProfileAssignParameterSet {
    /**
     * The assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public java.util.List<IntuneBrandingProfileAssignment> assignments;


    /**
     * Instiaciates a new IntuneBrandingProfileAssignParameterSet
     */
    public IntuneBrandingProfileAssignParameterSet() {}
    /**
     * Instiaciates a new IntuneBrandingProfileAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected IntuneBrandingProfileAssignParameterSet(@Nonnull final IntuneBrandingProfileAssignParameterSetBuilder builder) {
        this.assignments = builder.assignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static IntuneBrandingProfileAssignParameterSetBuilder newBuilder() {
        return new IntuneBrandingProfileAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the IntuneBrandingProfileAssignParameterSet
     */
    public static final class IntuneBrandingProfileAssignParameterSetBuilder {
        /**
         * The assignments parameter value
         */
        @Nullable
        protected java.util.List<IntuneBrandingProfileAssignment> assignments;
        /**
         * Sets the Assignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public IntuneBrandingProfileAssignParameterSetBuilder withAssignments(@Nullable final java.util.List<IntuneBrandingProfileAssignment> val) {
            this.assignments = val;
            return this;
        }
        /**
         * Instanciates a new IntuneBrandingProfileAssignParameterSetBuilder
         */
        @Nullable
        protected IntuneBrandingProfileAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public IntuneBrandingProfileAssignParameterSet build() {
            return new IntuneBrandingProfileAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.assignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignments", assignments));
        }
        return result;
    }
}
