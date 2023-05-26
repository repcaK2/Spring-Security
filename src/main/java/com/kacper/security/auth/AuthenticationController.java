package com.kacper.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String email,
            @RequestParam String password
    ) {
        RegisterRequest request = new RegisterRequest();
        request.setFirstname(firstname);
        request.setLastname(lastname);
        request.setEmail(email);
        request.setPassword(password);

        service.register(request);

        return ResponseEntity.ok("Użytkownik został zarejestrowany.");
    }

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestParam("email") String email,
                                               @RequestParam("password") String password) {

        AuthenticationRequest request = new AuthenticationRequest();
        request.setEmail(email);
        request.setPassword(password);

        service.authenticate(request);

        return ResponseEntity.ok("Użytkownik został zalogowny");
    }

}
