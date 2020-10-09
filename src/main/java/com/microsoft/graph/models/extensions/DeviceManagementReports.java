// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;
import com.microsoft.graph.models.extensions.DeviceManagementExportJob;
import com.microsoft.graph.models.extensions.DeviceManagementReportSchedule;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports.
 */
public class DeviceManagementReports extends Entity implements IJsonBackedObject {


    /**
     * The Cached Report Configurations.
     * Entity representing the configuration of a cached report
     */
    @SerializedName(value = "cachedReportConfigurations", alternate = {"CachedReportConfigurations"})
    @Expose
    public DeviceManagementCachedReportConfigurationCollectionPage cachedReportConfigurations;

    /**
     * The Export Jobs.
     * Entity representing a job to export a report
     */
    @SerializedName(value = "exportJobs", alternate = {"ExportJobs"})
    @Expose
    public DeviceManagementExportJobCollectionPage exportJobs;

    /**
     * The Report Schedules.
     * Entity representing a schedule for which reports are delivered
     */
    @SerializedName(value = "reportSchedules", alternate = {"ReportSchedules"})
    @Expose
    public DeviceManagementReportScheduleCollectionPage reportSchedules;


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


        if (json.has("cachedReportConfigurations")) {
            cachedReportConfigurations = serializer.deserializeObject(json.get("cachedReportConfigurations").toString(), DeviceManagementCachedReportConfigurationCollectionPage.class);
        }

        if (json.has("exportJobs")) {
            exportJobs = serializer.deserializeObject(json.get("exportJobs").toString(), DeviceManagementExportJobCollectionPage.class);
        }

        if (json.has("reportSchedules")) {
            reportSchedules = serializer.deserializeObject(json.get("reportSchedules").toString(), DeviceManagementReportScheduleCollectionPage.class);
        }
    }
}
