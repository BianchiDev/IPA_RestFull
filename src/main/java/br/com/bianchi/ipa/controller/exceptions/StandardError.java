package br.com.bianchi.ipa.controller.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardError {

    private LocalDateTime timestamp;
    private Integer status;
    private String srror;
    private String path;
}
