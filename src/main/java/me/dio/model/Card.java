package me.dio.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;

@Entity(name = "tb_card")
@Data
public class Card
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String number;

	@Column(name = "available_limit", precision = 13, scale = 2)
	private BigDecimal limit;
}
