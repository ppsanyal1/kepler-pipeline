/*
 * Copyright 2017 United States Government as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All Rights Reserved.
 * 
 * This file is available under the terms of the NASA Open Source Agreement
 * (NOSA). You should have received a copy of this agreement with the
 * Kepler source code; see the file NASA-OPEN-SOURCE-AGREEMENT.doc.
 * 
 * No Warranty: THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY
 * WARRANTY OF ANY KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY,
 * INCLUDING, BUT NOT LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE
 * WILL CONFORM TO SPECIFICATIONS, ANY IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR FREEDOM FROM
 * INFRINGEMENT, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL BE ERROR
 * FREE, OR ANY WARRANTY THAT DOCUMENTATION, IF PROVIDED, WILL CONFORM
 * TO THE SUBJECT SOFTWARE. THIS AGREEMENT DOES NOT, IN ANY MANNER,
 * CONSTITUTE AN ENDORSEMENT BY GOVERNMENT AGENCY OR ANY PRIOR RECIPIENT
 * OF ANY RESULTS, RESULTING DESIGNS, HARDWARE, SOFTWARE PRODUCTS OR ANY
 * OTHER APPLICATIONS RESULTING FROM USE OF THE SUBJECT SOFTWARE.
 * FURTHER, GOVERNMENT AGENCY DISCLAIMS ALL WARRANTIES AND LIABILITIES
 * REGARDING THIRD-PARTY SOFTWARE, IF PRESENT IN THE ORIGINAL SOFTWARE,
 * AND DISTRIBUTES IT "AS IS."
 * 
 * Waiver and Indemnity: RECIPIENT AGREES TO WAIVE ANY AND ALL CLAIMS
 * AGAINST THE UNITED STATES GOVERNMENT, ITS CONTRACTORS AND
 * SUBCONTRACTORS, AS WELL AS ANY PRIOR RECIPIENT. IF RECIPIENT'S USE OF
 * THE SUBJECT SOFTWARE RESULTS IN ANY LIABILITIES, DEMANDS, DAMAGES,
 * EXPENSES OR LOSSES ARISING FROM SUCH USE, INCLUDING ANY DAMAGES FROM
 * PRODUCTS BASED ON, OR RESULTING FROM, RECIPIENT'S USE OF THE SUBJECT
 * SOFTWARE, RECIPIENT SHALL INDEMNIFY AND HOLD HARMLESS THE UNITED
 * STATES GOVERNMENT, ITS CONTRACTORS AND SUBCONTRACTORS, AS WELL AS ANY
 * PRIOR RECIPIENT, TO THE EXTENT PERMITTED BY LAW. RECIPIENT'S SOLE
 * REMEDY FOR ANY SUCH MATTER SHALL BE THE IMMEDIATE, UNILATERAL
 * TERMINATION OF THIS AGREEMENT.
 */

package gov.nasa.kepler.gar.hac;

import gov.nasa.kepler.gar.Histogram;
import gov.nasa.spiffy.common.persistable.Persistable;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class HacOutputs implements Persistable {

    /**
     * The CCD module of this MATLAB invocation. Only used to debug the bin
     * file.
     */
    private int invocationCcdModule;

    /**
     * The CCD output of this MATLAB invocation. Only used to debug the bin
     * file.
     */
    private int invocationCcdOutput;

    /**
     * The start cadence. Only used to debug the bin file.
     */
    private int cadenceStart;

    /**
     * The end cadence. Only used to debug the bin file.
     */
    private int cadenceEnd;

    /**
     * List of accumulated histograms for the whole focal plane, one per
     * baseline interval.
     */
    private List<Histogram> histograms;

    /**
     * The best baseline interval for the whole focal plane.
     */
    private int overallBestBaselineInterval;

    /**
     * The best storage rate for the whole focal plane.
     */
    private float overallBestStorageRate;

    public List<Histogram> getHistograms() {
        return histograms;
    }

    public void setHistograms(List<Histogram> histograms) {
        this.histograms = histograms;
    }

    public int getOverallBestBaselineInterval() {
        return overallBestBaselineInterval;
    }

    public void setOverallBestBaselineInterval(int overallBestBaselineInterval) {
        this.overallBestBaselineInterval = overallBestBaselineInterval;
    }

    public float getOverallBestStorageRate() {
        return overallBestStorageRate;
    }

    public void setOverallBestStorageRate(float overallBestStorageRate) {
        this.overallBestStorageRate = overallBestStorageRate;
    }

    public int getCadenceEnd() {
        return cadenceEnd;
    }

    public void setCadenceEnd(int cadenceEnd) {
        this.cadenceEnd = cadenceEnd;
    }

    public int getCadenceStart() {
        return cadenceStart;
    }

    public void setCadenceStart(int cadenceStart) {
        this.cadenceStart = cadenceStart;
    }

    public int getInvocationCcdModule() {
        return invocationCcdModule;
    }

    public void setInvocationCcdModule(int invocationCcdModule) {
        this.invocationCcdModule = invocationCcdModule;
    }

    public int getInvocationCcdOutput() {
        return invocationCcdOutput;
    }

    public void setInvocationCcdOutput(int invocationCcdOutput) {
        this.invocationCcdOutput = invocationCcdOutput;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ccdModule",
            invocationCcdModule)
            .append("ccdOutput", invocationCcdOutput)
            .append("startCadence", cadenceStart)
            .append("endCadence", cadenceEnd)
            .append("bestBaselineInterval", overallBestBaselineInterval)
            .append("bestStorageRate", overallBestStorageRate)
            .append("histograms count", histograms.size())
            .toString();
    }
}
