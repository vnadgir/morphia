/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.code.morphia.testmodel;


import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Property;


/**
 * @author Olafur Gauti Gudmundsson
 */
@Embedded
public class Address {

  @Property("address_street")
  private String street;

  @Property
  private String postCode;

  public String getStreet() {
    return street;
  }

  public void setStreet(final String street) {
    this.street = street;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(final String postCode) {
    this.postCode = postCode;
  }
}
