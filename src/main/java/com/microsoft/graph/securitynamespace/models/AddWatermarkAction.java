// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.WatermarkLayout;
import com.microsoft.graph.security.models.InformationProtectionAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Watermark Action.
 */
public class AddWatermarkAction extends InformationProtectionAction implements IJsonBackedObject {


    /**
     * The Font Color.
     * 
     */
    @SerializedName(value = "fontColor", alternate = {"FontColor"})
    @Expose
	@Nullable
    public String fontColor;

    /**
     * The Font Name.
     * 
     */
    @SerializedName(value = "fontName", alternate = {"FontName"})
    @Expose
	@Nullable
    public String fontName;

    /**
     * The Font Size.
     * 
     */
    @SerializedName(value = "fontSize", alternate = {"FontSize"})
    @Expose
	@Nullable
    public Integer fontSize;

    /**
     * The Layout.
     * 
     */
    @SerializedName(value = "layout", alternate = {"Layout"})
    @Expose
	@Nullable
    public WatermarkLayout layout;

    /**
     * The Text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;

    /**
     * The Ui Element Name.
     * 
     */
    @SerializedName(value = "uiElementName", alternate = {"UiElementName"})
    @Expose
	@Nullable
    public String uiElementName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
