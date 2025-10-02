package com.pl.The_12th_Man.player;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/logos")
@CrossOrigin(origins = "http://localhost:3000")
public class LogoController {

    @GetMapping("/teams")
    public ResponseEntity<Map<String, String>> getAllTeamLogos() {
        Map<String, String> teamLogos = new HashMap<>();

        // Premier League team logo mappings
        teamLogos.put("Arsenal", "https://upload.wikimedia.org/wikipedia/en/5/53/Arsenal_FC.svg");
        teamLogos.put("Aston Villa", "https://upload.wikimedia.org/wikipedia/en/f/f9/Aston_Villa_FC_crest_%282016%29.svg");
        teamLogos.put("Bournemouth", "https://upload.wikimedia.org/wikipedia/en/e/e5/AFC_Bournemouth_%282013%29.svg");
        teamLogos.put("Brentford", "https://upload.wikimedia.org/wikipedia/en/2/2a/Brentford_FC_crest.svg");
        teamLogos.put("Brighton", "https://upload.wikimedia.org/wikipedia/en/f/fd/Brighton_%26_Hove_Albion_logo.svg");
        teamLogos.put("Chelsea", "https://upload.wikimedia.org/wikipedia/en/c/cc/Chelsea_FC.svg");
        teamLogos.put("Crystal Palace", "https://upload.wikimedia.org/wikipedia/en/a/a2/Crystal_Palace_FC_logo_%282022%29.svg");
        teamLogos.put("Everton", "https://upload.wikimedia.org/wikipedia/en/7/7c/Everton_FC_logo.svg");
        teamLogos.put("Fulham", "https://upload.wikimedia.org/wikipedia/en/e/eb/Fulham_FC_%28shield%29.svg");
        teamLogos.put("Ipswich Town", "https://upload.wikimedia.org/wikipedia/en/4/43/Ipswich_Town.svg");
        teamLogos.put("Leicester City", "https://upload.wikimedia.org/wikipedia/en/2/2d/Leicester_City_crest.svg");
        teamLogos.put("Liverpool", "https://upload.wikimedia.org/wikipedia/en/0/0c/Liverpool_FC.svg");
        teamLogos.put("Manchester City", "https://upload.wikimedia.org/wikipedia/en/e/eb/Manchester_City_FC_badge.svg");
        teamLogos.put("Manchester Utd", "https://upload.wikimedia.org/wikipedia/en/7/7a/Manchester_United_FC_crest.svg");
        teamLogos.put("Newcastle Utd", "https://upload.wikimedia.org/wikipedia/en/5/56/Newcastle_United_Logo.svg");
        teamLogos.put("Nott'ham Forest", "https://upload.wikimedia.org/wikipedia/en/e/e5/Nottingham_Forest_F.C._logo.svg");
        teamLogos.put("Southampton", "https://upload.wikimedia.org/wikipedia/en/c/c9/FC_Southampton.svg");
        teamLogos.put("Tottenham", "https://upload.wikimedia.org/wikipedia/en/b/b4/Tottenham_Hotspur.svg");
        teamLogos.put("West Ham", "https://upload.wikimedia.org/wikipedia/en/c/c2/West_Ham_United_FC_logo.svg");
        teamLogos.put("Wolves", "https://upload.wikimedia.org/wikipedia/en/f/fc/Wolverhampton_Wanderers.svg");

        return ResponseEntity.ok(teamLogos);
    }

    @GetMapping("/nations")
    public ResponseEntity<Map<String, String>> getAllNationFlags() {
        Map<String, String> nationFlags = new HashMap<>();

        // Common nations in Premier League with their ISO codes
        nationFlags.put("England", "https://flagcdn.com/w40/gb-eng.png");
        nationFlags.put("Spain", "https://flagcdn.com/w40/es.png");
        nationFlags.put("Brazil", "https://flagcdn.com/w40/br.png");
        nationFlags.put("France", "https://flagcdn.com/w40/fr.png");
        nationFlags.put("Argentina", "https://flagcdn.com/w40/ar.png");
        nationFlags.put("Portugal", "https://flagcdn.com/w40/pt.png");
        nationFlags.put("Belgium", "https://flagcdn.com/w40/be.png");
        nationFlags.put("Netherlands", "https://flagcdn.com/w40/nl.png");
        nationFlags.put("Germany", "https://flagcdn.com/w40/de.png");
        nationFlags.put("Italy", "https://flagcdn.com/w40/it.png");
        nationFlags.put("Scotland", "https://flagcdn.com/w40/gb-sct.png");
        nationFlags.put("Wales", "https://flagcdn.com/w40/gb-wls.png");
        nationFlags.put("Ireland", "https://flagcdn.com/w40/ie.png");
        nationFlags.put("Norway", "https://flagcdn.com/w40/no.png");
        nationFlags.put("Sweden", "https://flagcdn.com/w40/se.png");
        nationFlags.put("Denmark", "https://flagcdn.com/w40/dk.png");
        nationFlags.put("Ukraine", "https://flagcdn.com/w40/ua.png");
        nationFlags.put("Serbia", "https://flagcdn.com/w40/rs.png");
        nationFlags.put("Croatia", "https://flagcdn.com/w40/hr.png");
        nationFlags.put("Poland", "https://flagcdn.com/w40/pl.png");
        nationFlags.put("Austria", "https://flagcdn.com/w40/at.png");
        nationFlags.put("Switzerland", "https://flagcdn.com/w40/ch.png");
        nationFlags.put("Japan", "https://flagcdn.com/w40/jp.png");
        nationFlags.put("South Korea", "https://flagcdn.com/w40/kr.png");
        nationFlags.put("Senegal", "https://flagcdn.com/w40/sn.png");
        nationFlags.put("Ghana", "https://flagcdn.com/w40/gh.png");
        nationFlags.put("Nigeria", "https://flagcdn.com/w40/ng.png");
        nationFlags.put("Ivory Coast", "https://flagcdn.com/w40/ci.png");
        nationFlags.put("Egypt", "https://flagcdn.com/w40/eg.png");
        nationFlags.put("Morocco", "https://flagcdn.com/w40/ma.png");
        nationFlags.put("Algeria", "https://flagcdn.com/w40/dz.png");
        nationFlags.put("Mali", "https://flagcdn.com/w40/ml.png");
        nationFlags.put("Uruguay", "https://flagcdn.com/w40/uy.png");
        nationFlags.put("Colombia", "https://flagcdn.com/w40/co.png");
        nationFlags.put("Ecuador", "https://flagcdn.com/w40/ec.png");
        nationFlags.put("Chile", "https://flagcdn.com/w40/cl.png");
        nationFlags.put("Mexico", "https://flagcdn.com/w40/mx.png");
        nationFlags.put("Australia", "https://flagcdn.com/w40/au.png");
        nationFlags.put("New Zealand", "https://flagcdn.com/w40/nz.png");
        nationFlags.put("USA", "https://flagcdn.com/w40/us.png");
        nationFlags.put("Canada", "https://flagcdn.com/w40/ca.png");

        return ResponseEntity.ok(nationFlags);
    }
}