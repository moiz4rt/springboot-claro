package me.dio.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;

@Entity(name = "tb_account")
@Data
public class Account
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String number;
	private String agencv;

	@Column(precision = 13, scale = 2)
	private BigDecimal balance;

	@Column(name = "additional_limit", precision = 2, scale = 13)
	private BigDecimal limit;
}
