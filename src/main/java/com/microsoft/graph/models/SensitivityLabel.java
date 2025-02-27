// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SensitivityLabelTarget;
import com.microsoft.graph.models.ApplicationMode;
import com.microsoft.graph.models.LabelPolicy;
import com.microsoft.graph.models.AutoLabeling;
import com.microsoft.graph.models.LabelActionBase;
import com.microsoft.graph.models.SensitivityLabel;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.SensitivityLabelCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label.
 */
public class SensitivityLabel extends Entity implements IJsonBackedObject {


    /**
     * The Applicable To.
     * 
     */
    @SerializedName(value = "applicableTo", alternate = {"ApplicableTo"})
    @Expose
	@Nullable
    public EnumSet<SensitivityLabelTarget> applicableTo;

    /**
     * The Application Mode.
     * 
     */
    @SerializedName(value = "applicationMode", alternate = {"ApplicationMode"})
    @Expose
	@Nullable
    public ApplicationMode applicationMode;

    /**
     * The Assigned Policies.
     * 
     */
    @SerializedName(value = "assignedPolicies", alternate = {"AssignedPolicies"})
    @Expose
	@Nullable
    public java.util.List<LabelPolicy> assignedPolicies;

    /**
     * The Auto Labeling.
     * 
     */
    @SerializedName(value = "autoLabeling", alternate = {"AutoLabeling"})
    @Expose
	@Nullable
    public AutoLabeling autoLabeling;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Default.
     * 
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Is Endpoint Protection Enabled.
     * 
     */
    @SerializedName(value = "isEndpointProtectionEnabled", alternate = {"IsEndpointProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean isEndpointProtectionEnabled;

    /**
     * The Label Actions.
     * 
     */
    @SerializedName(value = "labelActions", alternate = {"LabelActions"})
    @Expose
	@Nullable
    public java.util.List<LabelActionBase> labelActions;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Priority.
     * 
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The Tool Tip.
     * 
     */
    @SerializedName(value = "toolTip", alternate = {"ToolTip"})
    @Expose
	@Nullable
    public String toolTip;

    /**
     * The Sublabels.
     * 
     */
    @SerializedName(value = "sublabels", alternate = {"Sublabels"})
    @Expose
	@Nullable
    public SensitivityLabelCollectionPage sublabels;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("sublabels")) {
            sublabels = serializer.deserializeObject(json.get("sublabels"), SensitivityLabelCollectionPage.class);
        }
    }
}
