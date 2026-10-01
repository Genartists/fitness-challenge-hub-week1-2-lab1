package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String getAboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the FitSquad Hub!");
        model.addAttribute("pageDescription", 
            "FitSquad Hub is a community-driven fitness challenge platform designed to keep you motivated and accountable. " +
            "Members can participate in diverse fitness quests ranging from Beginner mobility flows to Advanced powerlifting programs. " +
            "Track your active daily duration, level up your fitness journey, and earn valuable XP reward points as you complete each milestone.");
        return "about";
    }
}
