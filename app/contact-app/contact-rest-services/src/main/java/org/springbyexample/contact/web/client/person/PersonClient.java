/*
 * Copyright 2007-2013 the original author or authors.
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
package org.springbyexample.contact.web.client.person;

import org.springbyexample.contact.web.client.AbstractPersistenceClient;
import org.springbyexample.contact.web.service.person.PersonMarshallingService;
import org.springbyexample.mvc.rest.client.RestClient;
import org.springbyexample.schema.beans.person.Person;
import org.springbyexample.schema.beans.person.PersonFindResponse;
import org.springbyexample.schema.beans.person.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Person client.
 *
 * @author David Winterfeldt
 */
@Component
public class PersonClient extends AbstractPersistenceClient<PersonResponse, PersonFindResponse, Person>
        implements PersonMarshallingService {

    @Autowired
    public PersonClient(RestClient client) {
        super(client,
              FIND_BY_ID_REQUEST, FIND_PAGINATED_REQUEST, FIND_REQUEST,
              SAVE_REQUEST, UPDATE_REQUEST, DELETE_PK_REQUEST, DELETE_REQUEST,
              PersonResponse.class, PersonFindResponse.class);
    }

}
