package ru.vihub.subscriptions.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class SubscriptionsController {
    @GetMapping("/subscriptions")
    public String getProfile(Model model) {
        return "subscriptions";
    }
}
