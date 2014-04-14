/**
 *  Copyright 2012-2014 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.model.assignment;

import java.util.Set;
import org.mapstruct.ap.model.Assignment;
import org.mapstruct.ap.model.common.ModelElement;
import org.mapstruct.ap.model.common.Type;

/**
 *
 * @author Sjaak Derksen
 */
public abstract class AssignmentDecorator extends ModelElement implements Assignment {

    private final Assignment decoratedAssignment;

    public AssignmentDecorator( Assignment decoratedAssignment ) {
        this.decoratedAssignment = decoratedAssignment;
    }

    @Override
    public Set<Type> getImportTypes() {
        return decoratedAssignment.getImportTypes();
    }

    @Override
    public Set<Type> getExceptionTypes() {
        return decoratedAssignment.getExceptionTypes();
    }

    @Override
    public void setAssignment( Assignment assignment ) {
        decoratedAssignment.setAssignment( assignment );
    }

    public Assignment getAssignment() {
       return decoratedAssignment;
    }

    @Override
    public String getSourceReference() {
        return decoratedAssignment.getSourceReference();
    }

    @Override
    public boolean isSimple() {
        return decoratedAssignment.isSimple();
    }
}