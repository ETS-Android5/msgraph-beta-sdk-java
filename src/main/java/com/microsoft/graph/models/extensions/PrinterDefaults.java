// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PrintColorMode;
import com.microsoft.graph.models.generated.PrintDuplexConfiguration;
import com.microsoft.graph.models.generated.PrintDuplexMode;
import com.microsoft.graph.models.generated.PrintFinishing;
import com.microsoft.graph.models.generated.PrintMultipageLayout;
import com.microsoft.graph.models.generated.PrintOrientation;
import com.microsoft.graph.models.generated.PrintPresentationDirection;
import com.microsoft.graph.models.generated.PrintColorConfiguration;
import com.microsoft.graph.models.generated.PrintQuality;
import com.microsoft.graph.models.generated.PrintScaling;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Defaults.
 */
public class PrinterDefaults implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Color Mode.
     * The default color mode to use when printing the document. Valid values are described in the following table.
     */
    @SerializedName(value = "colorMode", alternate = {"ColorMode"})
    @Expose
    public PrintColorMode colorMode;

    /**
     * The Content Type.
     * The default content (MIME) type to use when processing documents.
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
    public String contentType;

    /**
     * The Copies Per Job.
     * The default number of copies printed per job.
     */
    @SerializedName(value = "copiesPerJob", alternate = {"CopiesPerJob"})
    @Expose
    public Integer copiesPerJob;

    /**
     * The Document Mime Type.
     * 
     */
    @SerializedName(value = "documentMimeType", alternate = {"DocumentMimeType"})
    @Expose
    public String documentMimeType;

    /**
     * The Dpi.
     * The default resolution in DPI to use when printing the job.
     */
    @SerializedName(value = "dpi", alternate = {"Dpi"})
    @Expose
    public Integer dpi;

    /**
     * The Duplex Configuration.
     * 
     */
    @SerializedName(value = "duplexConfiguration", alternate = {"DuplexConfiguration"})
    @Expose
    public PrintDuplexConfiguration duplexConfiguration;

    /**
     * The Duplex Mode.
     * The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     */
    @SerializedName(value = "duplexMode", alternate = {"DuplexMode"})
    @Expose
    public PrintDuplexMode duplexMode;

    /**
     * The Finishings.
     * The default set of finishings to apply to print jobs. Valid values are described in the following table.
     */
    @SerializedName(value = "finishings", alternate = {"Finishings"})
    @Expose
    public java.util.List<PrintFinishing> finishings;

    /**
     * The Fit Pdf To Page.
     * The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
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
     * The Media Color.
     * The default media (such as paper) color to print the document on.
     */
    @SerializedName(value = "mediaColor", alternate = {"MediaColor"})
    @Expose
    public String mediaColor;

    /**
     * The Media Size.
     * The default media size to use. Supports standard size names for ISO and ANSI media sizes, along with any custom sizes supported by the associated printer.
     */
    @SerializedName(value = "mediaSize", alternate = {"MediaSize"})
    @Expose
    public String mediaSize;

    /**
     * The Media Type.
     * The default media (such as paper) type to print the document on. Valid values are described in the following table.
     */
    @SerializedName(value = "mediaType", alternate = {"MediaType"})
    @Expose
    public String mediaType;

    /**
     * The Multipage Layout.
     * The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     */
    @SerializedName(value = "multipageLayout", alternate = {"MultipageLayout"})
    @Expose
    public PrintMultipageLayout multipageLayout;

    /**
     * The Orientation.
     * The default orientation to use when printing the document. Valid values are described in the following table.
     */
    @SerializedName(value = "orientation", alternate = {"Orientation"})
    @Expose
    public PrintOrientation orientation;

    /**
     * The Output Bin.
     * The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     */
    @SerializedName(value = "outputBin", alternate = {"OutputBin"})
    @Expose
    public String outputBin;

    /**
     * The Pages Per Sheet.
     * The default number of document pages to print on each sheet.
     */
    @SerializedName(value = "pagesPerSheet", alternate = {"PagesPerSheet"})
    @Expose
    public Integer pagesPerSheet;

    /**
     * The Pdf Fit To Page.
     * 
     */
    @SerializedName(value = "pdfFitToPage", alternate = {"PdfFitToPage"})
    @Expose
    public Boolean pdfFitToPage;

    /**
     * The Presentation Direction.
     * 
     */
    @SerializedName(value = "presentationDirection", alternate = {"PresentationDirection"})
    @Expose
    public PrintPresentationDirection presentationDirection;

    /**
     * The Print Color Configuration.
     * 
     */
    @SerializedName(value = "printColorConfiguration", alternate = {"PrintColorConfiguration"})
    @Expose
    public PrintColorConfiguration printColorConfiguration;

    /**
     * The Print Quality.
     * 
     */
    @SerializedName(value = "printQuality", alternate = {"PrintQuality"})
    @Expose
    public PrintQuality printQuality;

    /**
     * The Quality.
     * The default quality to use when printing the document. Valid values are described in the following table.
     */
    @SerializedName(value = "quality", alternate = {"Quality"})
    @Expose
    public PrintQuality quality;

    /**
     * The Scaling.
     * Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
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
