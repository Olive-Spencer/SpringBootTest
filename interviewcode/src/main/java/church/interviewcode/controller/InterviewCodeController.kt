package church.interviewcode.controller

import church.interviewcode.model.Results
import church.interviewcode.service.InterviewCodeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class InterviewCodeController {
    @Autowired
    private val interviewCodeService: InterviewCodeService? = null

    @RequestMapping(method = [RequestMethod.POST], path = ["test/{word1}/{word2}"])
    fun postResult(@PathVariable word1: String?, @PathVariable word2: String?): Results {
        return interviewCodeService!!.checkAnagram(word1, word2)
    }
}