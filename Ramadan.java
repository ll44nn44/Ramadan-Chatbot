package ChatPot;
import java.util.ArrayList;
import java.util.Scanner;


public class Ramadan {
	
	final String ANSI_BLUE = "\u001B[96m";
    final String ANSI_RESET = "\u001B[0m";
    private static final Scanner in = new Scanner(System.in);
    private final String[] que = new String[]{"who", "how", "when", "why", "where","what"};
    private final String[] ques = new String[]{"is", "can", "do", "are","does"};
    private final String[] negfast = new String[]{"break", "end", "exempt", "excluded", "compensate", "doesn't","exempted","excused","don't","exemptions","exemption"};
    private final String[] posfast = new String[]{"allowed", "required","must","should","eligible","capable","expected","mandatory"};
    private final String[] negres = new String[]{"People who are ill, traveling, elderly, children, pregnant, breastfeeding, and women during their menstrual period  can break their fast under certain conditions"
    ,"Sick, traveling, old, pregnant, nursing, and women during their menstrual period can skip fasting sometimes", "Under specific conditions, people who are sick, elderly, traveling, pregnant, breastfeeding, and women during their menstrual period can break their fasting"};
    private final String[] posres = new String[]{"Any mature Muslim in good physical condition and free from illnesses must fast", "Every muslim, male or female, physically fit, mentally prepared, and of mature age, without any health conditions that prevent fasting should fast"};
    private final String[] verbfast = new String[]{"function","work","practiced","processed","process","observed","practices"};
    private final String[] verbres = new String[] {"muslims abstain from eating and drinking from dawn to dusk. Also, they are supposed to avoid jealousy, anger, complaining, and gossiping during this month","From the break of dawn until sunset, Muslims fast. During this month, they should also refrain from being jealous, angry, complaining, or gossipy"
    ,"Muslims fast from dawn to dusk. Additionally, they should avoid jealousy, anger, complaining, and gossiping this month"};
    private final String[] timefast = new String[]{"hours","durations","times","lengths","length","periods","period","long"};
    private final String[] timeres = new String[]{"fasting hours vary depending on local sunrise and sunset times and seasons, leading to shorter or longer fasts"
    ,"The length of fasts can vary according to the seasons and the times of sunrise and sunset in a given area","There is no particular duration for fasting; instead, fasts can be longer or shorter than usual depending on the time of day and the seasons"};
    private final String[] enrgfast = new String[]{"energy","power","energized","energetic","vitality"};
    private final String[] enrgres = new String[]{"By consuming balanced nutritious meals during Suhoor (Pre-dawn) and Iftar (Post-dusk), staying hydrated, getting adequate rest, and managing physical activity"};
    private final String[] efcfast = new String[]{"affect","respond","affected","influence","body","effects"};
    private final String[] efcres = new String[]{"altering metabolism, detoxifying the system, improving blood sugar control, and potentially enhancing mental and heart health"
    ,"modifying blood sugar regulation, cleansing the body, changing metabolism, and possibly strengthening heart and mental health"};
    private final String[] imprfast = new String[]{"important","regard","care","essential","importance","crucial","value"};
    private final String[] impres = new String[]{"fasting Ramadan is one of the Five Pillars of Islam, strengthening one's relationship with God and purifying the soul while promoting self-control, empathy, spiritual development, and community unity, also reminding us of the poor's struggles"
    ,"fasting is one of the Five Pillars of Islam, fostering self-discipline, empathy, spiritual growth, and community unity while serving as a means to purify the soul and strengthen one's connection with God, also reminding us of the poor's struggles"
    ,"fasting one of the Five Pillars of Islam, it promotes self-discipline, empathy, spiritual growth, community unity, soul purification, and God-connection, also reminding us of the poor's struggles"};
    private final String[] dayfast = new String[]{"daily","every","each"};
    private final String[] purpfast = new String[]{"purpose","significance","reason","achieve","point","goal","importance"};
    private final String[] benfast = new String[]{"benefits","advantages","good","positives","benefit","advantage"};
    private final String[] benres = new String[]{"there are several physical, mental, social, and religious benefits","Physical, mental, social, and religious advantages can be observed"
     , "We can see positive impacts on physical, mental, social, and religious levels"};
    private final String[] phyben = new String[]{"it promotes blood sugar control by reducing insulin resistance and help in fighing inflammation. Also it Aids weight loss by limiting calorie intake and boosting metabolism"
    , "It assists in managing blood sugar levels by decreasing insulin resistance and combating inflammation. Additionally, it supports weight loss by restricting calorie consumption and increasing metabolism"
    ,"It contributes to blood sugar control by reducing insulin resistance and combatting inflammation. Moreover, it assists in weight loss by restricting calorie intake and boosting metabolism"};
    private final String[]socben = new String[]{"enhancing community bonds, fostering a sense of unity, deepening compassion for the underprivileged, and promoting global Muslim unity"
    , "fostering stronger social bonds and an attitude of solidarity growing compassion for the poor and bringing muslims together around the globe"};
    private final String[]menben = new String[]{"fasting enhance self-discipline, focus, reduce stress, improve emotional well-being, foster mindfulness, and increase resilience"
    ,"Fasting has many positive effects on one's mental including improved self-control, concentration, mental and emotional health, mindfulness, and resilience"};
    private final String[]relben = new String[]{"increases taqwa,intensifies God-consciousness, reinforces faith , and promotes charitable actions", "promotes acts of charity, strengthens faith, and increases taqwa"};
    private final String[]start = new String[]{"start","period","begin","beginning","starting","starts"};
    private final String[]startres = new String[]{"muslims abstain from eating and drinking from dawn to dusk","from sunrise until sunset","from the break of dawn till sunset"};
    private final String[]trvlres = new String[]{"greater than 80 kilometers","more than 80 kilometers"};
    private final String[]whereres = new String[]{"Muslims typically break their fast at home with family or in community gatherings, such as mosques or community centers. This meal, known as Iftar, starts after the sunset prayer, Maghrib"};
    private final String[]end = new String[]{"end","finish","stop","ending","fast-breaking"};
    private final String[]endres = new String[]{"it ends at sunset, immediately after the Maghrib (sunset) prayer"};
    private final String[]first = new String[]{"first","beginning","begin","establish","established"};
    private final String[]firstres = new String[]{"it is agreed upon by Muslim's historians that prophet Adam was the first person to ever fast"};
    private final String[]spec = new String[]{"special","specific","unique","particular","significant"};
    private final String[]specres = new String[]{"there is a special prayer in Ramadan known as (Tarawih). Tarawih is considered one of the highlights of Ramadan nights. For the entire holy month. It is not mandatory prayer but muslims are encourged to perform it at night"};
    private final String[]rakat = new String[]{"the prayer consists of 8 to 20 rakats, prayed in a set of 2 rakats, with a short break in between"};
    private final String[]mean = new String[]{"meaning","definition","called","naming","referred","name","call"," derive","significance","significant"};
    private final String[]tarawih = new String[]{"the term (Tarawih) comes from the Arabic root word (raha), which means to rest or relax. Tarawih refers to the short rest periods taken between every four rakats of the prayer"};
    private final String[]perform = new String[]{"perform","performed","conducted","procedure","process","performing","performance"};
    private final String[]wear = new String[]{"wear","clothes","outfits","outfit","clothing","dress","wears"};
    private final String[]rule = new String[] {"rules","rule","regulations","regulation","guidelines"};
    private final String[]date = new String[] {"dates","date","start","begin","beginning","starting","started","starts","begins","times","time"};
    private final String[]datansw = new String[] {"the beginning of Ramadan each year is determined by the sighting of the crescent moon, marking the start of the Islamic lunar month"
    ,"Ramadan starts each year when the crescent moon is seen, beginning the Islamic lunar month","the crescent moon's sighting each year marks the beginning of Ramadan"};
    private final String[]rmdan = new String[] {"Ramadan is the ninth month of the Islamic lunar calendar and is considered the holiest month for Muslims, marked by fasting and reflection. During the last ten days of Ramadan, Muslims seek Laylat al-Qadr. This month is especially valued for increased devotion and getting closer to Allah"};
    private final String[]clbr = new String[] {"Ramadan is celebrated worldwide by Muslims in every country where they reside. However, it is most extensively observed in the middle east","muslims celebrate Ramadan in every nation where they are residents. Nonetheless, the Middle East is where it is most commonly observed"
    ,"Muslims around the world observe Ramadan in every nation where they live. However, The Middle East is where it is most commonly observed"};
    private final String[]rmdate = new String[] {"Ramadan dates change yearly because Muslims follow the lunar Islamic calendar, it is about 11 days shorter than the solar Gregorian calendar. This causes Ramadan to start 11 days earlier each year, cycling through different seasons over time","because Muslims observe the lunar Islamic calendar, which is roughly 11 days shorter than the solar Gregorian calendar, the dates of Ramadan vary every year"};
    private final String[]howfast = new String[] {"muslims break their fast in Ramadan with Iftar, starting with dates and water to follow the Prophet Muhammad's tradition, then often pray before having a full meal that includes a mix of dishes varying by culture","muslims break their fast during Ramadan with Iftar, which begins with dates and water in accordance with the Prophet Muhammad's practice. After praying, they frequently eat a full meal that consists of a variety of dishes depending on the culture."};
    private final String[]qader = new String[] {"it is considered special in Islam because it commemorates the night when the Quran was first revealed to the Prophet Muhammad. This night is described in the Quran as being (better than a thousand months), meaning that worship and good deeds performed on this night are immensely rewarded, more so than on other days","because it marks the night when the Quran was first revealed to the Prophet Muhammad. The Quran refers to this night as being (better than a thousand months), which implies that worship and good deeds carried out on this night are immensely rewarded, more so than on other days"};
    private final String[]qad = new String[] {"when","date","observed","time","occur"};
    private final String[]qadans = new String[] {"Laylat al-Qadr is typically observed during the last ten nights of Ramadan, particularly on one of the odd-numbered nights. The exact date is not specified in the Islamic texts, encouraging Muslims to seek its blessings throughout the last ten nights"
    ,"In the final ten nights of Ramadan, especially on an odd-numbered night, Laylat al-Qadr is usually observed. The exact date is not specified in the Islamic texts, encouraging Muslims to seek its blessings throughout the last ten nights"};
    private final String[]rmdend = new String[] {"Ramadan ends with the sighting of the new moon, which marks the beginning of the next lunar month, Shawwal. This event occurs approximately 29 or 30 days after the start of Ramadan","When the new moon is visible at the end of Ramadan, Shawwal, the following lunar month, officially begins. This happens about four weeks after Ramadan begins"};
    private final String[]made = new String[] {"let's not get personal now!","well, i was made by a really smart student, but let's keep the spotlight on you","someone..","llllaaannnaaa made me"};
    private final String[]myname = new String[] {"Nameless, but I am Lana's handiwork, through and through!"};
    private final String[]greet = new String[] {"I'm not a chatting pot ??!!!?","kumusta"};
    private final String[]greett = new String[] {"hello","hi","hii","hola","kumusta","morning","evening","afternoon","greetings","hey"};
    private final String[]ppl = new String[] {"ill","sick","kids","children","womens","woman","mens","women","elderly","pregnant","traveling","travellers","breastfeeding","menstrual"};
    private final String[]length = new String[] {"length","last","duration","days","longer","shorter"};
    private final String[]tme = new String[] {"time","date","lunar","gregorian"};
    private final String[]two = new String[] {"twice","two","multiple","several","many","more"};
    
    public Ramadan() {
        System.out.println(ANSI_BLUE + "Ramadan Pot" + ANSI_RESET);
        System.out.println("What is in your mind?..");
        while (true) {
            String input = in.nextLine();
            
            if (input.equals("exit")) {
                System.out.println("Ramadan Mubarak! Goodbye.");
                break;
            }
            
            questions(input);
       
            }    
    }
        
	public ArrayList<String> Tokenization(String r) {
		
		ArrayList<String> sp = new ArrayList<String>();
		int start = 0;

        for (int i = 0; i <= r.length(); i++) {
           
            if (i == r.length() || r.substring(i, i + 1).equals(" ")) {
                if (i > start) {
                   
                    sp.add(r.substring(start, i));
                }
                start = i + 1; 
            }
        }
		
		return sp;
	}
	
	public void Random() {
		
		String [] random = { "Ok..", "Ramadan Mubarak!", "Ramadan Kareem", "Hmmm.. try again",
		 "Fasting mode on!..bye", "Prayer time? Sorry I'll pause the chat."};
		
		int i = (int)(Math.random() * random.length);
		
		System.out.println(random[i]);
	
}

public void questions(String input) {
	ArrayList<String> tokens = Tokenization(input);
    boolean isQuestion = false;
    String qu = "";

    if (tokens.get(0).equals("how")) {
    	if(tokens.get(1).equals("are")) {
    		if(tokens.get(2).equals("you")) {
    			String ans = "fine...  i guess";
                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                return;
    		}
    	}
    }
    
    for (String w : tokens) {
    	
    if (w.equals("prayer") ||w.equals("prayers")) {
	        prayer(tokens);
	        return;}

}
    
    for (String q : ques) {
        if (tokens.get(0).equals(q)) {
            isQuestion = true;
            qu = q;
            other(tokens,q);
            return;
        }
	   } 

    
    for (String w : tokens) {
        for (String q : que) {
            if (q.equals(w)) {
                isQuestion = true;
                qu = q;
                handle(tokens, qu);
                return;
            }
        }
    }        
    	  
    	   for (String w : tokens) {
        for (String g : greett) {
            if (g.equals(w)) {
                int index = (int) (Math.random() * greet.length);
                String ans = greet[index];
                isQuestion = true;
                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                return;
            }
        }
    }

    
    Random();
   
}

public void handle(ArrayList<String> tokens, String q) {
     
    boolean quese = false;

    
    for (String w : tokens) {
    	
    	if (w.equals("moon") ||w.equals("crescen") ||w.equals("helal")||w.equals("hilal")) {
            String ans = "Ramadan is determined by the Islamic lunar calendar, which begins with the sighting of the crescent moon";
            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
            return;
	}
    	else if (w.equals("fast") || w.equals("fasting")) {
        fast(tokens,q);
        quese = true;
        return;
    } 

    	else if (w.equals("made") ||w.equals("created") ||w.equals("coded") || w.equals("creator")||w.equals("developed")||w.equals("programmed")) {
    		int index = (int) (Math.random() * made.length);
            String ans = made[index];
            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
            return;
	}
    	else if (w.equals("al-qadr") ||w.equals("al-qader")||w.equals("laylat")) {
	        qadr(tokens);
	        quese = true;
	        return;
	}
    	else if (w.equals("eid")) {
	       String ans = "ASK eid pot !!!";
	       System.out.println(ANSI_BLUE + ans + ANSI_RESET);
           return;
	}
    	
    	 else if (w.equals("rakaa") || w.equals("rakat") || w.equals("raka") || w.equals("rakats")) {
 	        raka(tokens);
 	        quese = true;
 	        return;
 	    }
    	 else if (w.equals("taqwa")) {
             String ans = "taqwa is an islamic concept that refers to the consciousness of Allah";
             System.out.println(ANSI_BLUE + ans + ANSI_RESET);
             return; 
         }
    	 else if (w.equals("food") || w.equals("foods")||w.equals("dish") || w.equals("dishes")||w.equals("cusine")) {
    		 String ans = "During Ramadan, key foods include dates to break the fast and drinks like Vimto (no one likes tang other than Nouf tho), and sweets like Kunafa. Each dish carries a cultural significance and forms an essential part of the Ramadan culinary tradition";
             System.out.println(ANSI_BLUE + ans + ANSI_RESET);
             return; 
    	    }
    	else if (w.equals("ramadan") || w.equals("rmdan")||w.equals("ramdan") || w.equals("ramadn")||w.equals("ramadans")) {
        ramadan(tokens,q);
        quese = true;
        return;
    }
    	else if (w.equals("name")) {
    		int index = (int) (Math.random() * greet.length);
            String ans = myname[index];
            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
            return; 
        }
    	
    }
    
    
    Random();
    

}

private void other(ArrayList<String> tokens,String q) {
	String ans = "";
	   int index = 0;
	
	   
	if(q.equals("is")) {
		 for (String w : tokens) {
			 if(w.equals("fasting")) {
				 ans = "ABSOLUTELY !!!!!!";
				 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
			 }
		 }
		 }
	
	if(q.equals("can")) {
		 for (String w : tokens) {
			 if(w.equals("filipino")) {
				 ans = "i'm not a language pot but Maligayang Ramadan...";
				 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                return;
			 }
		 }
		 }
	
	
	 for (String w : tokens) {
		 
		 
		 
		 for (String b : negfast) {
	            if (w.equals(b)) {
	                for (String s : tokens) {
	                    if ("traveling".equals(s)||"travelling".equals(s)) {
	                        index = (int) (Math.random() * trvlres.length);
	                        ans = trvlres[index];
	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                        return;
	                    }
	                }
	            }
	     }
		 
		 
		 
		
         for (String b : negfast) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * negres.length);
                 ans = negres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         
         for (String b : tme) {
             if (w.equals(b)) {
                 ans = "Ramadan starts about 11 days earlier each year due to the shorter Islamic lunar calendar, so it doesn’t have a fixed Gregorian date and cycles through the seasons";
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         
         for (String b : efcfast) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * efcres.length);
                 ans = efcres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         for (String b : imprfast) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * impres.length);
                 ans = impres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         
         if (w.equals("seasons")||w.equals("season")) {
             ans = "Ramadan shifts through the seasons over the years. Because it is based on the lunar calendar, which is about 11 days shorter than the solar calendar, Ramadan gradually moves earlier each year in relation to the Gregorian calendar";
             System.out.println(ANSI_BLUE + ans + ANSI_RESET);
             return;
         }
     
         
         for (String b : timefast) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * timeres.length);
                 ans = timeres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }

         for (String b : posfast) {
             if (w.equals(b)) {
                 for (String s : tokens) {
                     if (s.equals("not")) {
                         index = (int) (Math.random() * negres.length);
                         ans = negres[index];
                         System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                         return;
                     }
                 }
             }
         }
         
         for (String b : posfast) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * posres.length);
                 ans = posres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         for (String b : ppl) {
             if (w.equals(b)) {
                 index = (int) (Math.random() * negres.length);
                 ans = negres[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         
         for (String b : length) {
             if (w.equals(b)) {
                 ans = "the duration of Ramadan is based on the lunar cycle and is either 29 or 30 days, depending on the sighting of the moon";
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         
         for (String b : start) {
             if (w.equals(b)) {
            	 index = (int) (Math.random() * datansw.length);
                 ans = datansw[index];
                 System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                 return;
             }
         }
         for (String b : rule) {
	            if (w.equals(b)) {
	                ans = "fasting rules involve intending to fast, abstain from eating and drinking from dawn to dusk. Also, avoid jealousy, anger, complaining, and gossiping during this month";
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
         
         if ("mental".equals(w)) {
	            index = (int) (Math.random() * menben.length);
	            ans = menben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("social".equals(w)) {
	            index = (int) (Math.random() * socben.length);
	            ans = socben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("physical".equals(w)) {
	            index = (int) (Math.random() * phyben.length);
	            ans = phyben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("religious".equals(w)) {
	            index = (int) (Math.random() * relben.length);
	            ans = relben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

         for (String b : benfast) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * benres.length);
	                ans = benres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }

	        

	         for (String b : two) {
		            if (w.equals(b)) {
		                ans = "while there is only one Ramadan per Islamic year, its earlier occurrence each year in the Gregorian calendar can lead to it being observed in January and then again in December of the same Gregorian year";
		                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
		                return;
		            }
		        }

	 }
	 }



private void fast(ArrayList<String> tokens, String q) {
	
  
       String ans = "";
   	   int index = 0;
   	if (q.equals("who")) {
        for (String w : tokens) {
            for (String b : negfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * negres.length);
                    ans = negres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : posfast) {
                if (w.equals(b)) {
                    for (String s : tokens) {
                        if (s.equals("not")) {
                            index = (int) (Math.random() * negres.length);
                            ans = negres[index];
                            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                            return;
                        }
                    }
                }
            }

            for (String b : first) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * firstres.length);
                    ans = firstres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : posfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * posres.length);
                    ans = posres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }
        }
        
        
        index = (int) (Math.random() * posres.length);
        ans = posres[index];
        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	}   
    else if ("how".equals(q)) {
        for (String w : tokens) {
       if ("traveling".equals(w)||"travelling".equals(w)||"kilometers".equals(w)||"kilometers".equals(w)){
                    index = (int) (Math.random() * trvlres.length);
                    ans = trvlres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            
        
            for (String b : verbfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * verbres.length);
                    ans = verbres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }
            for (String b : imprfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * impres.length);
                    ans = impres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : timefast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * timeres.length);
                    ans = timeres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : enrgfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * enrgres.length);
                    ans = enrgres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : efcfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * efcres.length);
                    ans = efcres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }
        }

     
        ans ="muslims fast during Ramadan from dawn until sunset. The fast involves abstaining from eating, drinking, and even bad habits. The process starts before dawn with a pre-fast meal called Suhoor, the fast is broken at sunset with the Iftar meal";
        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
    }
	
	   
   	else if ("why".equals(q)) {
        for (String w : tokens) {
            for (String b : imprfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * impres.length);
                    ans = impres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : negfast) {
                if (w.equals(b)) {
                    ans =  "exemptions from fasting are granted to certain individuals in Islam to prevent harm to those who may not be physically capable of enduring the fast without risking their health. The guiding principle is that fasting should not cause physical harm or undue difficulty, reflecting the religion's emphasis on mercy and compassion";;
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }

            for (String b : dayfast) {
                if (w.equals(b)) {
                	  index = (int) (Math.random() * impres.length);
                      ans = impres[index];
                      System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                      return;
                }
            }
            
            for (String b : posfast) {
                if (w.equals(b)) {
                	  index = (int) (Math.random() * impres.length);
                      ans = impres[index];
                      System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                      return;
                }
            }

            
        }

       
        index = (int)(Math.random() * impres.length);
		ans = impres[index];
        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
    }
	   
   	else if ("what".equals(q)) {
   	    for (String w : tokens) {
   	        for (String b : purpfast) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * impres.length);
   	                ans = impres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	        for (String b : efcfast) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * efcres.length);
   	                ans = efcres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	        for (String b : rule) {
   	            if (w.equals(b)) {
   	                ans = "fasting rules involve intending to fast, abstain from eating and drinking from dawn to dusk. Also, avoid jealousy, anger, complaining, and gossiping during this month";
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	     if ("mental".equals(w)) {
	            index = (int) (Math.random() * menben.length);
	            ans = menben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("social".equals(w)) {
	            index = (int) (Math.random() * socben.length);
	            ans = socben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("physical".equals(w)) {
	            index = (int) (Math.random() * phyben.length);
	            ans = phyben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        if ("religious".equals(w)) {
	            index = (int) (Math.random() * relben.length);
	            ans = relben[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

   	        for (String b : benfast) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * benres.length);
   	                ans = benres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	     
   	        for (String b : timefast) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * timeres.length);
   	                ans = timeres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }
   	        
   	     for (String b : negfast) {
	            if (w.equals(b)) {
	                ans = "In Islam, not fasting during Ramadan without a valid reason is considered a serious violation of religious duties. If someone capable doesn't fast without a valid excuse, they are expected to make up the missed days later and may need to seek forgiveness through repentance or additional acts of charity";
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
   	    }

   	    
   	    index = (int) (Math.random() * impres.length);
   	    ans = impres[index];
   	    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	}
   	else if ("where".equals(q)) {
   	    for (String w : tokens) {
   	        for (String b : negfast) {
   	            if (w.equals(b)) {
   	                for (String s : tokens) {
   	                    if ("traveling".equals(s)||"travelling".equals(s)) {
   	                        index = (int) (Math.random() * trvlres.length);
   	                        ans = trvlres[index];
   	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                        return;
   	                    }
   	                }
   	            }
   	        }

   	        for (String b : negfast) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * whereres.length);
   	                ans = whereres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }
   	    }

   	    ans = "Muslims fast wherever they are during Ramadan, whether at home or work. Fasting is a worship that can be observed in any location. However, they often break the fast and perform prayers in a communal setting, such as a family home, mosque, or community center, to foster a sense of community";
   	    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	}

   	else if ("when".equals(q)) {
   	    for (String w : tokens) {
   	        for (String b : start) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * startres.length);
   	                ans = startres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	     for (String b : negfast) {
	            if (w.equals(b)) {
	                for (String s : tokens) {
	                    if ("traveling".equals(s)||"travelling".equals(s)) {
	                        index = (int) (Math.random() * trvlres.length);
	                        ans = trvlres[index];
	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                        return;
	                    }
	                }
	            }
   	     }
   	        for (String b : negfast) {
   	            if (w.equals(b)) {
   	                for (String s : tokens) {
   	                    if ("travelling".equals(s)) {
   	                        index = (int) (Math.random() * trvlres.length);
   	                        ans = trvlres[index];
   	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                        return;
   	                    }
   	                }
   	                index = (int) (Math.random() * negres.length);
   	                ans = negres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }

   	        for (String b : end) {
   	            if (w.equals(b)) {
   	                index = (int) (Math.random() * endres.length);
   	                ans = endres[index];
   	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	                return;
   	            }
   	        }
   	    }

   	   
   	    ans = "The timing of fasting during Ramadan is from dawn until sunset, regardless of location, and this time frame shifts slightly each day as the lunar calendar progresses.";
   	    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
   	}
} 


private void raka(ArrayList<String> tokens) {
	
	 String ans = "";
	    int index;

	    for (String w : tokens) {
	    	for (String s : mean) {
	            ans = "(Raka) or (rakat) refers to the units of prayer in Islam. Each raka includes a sequence of movements";
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }
	        if (w.equals("many") || w.equals("number")) {
	            index = (int) (Math.random() * rakat.length);
	            ans = rakat[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }
	    }

	    Random(); 
	}
private void qadr(ArrayList<String> tokens) {
	
	  String ans = "";
	    int index;

	    for (String w : tokens) {
	        for (String b : spec) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * qader.length);
	                ans = qader[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }


	        for (String b : mean) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * qader.length);
	                ans = qader[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }


	        for (String b : qad) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * qadans.length);
	                ans = qadans[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	    }

	    Random(); 
	}
private void prayer(ArrayList<String> tokens) {
	
	  String ans = "";
	    int index;

	    for (String w : tokens) {
	        for (String b : spec) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * specres.length);
	                ans = specres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }

	        if (w.equals("rakats") || w.equals("units") || w.equals("rakaa") || w.equals("rakat")) {
	            index = (int) (Math.random() * rakat.length);
	            ans = rakat[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        for (String b : mean) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * tarawih.length);
	                ans = tarawih[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }

	        if (w.equals("leads") || w.equals("lead") || w.equals("guide") || w.equals("guides")) {
	            index = (int) (Math.random() * tarawih.length);
	            ans = tarawih[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        for (String b : perform) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * rakat.length);
	                ans = rakat[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	    }

	    Random(); 
	}
public void ramadan(ArrayList<String> tokens, String q) {
	
	String ans = "";
	int index = 0;
	
	
	if ("how".equals(q)) {
	    for (String w : tokens) {
	        for (String b : date) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * datansw.length);
	                ans = datansw[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	        
	        if(w.equals("long")||w.equals("many")) {
	        	ans="Ramadan lasts for one lunar month, which is typically 29 or 30 days, depending on the sighting of the moon. The exact duration varies each year because the Islamic calendar is based on the lunar cycle";
	        	System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                return;
	        }
	        
	        for (String b : verbfast) {
                if (w.equals(b)) {
                    index = (int) (Math.random() * verbres.length);
                    ans = verbres[index];
                    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
                    return;
                }
            }
		        if ("celebrated".equals(w) || "celebrate".equals(w) || "celebrates".equals(w) || "celebration".equals(w)) {
		            index = (int) (Math.random() * clbr.length);
		            ans = clbr[index];
		            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
		            return;
		        }
	    }
	} else if ("why".equals(q)) {
	    for (String w : tokens) {
	        for (String b : date) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * rmdate.length);
	                ans = rmdate[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	        for (String b : date) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * impres.length);
	                ans = impres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	        
	            if (w.equals("called")|| w.equals("named")) {
	                ans = "Ramadan comes from the Arabic \"ramida,\" meaning scorching heat, reflecting its initial occurrence during a hot period in the Arabian Peninsula. Despite seasonal shifts, the name endures, symbolizing the Islamic fasting month";
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	    
	} else if ("what".equals(q)) {
	    for (String w : tokens) {
	        for (String b : mean) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * rmdan.length);
	                ans = rmdan[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }	

	        for (String b : wear) {
	            if (w.equals(b)) {
	                for (String s : tokens) {
	                    if (s.equals("male") || s.equals("males") || s.equals("man")||s.equals("men")) {
	                        ans = "men wear thobe which is a long, lightweight robe ideal for the hot climate, often white or in light colors for coolness";
	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                        return;
	                    }
	                    else if(s.equals("female") || s.equals("females") || s.equals("woman")||s.equals("womens")||s.equals("women")){
	                    	ans = "womens wear jalabiya, which is a wide, flowing dress, with embroidery and colorful patterns";
	                        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                        return;
	                    }
	                    }
	                
	                ans = "men wear thobe which is a long robe, often white or in light colors for coolness. Women's jalabiya is a wide, flowing dress, typically more decorated than thobes, with embroidery and colorful patterns";;
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	    }
	        index = (int) (Math.random() * rmdan.length);
	        ans = rmdan[index];
	   	    System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	   	    return;
	      
	}else if ("where".equals(q)) {
	    for (String w : tokens) {
	        if ("celebrated".equals(w) || "celebrate".equals(w) || "celebrates".equals(w) || "celebration".equals(w)) {
	            index = (int) (Math.random() * clbr.length);
	            ans = clbr[index];
	            System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	            return;
	        }

	        for (String b : negfast) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * whereres.length);
	                ans = whereres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	    }
	} else if ("when".equals(q)) {
	    for (String w : tokens) {
	        for (String b : date) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * datansw.length);
	                ans = datansw[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }

	        for (String b : end) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * endres.length);
	                ans = endres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }

	        for (String b : start) {
	            if (w.equals(b)) {
	                index = (int) (Math.random() * startres.length);
	                ans = startres[index];
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }    
	          
	        
	        
	        for (String b : two) {
	            if (w.equals(b)) {
	                ans = "in 2030, it is  a rare situation that happens approximately every 33 years due to the 11-day difference between the lunar and solar calendars";
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        }
	        
	        for (String b : first) {
	            if (w.equals(b)) {
	                ans = "Ramadan was established a long time ago but became mandatory for Muslims two years after the Prophet Muhammad's migration to Medina. This change followed a revelation that instituted fasting as a key pillar of Islam for all adult Muslims.";
	                System.out.println(ANSI_BLUE + ans + ANSI_RESET);
	                return;
	            }
	        
	    }}
	    index = (int) (Math.random() * datansw.length);
        ans = datansw[index];
        System.out.println(ANSI_BLUE + ans + ANSI_RESET);
        return;
	}
	Random(); 
	 
}
}
	    
	 

