package kg.itschool.kapchyk.service.impl;

import kg.itschool.kapchyk.model.dto.WalletHolderDto;
import kg.itschool.kapchyk.model.entity.WalletHolder;
import kg.itschool.kapchyk.model.request.CreateHolderRequest;
import kg.itschool.kapchyk.repository.WalletHolderRepository;
import kg.itschool.kapchyk.service.WalletHolderService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static kg.itschool.kapchyk.model.mapper.WalletHolderMapper.*;

@Service
@RequiredArgsConstructor
public class WalletHolderServiceImpl implements WalletHolderService {

    @NonNull
    private WalletHolderRepository walletHolderRepository;

    @Override
    public WalletHolderDto create(CreateHolderRequest request) {
        return INSTANCE.toDto(walletHolderRepository
                .save(WalletHolder
                        .builder()
                        .email(request.getEmail())
                        .firstName(request.getFirstName())
                        .lastName(request.getLastName())
                        .patronymic(request.getPatronymic())
                        .build()));
    }
}
