package com.kenda.myjob.dto;

import com.kenda.myjob.entity.Categorie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobRequest {
    private Categorie categorie;

}
