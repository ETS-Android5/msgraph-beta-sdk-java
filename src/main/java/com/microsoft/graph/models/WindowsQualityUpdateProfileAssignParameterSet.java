// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsQualityUpdateProfileAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Assign Parameter Set.
 */
public class WindowsQualityUpdateProfileAssignParameterSet {
    /**
     * The assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public java.util.List<WindowsQualityUpdateProfileAssignment> assignments;


    /**
     * Instiaciates a new WindowsQualityUpdateProfileAssignParameterSet
     */
    public WindowsQualityUpdateProfileAssignParameterSet() {}
    /**
     * Instiaciates a new WindowsQualityUpdateProfileAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WindowsQualityUpdateProfileAssignParameterSet(@Nonnull final WindowsQualityUpdateProfileAssignParameterSetBuilder builder) {
        this.assignments = builder.assignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WindowsQualityUpdateProfileAssignParameterSetBuilder newBuilder() {
        return new WindowsQualityUpdateProfileAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the WindowsQualityUpdateProfileAssignParameterSet
     */
    public static final class WindowsQualityUpdateProfileAssignParameterSetBuilder {
        /**
         * The assignments parameter value
         */
        @Nullable
        protected java.util.List<WindowsQualityUpdateProfileAssignment> assignments;
        /**
         * Sets the Assignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WindowsQualityUpdateProfileAssignParameterSetBuilder withAssignments(@Nullable final java.util.List<WindowsQualityUpdateProfileAssignment> val) {
            this.assignments = val;
            return this;
        }
        /**
         * Instanciates a new WindowsQualityUpdateProfileAssignParameterSetBuilder
         */
        @Nullable
        protected WindowsQualityUpdateProfileAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WindowsQualityUpdateProfileAssignParameterSet build() {
            return new WindowsQualityUpdateProfileAssignParameterSet(this);
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
