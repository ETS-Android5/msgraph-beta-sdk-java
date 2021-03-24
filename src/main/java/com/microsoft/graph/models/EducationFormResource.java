// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EducationResource;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Form Resource.
 */
public class EducationFormResource extends EducationResource implements IJsonBackedObject {


    /**
     * The Edit Url.
     * Teacher URL for the Form.
     */
    @SerializedName(value = "editUrl", alternate = {"EditUrl"})
    @Expose
	@Nullable
    public String editUrl;

    /**
     * The Form Id.
     * Id of the Form.
     */
    @SerializedName(value = "formId", alternate = {"FormId"})
    @Expose
	@Nullable
    public String formId;

    /**
     * The Is Group Form.
     * Whether the Form belongs to a class group.
     */
    @SerializedName(value = "isGroupForm", alternate = {"IsGroupForm"})
    @Expose
	@Nullable
    public Boolean isGroupForm;

    /**
     * The Original Form Id.
     * Original id of the Form.
     */
    @SerializedName(value = "originalFormId", alternate = {"OriginalFormId"})
    @Expose
	@Nullable
    public String originalFormId;

    /**
     * The View Url.
     * Student URL for the Form.
     */
    @SerializedName(value = "viewUrl", alternate = {"ViewUrl"})
    @Expose
	@Nullable
    public String viewUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
