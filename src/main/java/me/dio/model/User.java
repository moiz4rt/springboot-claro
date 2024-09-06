package me.dio.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Entity(name = "tb_user")
@Data
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	@OneToOne(cascade = CascadeType.ALL)
	private Card card;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Feature> features;

	@OneToMany(cascade = CascadeType.ALL)
	private List<News> news;
}
