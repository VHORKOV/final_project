package ru.sbrf.server;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sbrf.server.repository.ClientCrudRepository;
import ru.sbrf.server.service.ClientService;


public class ClientServiceTest {
    @Autowired
    ClientCrudRepository clientCrudRepository;
    //AccountRepository accountRepository;
    @Autowired
    private ClientService clientService;
/*
    @BeforeEach
    void setUp() {
        accountRepository = Mockito.mock(AccountRepository.class);
        cardRepository = Mockito.mock(CardRepository.class);
        ATM = Mockito.mock(ATM.class);
        atmService = new ATMService(accountRepository, cardRepository);
    }
*/

    @Test
    public void getAllClients(){
        var a=clientService.getAllClients().size();
        Assertions.assertEquals(3, a);

    }


}
