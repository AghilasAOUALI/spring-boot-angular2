package springBoot.service.impl;

import org.springframework.stereotype.Service;

import springBoot.service.intf.TestService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

	public List<String> test() {
        ArrayList<String> messages = new ArrayList<String>();

        messages.add(new String("Message"));
        messages.add(new String("Message2"));

        return messages;
    }

}
