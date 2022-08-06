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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/**
 * @author gao_xianglong@sina.com
 * @version 0.1-SNAPSHOT
 * @date created in 2022/5/31 16:39
 */
public class ClientStarter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Test1 test1 = context.getBean("test1", Test1.class);
        //test1.print();

        OrderService orderService = (OrderService) context.getBean("orderService");
//        orderService.makeOrder(new OrderRequest() {{
//            this.setItemId(1);
//            this.setOrderId(2);
//            this.setCreateTime(System.currentTimeMillis());
//            this.setMoney(new Money(new BigDecimal("12.55"), "CNY"));
//            this.setValue(new byte[1024 * 20]);
//        }});
//        try {
//            System.out.println(orderService.getClass().getName());
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
//            Test1 t = getObj("com.github.service.test.Test1", Test1.class,"ss");
//            t.print();
//            t = (Test1) getObj("com.github.service.test.Test1");
//            t.print();

            String a = getObj();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static <T> T getObj() throws Throwable {
        return (T) "Hello";
    }


    public static Object getObj(String path) throws Throwable {
        return Class.forName(path).newInstance();
    }
}
