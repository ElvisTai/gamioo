/*
 * Copyright 2015-2020 Gamioo Authors.
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

package io.gamioo.ioc.factory;

import io.gamioo.core.exception.BeansException;
import io.gamioo.ioc.config.BeanDefinition;


/**
 * some description
 *
 * @author Allen Jiang
 * @since 1.0.0
 */

public interface BeanFactory {

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    public <T> T getBean(Class<T> requiredType);

    public Object getBean(String name) throws BeansException;

    void preInstantiateSingletons();

//    void registerBeanDefinition(String name, AbstractBeanDefinition beanDefinition);
}