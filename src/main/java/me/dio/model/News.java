package me.dio.model;

import me.dio.model.BaseItem;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tb_news")
@Data
public class News extends BaseItem
{
}
