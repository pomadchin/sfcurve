/***********************************************************************
 * Copyright (c) 2015 Azavea.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0 which
 * accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.sfcurve

trait SpaceFillingCurve2D {
  def toIndex(x: Double, y: Double): Long
  def toPoint(i: Long): (Double, Double)
  def toRanges(xmin: Double, ymin: Double, xmax: Double, ymax: Double): Seq[(Long, Long)]
}