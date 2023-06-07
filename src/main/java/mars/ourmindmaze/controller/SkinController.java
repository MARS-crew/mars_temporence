package mars.ourmindmaze.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mars.ourmindmaze.service.SkinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/skin")
@RequiredArgsConstructor
@Tag(name = "skin API", description = "캐릭터 스킨 관련 API")
public class SkinController {
    private final SkinService skinService;
}
