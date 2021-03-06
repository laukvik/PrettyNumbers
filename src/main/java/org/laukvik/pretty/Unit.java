/*
 * Copyright 2013 Laukviks Bedrifter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.laukvik.pretty;

import java.math.BigDecimal;

/**
 *
 * @author Morten Laukvik
 */
public interface Unit {
    
    /**
     * Returns the preferred unit for that value
     * 
     * @param value
     * @return the preffered unit
     */
//    public Unit getPreferredUnit( BigDecimal value );
    
    /**
     * Returns the numeric value of the unit
     * 
     * @param index 
     * @return numberic value of the unit
     */
//    public BigDecimal getValue( int index );
        public BigDecimal getValue();
    
    /**
     * Returns the value of the unit
     * 
     * @return 
     */
    public int value();
    
    /**
     * Return the name of the unit 
     * 
     * @return 
     */
    public String getName();
    
}