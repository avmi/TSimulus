/*
 * Copyright 2106 Cetic ASBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package be.cetic.tsimulus.test

import be.cetic.tsimulus.timeseries.binary.{FalseTimeSeries, TrueTimeSeries}
import be.cetic.tsimulus.timeseries.missing.UndefinedTimeSeries
import org.joda.time.LocalDateTime
import com.github.nscala_time.time.Imports._

trait RTSTest
{
   val t = new TrueTimeSeries()
   val f = new FalseTimeSeries()
   val u = new UndefinedTimeSeries()

   val dates = Seq(
      LocalDateTime.now(),
      LocalDateTime.now() + 5.seconds,
      LocalDateTime.now() + 10.seconds
   ).toStream

   val fixedDate = new LocalDateTime(2019, 3, 27, 10, 33, 17, 0)
}
