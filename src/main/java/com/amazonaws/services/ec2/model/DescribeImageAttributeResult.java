/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing an AMI's attribute.
 * </p>
 */
public class DescribeImageAttributeResult {
        
    /**
     * The described image attribute of the associated AMI.
     */
    private ImageAttribute imageAttribute;

    /**
     * The described image attribute of the associated AMI.
     *
     * @return The described image attribute of the associated AMI.
     */
    public ImageAttribute getImageAttribute() {
        return imageAttribute;
    }
    
    /**
     * The described image attribute of the associated AMI.
     *
     * @param imageAttribute The described image attribute of the associated AMI.
     */
    public void setImageAttribute(ImageAttribute imageAttribute) {
        this.imageAttribute = imageAttribute;
    }
    
    /**
     * The described image attribute of the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageAttribute The described image attribute of the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImageAttributeResult withImageAttribute(ImageAttribute imageAttribute) {
        this.imageAttribute = imageAttribute;
        return this;
    }
    
    
}
    