package com.ant.antool;

import org.junit.Test;

public class EncryptToolTest {
    private EncryptTool encryptTool = EncryptTool.getInstance();

    @Test
    public void MD5() {
        System.out.println(encryptTool.MD5("123456"));
        System.out.println(encryptTool.MD5("abcdefj"));
        System.out.println(encryptTool.MD5("aa@!..890"));
        System.out.println(encryptTool.MD5("890-1+;;;"));
        System.out.println(encryptTool.MD5("1234+234+234+234+234+234+234+234+234+234+234+234+234+++--123{}\3#\\##+;;;"));
    }

    @Test
    public void MD51() {
        System.out.println(encryptTool.MD5("123456", "abc"));
        System.out.println(encryptTool.MD5("abcdefj", "abc1"));
        System.out.println(encryptTool.MD5("aa@!..890", "ab213c"));
        System.out.println(encryptTool.MD5("890-1+;;;", "ab123c"));
        System.out.println(encryptTool.MD5("890-1+;;;", "ab123c"));
    }

    @Test
    public void SHA1() {
        System.out.println(encryptTool.SHA1("123456"));
        System.out.println(encryptTool.SHA1("abcdefj"));
        System.out.println(encryptTool.SHA1("aa@!..890"));
        System.out.println(encryptTool.SHA1("890-1+;;;"));
        System.out.println(encryptTool.SHA1("890-1+;;;"));
    }

    @Test
    public void SHA11() {
        System.out.println(encryptTool.SHA1("123456","abc"));
        System.out.println(encryptTool.SHA1("abcdefj","abc"));
        System.out.println(encryptTool.SHA1("aa@!..890","abc"));
        System.out.println(encryptTool.SHA1("890-1+;;;","ab1"));
        System.out.println(encryptTool.SHA1("890-1+;;;","abc"));
    }

    @Test
    public void DESencode() {
        System.out.println(encryptTool.DESencode("123456","admin"));
        System.out.println(encryptTool.DESencode("abcl____20--","admin"));
        System.out.println(encryptTool.DESencode("a-ad-fa-l;ajlkf","admin"));
        System.out.println(encryptTool.DESencode("slkjflsk,x;;;","admin"));
        System.out.println(encryptTool.DESencode("@@##lcl","admin"));
    }

    @Test
    public void DESdecode() {
        System.out.println(encryptTool.DESdecode("D0C71147E3A1E037","admin"));
        System.out.println(encryptTool.DESdecode("AE0789C45F53E555E2450253D24F6E84","admin"));
        System.out.println(encryptTool.DESdecode("820841C02CD2960A7C4BFBB7907EC955","admin"));
        System.out.println(encryptTool.DESdecode("407FF6408FB00ACD356CC16591A7ECE9","admin"));
        System.out.println(encryptTool.DESdecode("DEF913805D1869B0","admin"));
    }

    @Test
    public void AESencode() {
        System.out.println(encryptTool.AESencode("123456","2332"));
        System.out.println(encryptTool.AESencode("abcl____20--","1111"));
        System.out.println(encryptTool.AESencode("a-ad-fa-l;ajlkf","333"));
        System.out.println(encryptTool.AESencode("slkjflsk,x;;;","2"));
        System.out.println(encryptTool.AESencode("lcl","lksjdalkfool"));
    }

    @Test
    public void AESdecode() {
        System.out.println(encryptTool.AESdecode("95DB57FF72BF4B6F81779908319C042A",""));
        System.out.println(encryptTool.AESdecode("2AE71091B3964BD609F6B70D3895B81C",""));
        System.out.println(encryptTool.AESdecode("C1CDAF5B2B58C846AFFFA87C2D9638CA",""));
        System.out.println(encryptTool.AESdecode("1A973FD162B029FF4D9844A1D0263A60",""));
        System.out.println(encryptTool.AESdecode("844C17D75696A206337B5518E509A5F0",""));
    }

    @Test
    public void XORencode() {
        System.out.println(encryptTool.XORencode("",""));
        System.out.println(encryptTool.XORencode("",""));
        System.out.println(encryptTool.XORencode("",""));
        System.out.println(encryptTool.XORencode("",""));
        System.out.println(encryptTool.XORencode("",""));
    }

    @Test
    public void XORdecode() {
    }

    @Test
    public void XOR() {
    }

    @Test
    public void base64Encode() {
    }

    @Test
    public void base64Decode() {
    }
}