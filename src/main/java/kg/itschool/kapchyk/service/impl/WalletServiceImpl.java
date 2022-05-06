package kg.itschool.kapchyk.service.impl;

import kg.itschool.kapchyk.model.dto.WalletDto;
import kg.itschool.kapchyk.model.entity.Wallet;
import kg.itschool.kapchyk.model.request.CreateWalletRequest;
import kg.itschool.kapchyk.repository.WalletRepository;
import kg.itschool.kapchyk.service.WalletService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static kg.itschool.kapchyk.model.mapper.WalletMapper.*;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    @NonNull private WalletRepository walletRepository;

    @Override
    public WalletDto create(CreateWalletRequest request) {
        return INSTANCE
                .toDto(walletRepository
                        .save(Wallet
                                .builder()
                                .funds(request.getFunds())
                                .walletName(request.getWalletName())
                                .description(request.getDescription())
                                .build()));
    }
}
