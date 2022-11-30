package Mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import static javax.mail.Session.getDefaultInstance;

public class EmailSender {
    public EmailSender(String text) throws IOException, MessagingException {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\Users\\user\\IdeaProjects\\ppl4\\src\\Mail\\mail.properties"));
        new PersonalData();

        Session mailSession=Session.getDefaultInstance(properties);
        MimeMessage msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(PersonalData.login));
        msg.addRecipient(Message.RecipientType.TO, new InternetAddress("t93032247@gmail.com"));
        msg.setSubject("Log Error");
        msg.setText(text);

        Transport transport = mailSession.getTransport();
        transport.connect(null,PersonalData.password);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
    }
}
