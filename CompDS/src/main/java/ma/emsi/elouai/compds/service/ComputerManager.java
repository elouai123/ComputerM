package ma.emsi.elouai.compds.service;

import ma.emsi.elouai.compds.dao.entities.Computer;
import ma.emsi.elouai.compds.dao.repositories.ComputerRepository;
import ma.emsi.elouai.compds.dto.ComputerDTO;
import ma.emsi.elouai.compds.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {


    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;
    }

    @Override
    public List<ComputerDTO> getComputersByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOS;
    }
}
