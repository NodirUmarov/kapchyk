package kg.itschool.kapchyk.controller;

import kg.itschool.kapchyk.model.request.CreateWalletRequest;
import kg.itschool.kapchyk.service.WalletService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wallet")
public class WalletController {

    @NonNull private WalletService walletService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid CreateWalletRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(walletService.create(request));
    }
}
