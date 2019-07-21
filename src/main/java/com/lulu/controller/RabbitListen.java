package com.lulu.controller;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class RabbitListen
{
    @RabbitListener(bindings = {@QueueBinding(value = @Queue(value = "myQueue"), exchange =@Exchange("t1"))})
    public void listen(String mes)
    {
        PrintWriter printWriter=null;
        System.out.println("rabbit:::"+mes);
        File file=new File("C:\\slog.txt");
        try
        {
            FileWriter fileWriter=new FileWriter(file,true);
            printWriter=new PrintWriter(fileWriter);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        printWriter.println(mes);
        printWriter.flush();
        printWriter.close();
    }
    @RabbitListener(bindings = {@QueueBinding(value = @Queue(value = "orderQueue"), exchange =@Exchange("t2"))})
    public void listenOrder(String mes)
    {
        PrintWriter printWriter=null;
        System.out.println("rabbit:::"+mes);
        File file=new File("C:\\orderlog.txt");
        try
        {
            FileWriter fileWriter=new FileWriter(file,true);
            printWriter=new PrintWriter(fileWriter);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        printWriter.println(mes);
        printWriter.flush();
        printWriter.close();

    }
}
