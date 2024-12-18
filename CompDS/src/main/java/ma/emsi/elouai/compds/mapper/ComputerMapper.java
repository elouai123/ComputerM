package ma.emsi.elouai.compds.mapper;

import ma.emsi.elouai.compds.dao.entities.Computer;
import ma.emsi.elouai.compds.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO fromComputerToComputerDto(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer fromComputerDtoToComputer(ComputerDTO computerDto) {
        return modelMapper.map(computerDto, Computer.class);
    }
}
