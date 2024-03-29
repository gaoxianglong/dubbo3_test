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
package com.github.service.order.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author gao_xianglong@sina.com
 * @version 0.1-SNAPSHOT
 * @date created in 2022/5/31 15:17
 */
@Data
public class OrderRequest implements Serializable {
    private long orderId;
    private long itemId;
    private Money money;
    private long createTime;
    private byte[] value;

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", money=" + money +
                ", createTime=" + createTime +
                ", value=" + (Objects.nonNull(value) ? value.length : null) +
                '}';
    }
}
