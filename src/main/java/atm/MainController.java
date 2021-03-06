package atm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller

public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@RequestMapping(path ="/menu")
	public String balance(){
		return "menu";	
	}
	@RequestMapping(value ="/deposit", method= RequestMethod.GET)
	   public String registerForm(Model model) {
		 model.addAttribute("user",new User());
			return "deposit";
	    }

	@RequestMapping(value ="/deposit", method= RequestMethod.POST)
	@ResponseBody
	   public String saveRegister(@ModelAttribute User user) {
		userRepository.save(user);
			return "Your Account Balance is saved Sussefully";
	    }
	
	@RequestMapping(value ="/withdraw", method= RequestMethod.GET)
	   public String withdrawForm(Model model) {
		 model.addAttribute("user",new User());
			return "withdraw";
	    }

	@RequestMapping(value ="/withdraw", method= RequestMethod.POST)
	@ResponseBody
	   public String saveForm(@ModelAttribute User user) {
		userRepository.save(user);
			return "Your Withdraw  Sussefully";
	    }
	
	@RequestMapping(value ="/balance", method= RequestMethod.POST)
	 public String balanceForm(Model model) {
		 model.addAttribute("user",new User());
		return "balance";
		
	    }
	
}

	
