// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Defender Realtime Scan Direction.
*/
public enum DefenderRealtimeScanDirection
{
    /**
    * monitor All Files
    */
    MONITOR_ALL_FILES,
    /**
    * monitor Incoming Files Only
    */
    MONITOR_INCOMING_FILES_ONLY,
    /**
    * monitor Outgoing Files Only
    */
    MONITOR_OUTGOING_FILES_ONLY,
    /**
    * For DefenderRealtimeScanDirection values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
