/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 *    WekaClassifierEvaluationSparkJobBeanInfo
 *    Copyright (C) 2015 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.distributed.spark;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;

/**
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision$
 */
public class WekaClassifierEvaluationSparkJobBeanInfo extends SparkJobBeanInfo {

  /**
   * Get an array of PropertyDescriptors for the
   * WekaClassifierEvaluationSparkJob's public properties.
   *
   * @return an array of PropertyDescriptors
   */
  @Override
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor p1;
      ArrayList<PropertyDescriptor> pds = new ArrayList<PropertyDescriptor>();

      p1 =
        new PropertyDescriptor("separateTestSetPath",
          WekaClassifierEvaluationSparkJob.class);
      p1.setPropertyEditorClass(weka.gui.beans.EnvironmentField.class);
      pds.add(p1);

      p1 =
        new PropertyDescriptor("sampleFractionForAUC",
          WekaClassifierEvaluationSparkJob.class);
      p1.setPropertyEditorClass(weka.gui.beans.EnvironmentField.class);
      pds.add(p1);

      p1 =
        new PropertyDescriptor("outputSubdir",
          WekaClassifierEvaluationSparkJob.class);
      p1.setPropertyEditorClass(weka.gui.beans.EnvironmentField.class);
      pds.add(p1);

      return pds.toArray(new PropertyDescriptor[1]);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
