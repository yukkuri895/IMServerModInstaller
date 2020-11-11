package ims;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.*;
public class Main extends JFrame {
    Main() {
        getContentPane().setLayout(new FlowLayout());


        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l6 = new JLabel("必須Forgeバージョン : ");
        JLabel l7 = new JLabel("forge-1.12.2-14.23.5.2847");
        l7.setForeground(Color.BLUE.darker());
        l7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        l7.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // ラベルをクリックしたとき
                try {

                    Desktop.getDesktop().browse(new URI("https://files.minecraftforge.net/maven/net/minecraftforge/forge/1.12.2-14.23.5.2847/forge-1.12.2-14.23.5.2847-installer.jar"));

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        p0.add(l6);
        p0.add(l7);



        JButton jb1 = new JButton("必須Modダウンロード");

        JButton jb2 = new JButton("プログラム終了");

        JButton jb3 = new JButton("おすすめModダウンロード");

        JLabel l4 = new JLabel("©2017-2020 IMS Dev");
        JLabel l5 = new JLabel("Version : 1.3.3_Os");

        JPanel p3 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        p6.add(l5);
        p4.add(jb1);
        p4.add(jb3);
        p4.add(jb2);
        p5.add(l4);


        //jb1はメインDL
        //jb1がクリックされたら
        jb1.addActionListener(ev -> {			//以下のことをする

            String osname = System.getProperty("os.name");
            // Windowsであったときの処理
            if(osname.contains("Windows")){
                String userhome = System.getProperty("user.home");
                try {
                    URL url1 = new URL("https://media.forgecdn.net/files/3014/827/IC2Classic+1.12-1.5.5.1.jar");
                    //IC2クラシック
                    URL url2 = new URL("https://media.forgecdn.net/files/2914/534/buildcraft-all-7.99.24.6.jar");
                    //BC_All




                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();




                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();



                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    

                    // Input Stream
                    DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());
                    DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());
                    



                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"IC2Classic+1.12-1.5.5.1.jar")));

                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"buildcraft-all-7.99.24.6.jar")));

                    

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }
                    
                    
                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    
                    
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。 ");
                }

                // Linuxであったときの処理
            } else if(osname.contains("Linux")){
                String userhome = System.getProperty("user.home");
                try {
                    URL url1 = new URL("https://media.forgecdn.net/files/3014/827/IC2Classic+1.12-1.5.5.1.jar");
                    //IC2クラシック
                    URL url2 = new URL("https://media.forgecdn.net/files/2914/534/buildcraft-all-7.99.24.6.jar");
                    //BC_All





                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();




                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();
                    



                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }


                    // Input Stream
                    DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());
                    DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());
                    



                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"IC2Classic+1.12-1.5.5.1.jar")));

                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"buildcraft-all-7.99.24.6.jar")));

                    

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }
                    
                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。");
                }
                // MacOSであったときの処理
            } else if(osname.contains("Mac")){
                String userhome = System.getProperty("user.home");
                JOptionPane.showMessageDialog(null, "Modファイルのダウンロードを開始しました。完了ダイアログが表示されるまでプログラムを終了しないで下さい。");
                try {
                    URL url1 = new URL("https://media.forgecdn.net/files/3014/827/IC2Classic+1.12-1.5.5.1.jar");
                    //IC2クラシック
                    URL url2 = new URL("https://media.forgecdn.net/files/2914/534/buildcraft-all-7.99.24.6.jar");
                    //BC_All
                    




                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();



                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();
                    


                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    

                    // Input Stream
                    DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());
                    DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());
                    



                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/IC2Classic+1.12-1.5.5.1.jar")));

                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/buildcraft-all-7.99.24.6.jar")));





                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }


                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力エラーが発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"原因不明のエラーが発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。");
                }

                // その他の環境だったときの処理
            } else {
                JOptionPane.showMessageDialog(null, "申し訳ございません。"+osname+"には未対応です。");


            }
        });


        //jb3はおすすめModDL
        //jb3がクリックされたら
        jb3.addActionListener(eve -> {			//以下のことをする
            String osname = System.getProperty("os.name");
            //winだったとき
            if(osname.contains("Windows")) {
                String userhome = System.getProperty("user.home");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("http://mcc.mcsv.jp/Files/IntelliInput/IntelliInput-2.6-for1.12.2.jar");
                    URL urlo6 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();
                    
                    HttpURLConnection cono6 =
                            (HttpURLConnection) urlo6.openConnection();
                    cono6.setAllowUserInteraction(false);
                    cono6.setInstanceFollowRedirects(true);
                    cono6.setRequestMethod("GET");
                    cono6.connect();

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();
                                        int http6 = cono6.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                                        if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());
                                        DataInputStream In6
                            = new DataInputStream(
                            cono6.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"IntelliInput-2.6-for1.12.2.jar")));
                                                        DataOutputStream Out6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"CodeChickenLib-1.12.2-3.2.3.358-universal.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In5.read(b))){
                        Out5.write(b, 0, readByte);
                    }
                                        while(-1 != (readByte = In6.read(b))){
                        Out6.write(b, 0, readByte);
                    }

                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();
                    In5.close();
                    Out5.close();
                                        In6.close();
                    Out6.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力エラーが発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"原因不明のエラーが発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。");
                }

            }else if(osname.contains("Mac")){
                String userhome = System.getProperty("user.home");
                JOptionPane.showMessageDialog(null, "Modファイルのダウンロードを開始しました。完了ダイアログが表示されるまでプログラムを終了しないで下さい。");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("https://media.forgecdn.net/files/2540/534/CocoaInput-%5b1.9-1.12.2%5d-3.1.5.jar");
                                        URL urlo6 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();
                    
                                        HttpURLConnection cono6 =
                            (HttpURLConnection) urlo6.openConnection();
                    cono6.setAllowUserInteraction(false);
                    cono6.setInstanceFollowRedirects(true);
                    cono6.setRequestMethod("GET");
                    cono6.connect();

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();
                                        int http6 = cono6.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                                        if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());
                                                DataInputStream In6
                            = new DataInputStream(
                            cono6.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CocoaInput-[1.9-1.12.2]-3.1.5.jar")));
                                    DataOutputStream Out6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CodeChickenLib-1.12.2-3.2.3.358-universal.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In5.read(b))){
                        Out5.write(b, 0, readByte);
                    }
                                        while(-1 != (readByte = In6.read(b))){
                        Out6.write(b, 0, readByte);
                    }
                    

                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();
                    In5.close();
                    Out5.close();
                                        In6.close();
                    Out6.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力エラーが発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"原因不明のエラーが発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。");
                }

            }else if(osname.contains("Linux")){
                String userhome = System.getProperty("user.home");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("https://media.forgecdn.net/files/2540/534/CocoaInput-%5b1.9-1.12.2%5d-3.1.5.jar");
                                        URL urlo6 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();
                    
                    HttpURLConnection cono6 =
                            (HttpURLConnection) urlo6.openConnection();
                    cono6.setAllowUserInteraction(false);
                    cono6.setInstanceFollowRedirects(true);
                    cono6.setRequestMethod("GET");
                    cono6.connect();
                    

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();
                                        int http6 = cono6.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                                        if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());
                                                DataInputStream In6
                            = new DataInputStream(
                            cono6.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CocoaInput-[1.9-1.12.2]-3.1.5.jar")));
                                                        DataOutputStream Out6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CodeChickenLib-1.12.2-3.2.3.358-universal.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In5.read(b))){
                        Out5.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In6.read(b))){
                        Out6.write(b, 0, readByte);
                    }


                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();
                    In5.close();
                    Out5.close();
                                        In6.close();
                    Out6.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力エラーが発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"原因不明のエラーが発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロード処理が終了しました。");
                }

            }else{
                JOptionPane.showMessageDialog(null,"申し訳ございません。"+osname+"には未対応です。");

            }
        });
        
        
        //jb2がクリックされたら
        jb2.addActionListener(even -> {			//以下のことをする
            System.exit(0);				// プログラムを終了
        });

        Container contentPane = getContentPane();			//コンテンツパネルの位置設定↓
        contentPane.add(p0, BorderLayout.NORTH);			//p0をNORTHに設定
        contentPane.add(p1, BorderLayout.NORTH);			//p1をNORTHに設定
        contentPane.add(p2, BorderLayout.NORTH);			//p2をNORTHに設定
        contentPane.add(p3, BorderLayout.SOUTH);			//p3をSOUTHに設定
        contentPane.add(p4, BorderLayout.SOUTH);			//p4をSOUTHに設定
        contentPane.add(p5, BorderLayout.SOUTH);			//p5をSOUTHに設定
        contentPane.add(p6, BorderLayout.SOUTH);			//p6をSOUTHに設定

        //以下、ウィンドウ設定


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ウィンドウを閉じたらプログラム終了
        setTitle("IMSModDownloader OpenSourceEdition 1.3.4_Os");	//ウィンドウタイトル設定
        setSize(625, 400);						//ウィンドウサイズ設定
        setLocationRelativeTo(null);		//ウィンドウ位置設定(中央)
        setVisible(true);							//ウィンドウ可視化
    }



    public static void main(String[] args) {
        new Main();															//ウィンドウ作成(なぜ最後に？)
    }
}
