/*
 * Copyright 2006-2008 The MZmine Development Team
 * 
 * This file is part of MZmine.
 * 
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.data.impl;

import net.sf.mzmine.data.MzDataPoint;
import net.sf.mzmine.data.MzPeak;

/**
 * This class represent an m/z peak within a spectrum
 */
public class SimpleMzPeak implements MzPeak {

    private double mz, intensity;
    private MzDataPoint[] rawDataPoints;

    /**
     * This constructor takes the given raw data point to represent this m/z
     * peak.
     * 
     * @param dataPoint
     */
    public SimpleMzPeak(MzDataPoint dataPoint) {
        this(dataPoint.getMZ(), dataPoint.getIntensity(),
                new MzDataPoint[] { dataPoint });
    }

    /**
     * This constructor takes the given m/z and intensity (provided as
     * DataPoint) to represent this m/z peak and sets the raw data points
     * accordingly.
     * 
     * @param dataPoint
     * @param rawDataPoints
     */
    public SimpleMzPeak(MzDataPoint dp, MzDataPoint[] rawDataPoints) {
        this(dp.getMZ(), dp.getIntensity(), rawDataPoints);
    }

    /**
     * This constructor takes the given m/z and intensity to represent this m/z
     * peak and sets the raw data points accordingly.
     * 
     * @param dataPoint
     * @param rawDataPoints
     */
    public SimpleMzPeak(double mz, double intensity, MzDataPoint[] rawDataPoints) {
        this.mz = mz;
        this.intensity = intensity;
        this.rawDataPoints = rawDataPoints;
    }

    /**
     * Returns intensity value of this m/z peak
     */
    public double getIntensity() {
        return intensity;
    }

    /**
     * Returns m/z value of the peak on this scan. The value depends of the used
     * mass detector.
     */
    public double getMZ() {
        return mz;
    }

    /**
     * Sets the m/z value of this m/z peak
     */
    public void setMZ(double mz) {
        this.mz = mz;
    }

    /**
     * Sets the m/z value of this m/z peak
     */
    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
    
    
    /**
     * This method returns an array of raw data points that form this m/z peak
     */
    public MzDataPoint[] getRawDataPoints() {
        return rawDataPoints;
    }
    
    public MzPeak clone(){
    	return new SimpleMzPeak(this.mz, this.intensity, this.rawDataPoints);
    }

}