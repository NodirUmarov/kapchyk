package kg.itschool.kapchyk.service;

import kg.itschool.kapchyk.model.dto.WalletDto;
import kg.itschool.kapchyk.model.request.CreateWalletRequest;
import org.springframework.stereotype.Service;

@Service
public interface WalletService {
    WalletDto create(CreateWalletRequest request);
}
