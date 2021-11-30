// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MicrosoftEdgeChannel;
import com.microsoft.graph.models.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Microsoft Edge App.
 */
public class WindowsMicrosoftEdgeApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Channel.
     * The channel to install on target devices. Possible values are: dev, beta, stable.
     */
    @SerializedName(value = "channel", alternate = {"Channel"})
    @Expose
	@Nullable
    public MicrosoftEdgeChannel channel;

    /**
     * The Display Language Locale.
     * The language locale to use when the Edge app displays text to the user.
     */
    @SerializedName(value = "displayLanguageLocale", alternate = {"DisplayLanguageLocale"})
    @Expose
	@Nullable
    public String displayLanguageLocale;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
