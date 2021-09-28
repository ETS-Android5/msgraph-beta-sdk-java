// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SimulationAttackTechnique;
import com.microsoft.graph.models.SimulationAttackType;
import com.microsoft.graph.models.EmailIdentity;
import com.microsoft.graph.models.SimulationMode;
import com.microsoft.graph.models.PayloadDeliveryPlatform;
import com.microsoft.graph.models.PayloadSource;
import com.microsoft.graph.models.SimulationReport;
import com.microsoft.graph.models.SimulationStatus;
import com.microsoft.graph.models.TrainingAssignmentPreference;
import com.microsoft.graph.models.TrainingContentPreference;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Simulation.
 */
public class Simulation extends Entity implements IJsonBackedObject {


    /**
     * The Attack Technique.
     * The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
     */
    @SerializedName(value = "attackTechnique", alternate = {"AttackTechnique"})
    @Expose
	@Nullable
    public SimulationAttackTechnique attackTechnique;

    /**
     * The Attack Type.
     * Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     */
    @SerializedName(value = "attackType", alternate = {"AttackType"})
    @Expose
	@Nullable
    public SimulationAttackType attackType;

    /**
     * The Cleanup Artifacts.
     * Flag representing if artifacts were cleaned up in the attack simulation and training campaign.
     */
    @SerializedName(value = "cleanupArtifacts", alternate = {"CleanupArtifacts"})
    @Expose
	@Nullable
    public Boolean cleanupArtifacts;

    /**
     * The Completion Date Time.
     * Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    @SerializedName(value = "completionDateTime", alternate = {"CompletionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completionDateTime;

    /**
     * The Created By.
     * Identity of the user who created the attack simulation and training campaign.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public EmailIdentity createdBy;

    /**
     * The Created Date Time.
     * Date and time of creation of the attack simulation and training campaign.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Description of the attack simulation and training campaign.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Enable Region Timezone Delivery.
     * Flag representing whether to enable or disable timezone-aware delivery of phishing payload in the attack simulation and training campaign.
     */
    @SerializedName(value = "enableRegionTimezoneDelivery", alternate = {"EnableRegionTimezoneDelivery"})
    @Expose
	@Nullable
    public Boolean enableRegionTimezoneDelivery;

    /**
     * The Include All Account Targets.
     * Flag representing inclusion of all the users of a tenant in the attack simulation and training campaign.
     */
    @SerializedName(value = "includeAllAccountTargets", alternate = {"IncludeAllAccountTargets"})
    @Expose
	@Nullable
    public Boolean includeAllAccountTargets;

    /**
     * The Is Automated.
     * Flag representing if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     */
    @SerializedName(value = "isAutomated", alternate = {"IsAutomated"})
    @Expose
	@Nullable
    public Boolean isAutomated;

    /**
     * The Last Modified By.
     * Identity of the user who most recently modified the attack simulation and training campaign.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public EmailIdentity lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time of the most recent modification of the attack simulation and training campaign.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Launch Date Time.
     * Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    @SerializedName(value = "launchDateTime", alternate = {"LaunchDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime launchDateTime;

    /**
     * The Mode.
     * Mode of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: real, preview, unknownFutureValue.
     */
    @SerializedName(value = "mode", alternate = {"Mode"})
    @Expose
	@Nullable
    public SimulationMode mode;

    /**
     * The Payload Delivery Platform.
     * Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     */
    @SerializedName(value = "payloadDeliveryPlatform", alternate = {"PayloadDeliveryPlatform"})
    @Expose
	@Nullable
    public PayloadDeliveryPlatform payloadDeliveryPlatform;

    /**
     * The Payload Source.
     * Source of phishing payload in the attack simulation and training campaign. Possible values are: unknown, global, tenant, unknownFutureValue.
     */
    @SerializedName(value = "payloadSource", alternate = {"PayloadSource"})
    @Expose
	@Nullable
    public PayloadSource payloadSource;

    /**
     * The Report.
     * Report of the attack simulation and training campaign.
     */
    @SerializedName(value = "report", alternate = {"Report"})
    @Expose
	@Nullable
    public SimulationReport report;

    /**
     * The Status.
     * Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, inProgress, scheduled, completed, partiallyCompleted, failed, cancelled, excluded, deleted, included, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SimulationStatus status;

    /**
     * The Training Assignment Preference.
     * Preference of the tenant admin to assign training to users in the attack simulation and training campaign. Possible values are: unknown, auto, manual, unknownFutureValue.
     */
    @SerializedName(value = "trainingAssignmentPreference", alternate = {"TrainingAssignmentPreference"})
    @Expose
	@Nullable
    public TrainingAssignmentPreference trainingAssignmentPreference;

    /**
     * The Training Content Preference.
     * Preference of the tenant admin for the source of training content to assign to users in the attack simulation and training campaign. Possible values are: unknown, microsoft, custom, noTraining, unknownFutureValue.
     */
    @SerializedName(value = "trainingContentPreference", alternate = {"TrainingContentPreference"})
    @Expose
	@Nullable
    public TrainingContentPreference trainingContentPreference;

    /**
     * The Training Due Date Time.
     * Date and time before which the trainings need to be completed by users in the attack simulation and training campaign.
     */
    @SerializedName(value = "trainingDueDateTime", alternate = {"TrainingDueDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime trainingDueDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
