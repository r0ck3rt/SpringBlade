/**
 * Copyright (c) 2018-2099, Chill Zhuang 庄骞 (bladejava@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.develop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.core.mp.base.BaseEntity;

import java.io.Serial;

/**
 * 数据源配置表实体类
 *
 * @author Chill
 */
@Data
@TableName("blade_datasource")
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Datasource对象")
public class Datasource extends BaseEntity {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@Schema(description = "主键")
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;

	/**
	 * 名称
	 */
	@Schema(description = "名称")
	private String name;
	/**
	 * 驱动类
	 */
	@Schema(description = "驱动类")
	private String driverClass;
	/**
	 * 连接地址
	 */
	@Schema(description = "连接地址")
	private String url;
	/**
	 * 用户名
	 */
	@Schema(description = "用户名")
	private String username;
	/**
	 * 密码
	 */
	@Schema(description = "密码")
	private String password;
	/**
	 * 备注
	 */
	@Schema(description = "备注")
	private String remark;


}
