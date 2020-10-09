// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PrintColorMode;
import com.microsoft.graph.models.generated.PrintDuplexMode;
import com.microsoft.graph.models.generated.PrinterFeedDirection;
import com.microsoft.graph.models.generated.PrintFinishing;
import com.microsoft.graph.models.extensions.PrintMargin;
import com.microsoft.graph.models.generated.PrintMultipageLayout;
import com.microsoft.graph.models.generated.PrintOrientation;
import com.microsoft.graph.models.extensions.IntegerRange;
import com.microsoft.graph.models.generated.PrintQuality;
import com.microsoft.graph.models.generated.PrintScaling;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Document Configuration.
 */
public class PrinterDocumentConfiguration implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Collate.
     * 
     */
    @SerializedName(value = "collate", alternate = {"Collate"})
    @Expose
    public Boolean collate;

    /**
     * The Color Mode.
     * 
     */
    @SerializedName(value = "colorMode", alternate = {"ColorMode"})
    @Expose
    public PrintColorMode colorMode;

    /**
     * The Copies.
     * 
     */
    @SerializedName(value = "copies", alternate = {"Copies"})
    @Expose
    public Integer copies;

    /**
     * The Dpi.
     * 
     */
    @SerializedName(value = "dpi", alternate = {"Dpi"})
    @Expose
    public Integer dpi;

    /**
     * The Duplex Mode.
     * 
     */
    @SerializedName(value = "duplexMode", alternate = {"DuplexMode"})
    @Expose
    public PrintDuplexMode duplexMode;

    /**
     * The Feed Direction.
     * 
     */
    @SerializedName(value = "feedDirection", alternate = {"FeedDirection"})
    @Expose
    public PrinterFeedDirection feedDirection;

    /**
     * The Finishings.
     * 
     */
    @SerializedName(value = "finishings", alternate = {"Finishings"})
    @Expose
    public java.util.List<PrintFinishing> finishings;

    /**
     * The Fit Pdf To Page.
     * 
     */
    @SerializedName(value = "fitPdfToPage", alternate = {"FitPdfToPage"})
    @Expose
    public Boolean fitPdfToPage;

    /**
     * The Input Bin.
     * 
     */
    @SerializedName(value = "inputBin", alternate = {"InputBin"})
    @Expose
    public String inputBin;

    /**
     * The Margin.
     * 
     */
    @SerializedName(value = "margin", alternate = {"Margin"})
    @Expose
    public PrintMargin margin;

    /**
     * The Media Size.
     * 
     */
    @SerializedName(value = "mediaSize", alternate = {"MediaSize"})
    @Expose
    public String mediaSize;

    /**
     * The Media Type.
     * 
     */
    @SerializedName(value = "mediaType", alternate = {"MediaType"})
    @Expose
    public String mediaType;

    /**
     * The Multipage Layout.
     * 
     */
    @SerializedName(value = "multipageLayout", alternate = {"MultipageLayout"})
    @Expose
    public PrintMultipageLayout multipageLayout;

    /**
     * The Orientation.
     * 
     */
    @SerializedName(value = "orientation", alternate = {"Orientation"})
    @Expose
    public PrintOrientation orientation;

    /**
     * The Output Bin.
     * 
     */
    @SerializedName(value = "outputBin", alternate = {"OutputBin"})
    @Expose
    public String outputBin;

    /**
     * The Page Ranges.
     * 
     */
    @SerializedName(value = "pageRanges", alternate = {"PageRanges"})
    @Expose
    public java.util.List<IntegerRange> pageRanges;

    /**
     * The Pages Per Sheet.
     * 
     */
    @SerializedName(value = "pagesPerSheet", alternate = {"PagesPerSheet"})
    @Expose
    public Integer pagesPerSheet;

    /**
     * The Quality.
     * 
     */
    @SerializedName(value = "quality", alternate = {"Quality"})
    @Expose
    public PrintQuality quality;

    /**
     * The Scaling.
     * 
     */
    @SerializedName(value = "scaling", alternate = {"Scaling"})
    @Expose
    public PrintScaling scaling;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
