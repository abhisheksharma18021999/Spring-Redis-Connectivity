package com.redis.expo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")  // we need to store Product hash in redis
public class Product implements Serializable {
	@Id                   // id in redis db
	private int id;
	private String name;
	private int qty;
	private long price;
}