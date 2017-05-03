package net.sf.mzmine.modules.peaklistmethods.io.gnpsexport;

import net.sf.mzmine.parameters.Parameter;
import net.sf.mzmine.parameters.impl.SimpleParameterSet;
import net.sf.mzmine.parameters.parametertypes.MassListParameter;
import net.sf.mzmine.parameters.parametertypes.filenames.FileNameParameter;
import net.sf.mzmine.parameters.parametertypes.selectors.PeakListsParameter;

/**
 *  
 * @author Dorrestein Lab
 *
 */

public class GNPSExportParameters extends SimpleParameterSet {
    
    public static final PeakListsParameter PEAK_LISTS = new PeakListsParameter();
    
    public static final FileNameParameter FILENAME = new FileNameParameter(
	    "Filename",
	    "Name of the output MGF file. " +
	    "Use pattern \"{}\" in the file name to substitute with peak list name. " +
	    "(i.e. \"blah{}blah.mgf\" would become \"blahSourcePeakListNameblah.mgf\"). " +
	    "If the file already exists, it will be overwritten.",
	    "mgf");
    
    public static final MassListParameter MASS_LIST = new MassListParameter();
    
    public GNPSExportParameters() {
    	super(new Parameter[] {PEAK_LISTS, FILENAME, MASS_LIST});
    }
}
