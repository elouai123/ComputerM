package ma.emsi.elouai.compds.dto;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ComputerDTO {

    private String proce;
    private double ram;
    private double hardDrive;
    private Double price;
    private String macAddress;

}
