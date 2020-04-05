package com.pattern.observer.util;

public class ObserverPattern {

    public static void main(String... s) {
        NewspaperPublisher publisher = new NewspaperPublisher();
        EnglishNewspaperSubscriber english = new EnglishNewspaperSubscriber(publisher);
        HindiNewspaperSubscriber hindi = new HindiNewspaperSubscriber(publisher);

        publisher.setHeadlines( "FIFA U-17 Women's World Cup In India Postponed Due To Coronavirus",
                "भारत में पहली बार होने वाला अंडर-17 महिला फुटबॉल वर्ल्ड कप अनिश्चितकाल के लिए टला");

        publisher.deleteObserver(english);

        publisher.setHeadlines( "Hockey India announces additional Rs 75 lakhs donation to PM Cares Fund",
                "फुटबॉलर नेमार ने यूनिसेफ को 7.5 करोड़ रुपए दिए, इंग्लिश क्रिकेटर्स ने 4 करोड़ रु. से ज्यादा जुटाए");
    }
}
