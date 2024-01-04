package com.example.electronicmailbox.service;

import com.example.electronicmailbox.model.Email;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEmailService {
    List<Email> displayAll();

    Email findById(int id);

    Email edit(Email email);

    List<String> languageList();

    List<Integer> pageSizeList();
}
