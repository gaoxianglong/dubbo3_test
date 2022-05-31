/*
 * Copyright 2019-2119 gao_xianglong@sina.com
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
package com.github.service.test;

import com.github.service.order.OrderService;
import com.github.service.order.dto.Money;
import com.github.service.order.dto.OrderRequest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author gao_xianglong@sina.com
 * @version 0.1-SNAPSHOT
 * @date created in 2022/5/31 16:39
 */
public class Starter {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.makeOrder(new OrderRequest() {{
            this.setItemId(1);
            this.setOrderId(2);
            this.setCreateTime(System.currentTimeMillis());
            this.setMoney(new Money(new BigDecimal("12.55"), "CNY"));
        }});
    }
}
