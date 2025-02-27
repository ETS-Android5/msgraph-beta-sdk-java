// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Restriction Action.
*/
public enum RestrictionAction
{
    /**
    * warn
    */
    WARN,
    /**
    * audit
    */
    AUDIT,
    /**
    * block
    */
    BLOCK,
    /**
    * For RestrictionAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
