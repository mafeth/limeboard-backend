package net.cuodex.limeboard.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
public class CreateBoardDto {

    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private int theme;
    @NotNull
    private boolean isPublic;
    @NotNull
    private long timeFrom;
    @NotNull
    private long timeTo;


}
