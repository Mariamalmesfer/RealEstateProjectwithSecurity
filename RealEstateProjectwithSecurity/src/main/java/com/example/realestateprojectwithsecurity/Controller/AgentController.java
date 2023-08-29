package com.example.realestateprojectwithsecurity.Controller;


import com.example.realestateprojectwithsecurity.ApiResponse.ApiResponse;
import com.example.realestateprojectwithsecurity.DTO.AgentDTO;
import com.example.realestateprojectwithsecurity.Model.Agent;
import com.example.realestateprojectwithsecurity.Service.AgentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/agent")
public class AgentController {

       private final AgentService agentService;


    @PostMapping("/regester")
    public ResponseEntity Regester(@RequestBody @Valid AgentDTO agent) {
        agentService.regester(agent);
        return ResponseEntity.status(200).body(new ApiResponse("Agent added"));

    }

    @PostMapping("/logout")
    public ResponseEntity Logoout() {
        return ResponseEntity.status(200).body(new ApiResponse("Log out successful"));

    }
//    @GetMapping("/get")
//    public ResponseEntity getAllAgents() {
//
//        return ResponseEntity.status(200).body(agentService.getAllAgents());
//    }
//
//
//    @PostMapping("/add")
//    public ResponseEntity addAgents(@RequestBody @Valid Agent agents) {
//        agentService.addAgent(agents);
//        return ResponseEntity.status(200).body(new ApiResponse("Agent added"));
//
//    }
//
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity updateAgent(@PathVariable Integer id, @RequestBody @Valid  Agent agent ){
//        agentService.updateAgent(id,agent );
//        return ResponseEntity.status(200).body(new ApiResponse("Agent updated"));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity deletAgent(@PathVariable Integer id){
//        agentService.deleteAgent(id);
//        return ResponseEntity.status(200).body(new ApiResponse("Agent deleted"));
//    }
//
//    @GetMapping("/deals/{id}")
//    public ResponseEntity deals(@PathVariable Integer id){
//        return ResponseEntity.status(200).body(agentService.dealList(id));
//    }
}
