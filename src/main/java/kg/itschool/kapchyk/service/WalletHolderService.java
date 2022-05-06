package kg.itschool.kapchyk.service;

import kg.itschool.kapchyk.model.dto.WalletHolderDto;
import kg.itschool.kapchyk.model.request.CreateHolderRequest;
import org.springframework.stereotype.Service;

@Service
public interface WalletHolderService {

    WalletHolderDto create(CreateHolderRequest request);

}
